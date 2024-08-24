package com.repaso.ciencuadras.stepdefinitions;

import com.repaso.ciencuadras.tasks.Ingresa;
import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PasosComunesStepDefinittions {


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
}
