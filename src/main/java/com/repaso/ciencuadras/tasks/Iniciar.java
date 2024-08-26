package com.repaso.ciencuadras.tasks;

import com.repaso.ciencuadras.models.DatosSesion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.repaso.ciencuadras.unerinterface.incioSesionUserInterface.*;


public class Iniciar implements Task {


    private final DatosSesion datosSesion;

    public Iniciar(DatosSesion datosSesion){this.datosSesion = datosSesion;}
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(datosSesion.getUsuario()).into(TXT_USUARIO),
                Enter.theValue(datosSesion.getClave()).into(TXT_CLAVE),
                Click.on(BTN_INICIARSESION));

    }

    public static Iniciar sesion(DatosSesion datosSesion){
        return Tasks.instrumented(Iniciar.class,datosSesion);
    }
}
