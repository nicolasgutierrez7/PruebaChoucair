package com.repaso.ciencuadras.questions;

import com.repaso.ciencuadras.models.DatosPropietario;
import com.repaso.ciencuadras.tasks.Utilidades;
import com.repaso.ciencuadras.unerinterface.registroUserInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import static com.repaso.ciencuadras.enums.ConstantesNumericas.*;
import static com.repaso.ciencuadras.unerinterface.registroUserInterface.*;

public class ValidarSesion implements Question<Boolean> {

    DatosPropietario datosPropietario;

    public ValidarSesion(DatosPropietario datosPropietario) {
        this.datosPropietario = datosPropietario;
    }

    public static ValidarSesion toThe(DatosPropietario datosPropietario) {
        return new ValidarSesion(datosPropietario);
    }

    @Override
    public Boolean answeredBy(Actor actor) {


        actor.attemptsTo(
                Click.on(BOTON_SESION));
        String valor = datosPropietario.getCorreo();
        boolean result;
        String nameSesion = Text.of(registroUserInterface.NAME_SESION).answeredBy(actor);
        System.out.println("Nombre de la sesion extraida : " + nameSesion);

        if (valor.equals(nameSesion)) {
            result = true;
            System.out.println(datosPropietario.getCorreo());
        } else {
            result = false;

        }
        return result;
    }
}
