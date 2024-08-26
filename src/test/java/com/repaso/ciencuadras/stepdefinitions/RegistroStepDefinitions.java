package com.repaso.ciencuadras.stepdefinitions;

import com.repaso.ciencuadras.models.DatosCliente;
import com.repaso.ciencuadras.tasks.Registro;
import com.repaso.ciencuadras.utils.MapearModelo;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;

import java.io.IOException;

import static com.repaso.ciencuadras.utils.LeerJson.leerDatosPropietario;

public class RegistroStepDefinitions {

    DatosCliente informacionPropietario;

    @Cuando("{actor} ingresa los datos para crear cuenta {string}")
    public void el_usuario_ingresa_los_datos_para_crear_cuenta(Actor actor, String datosPropietario) throws IOException {
        informacionPropietario = MapearModelo.deserializarJson(leerDatosPropietario(datosPropietario), DatosCliente.class);
        actor.attemptsTo(Registro.propietario(informacionPropietario));
    }


    @Entonces("{actor} valida la creacion exitosa")
    public void el_usuario_valida_la_creacion_exitosa(Actor actor) {
        //actor.should(GivenWhenThen.seeThat(ValidarSesion.toThe(informacionPropietario)));

    }

}
