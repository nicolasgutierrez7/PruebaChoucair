package com.repaso.ciencuadras.utils;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Utilidades {

    public static Performable esperar(int segundos) {
        return Task.where("{0} espera por " + segundos + " segundos",
                actor -> {
                    try {
                        Thread.sleep(segundos * 1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
        );
    }
}
