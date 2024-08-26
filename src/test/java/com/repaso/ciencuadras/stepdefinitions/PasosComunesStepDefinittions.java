package com.repaso.ciencuadras.stepdefinitions;

import com.repaso.ciencuadras.models.DatosSesion;
import com.repaso.ciencuadras.tasks.Ingresa;
import com.repaso.ciencuadras.tasks.Iniciar;
import com.repaso.ciencuadras.tasks.Registro;
import com.repaso.ciencuadras.utils.MapearModelo;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;

import static com.repaso.ciencuadras.utils.LeerJson.leerDatosPropietario;
import static com.repaso.ciencuadras.utils.LeerJson.leerDatosSesion;

public class PasosComunesStepDefinittions {


    DatosSesion informacionSesion;
    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName);
    }


    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("{actor} ha ingresado  a la pagina de cien cuadras")
    public void el_usuario_ha_ingresado_a_la_pagina_de_cien_cuadras(Actor actor) {
      actor.attemptsTo(Ingresa.cienCuadras());
    }


    @Cuando("{actor} ingresa las credenciales {string}")
    public void el_usuario_ingresa_las_credenciales(Actor actor, String datosSesion) throws IOException {
        informacionSesion = MapearModelo.deserializarJson(leerDatosSesion(datosSesion),DatosSesion.class);
        actor.attemptsTo(Iniciar.sesion(informacionSesion));
    }

}
