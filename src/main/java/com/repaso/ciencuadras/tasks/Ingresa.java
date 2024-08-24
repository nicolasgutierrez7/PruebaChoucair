package com.repaso.ciencuadras.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static com.repaso.ciencuadras.enums.Constantes.URL_CIENCUADRAS;

public class Ingresa implements Task {

    public static Ingresa cienCuadras() {
        return Tasks.instrumented(Ingresa.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(URL_CIENCUADRAS.getValor()));
    }
}
