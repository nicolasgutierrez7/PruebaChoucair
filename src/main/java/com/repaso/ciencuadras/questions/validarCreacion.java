package com.repaso.ciencuadras.questions;

import com.repaso.ciencuadras.models.DatosCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class validarCreacion implements Question<Boolean> {

    DatosCliente datosCliente;

    public validarCreacion(DatosCliente datosCliente) {
        this.datosCliente = datosCliente;
    }

    public static validarCreacion toThe(DatosCliente datosCliente) {
        return new validarCreacion(datosCliente);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        return null;
    }
}
