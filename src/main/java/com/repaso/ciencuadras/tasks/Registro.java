package com.repaso.ciencuadras.tasks;

import com.repaso.ciencuadras.models.DatosPropietario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.repaso.ciencuadras.enums.ConstantesNumericas.*;
import static com.repaso.ciencuadras.unerinterface.registroUserInterface.*;

public class Registro implements Task {


    private final DatosPropietario datosPropietario;

    public Registro(DatosPropietario datosPropietario){this.datosPropietario = datosPropietario;}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_INGRESAR),
                Click.on(BTN_REGISTRARSE),
                Click.on(BTN_PROPIETARIO),
                Enter.theValue(datosPropietario.getCedula()).into(TXT_NUMERO_DOCUMENTO),
                Enter.theValue(datosPropietario.getNombre(),datosPropietario.getApellido()).into(TXT_NOMBRE_COMPLETO),
                Enter.theValue(datosPropietario.getCorreo()).into(TXT_CORREO_ELECTRONICO),
                Enter.theValue(datosPropietario.getClave()).into(TXT_CLAVE),
                Enter.theValue(datosPropietario.getClave()).into(TXT_CONFIRMAR_CLAVE),
                Utilidades.esperar(SESENTA),
                Click.on(BTN_REGISTRARME),
                Utilidades.esperar(DIEZ));


    }

    public static Registro propietario(DatosPropietario datosPropietario){
        return Tasks.instrumented(Registro.class,datosPropietario);
    }
}
