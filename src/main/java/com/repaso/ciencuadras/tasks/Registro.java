package com.repaso.ciencuadras.tasks;

import com.repaso.ciencuadras.models.DatosCliente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.repaso.ciencuadras.unerinterface.menuUserInterface.*;
import static com.repaso.ciencuadras.unerinterface.registroUserInterface.*;

public class Registro implements Task {


    private final DatosCliente datosCliente;

    public Registro(DatosCliente datosCliente){this.datosCliente = datosCliente;}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_MENU),
                Click.on(BTN_NORTWIND),
                Click.on(BTN_CLIENTES),
                Click.on(BTN_NUEVO_CLIENTE),
                Enter.theValue(datosCliente.getIdCliente()).into(TXT_ID_CLIENTE),
                Enter.theValue(datosCliente.getCompanyName()).into(TXT_COMPANY_NAME),
                Enter.theValue(datosCliente.getContactName()).into(TXT_CONTAC_NAME),
                Enter.theValue(datosCliente.getContactTytle()).into(TXT_CONTAT_TITLE),
                Enter.theValue(datosCliente.getRepresentative()).into(SELECT_REPRESENTATIVE),
                Click.on(OPTION_REPRESENTATIVE),
                Click.on(BTN_SAVE));


    }

    public static Registro propietario(DatosCliente datosCliente){
        return Tasks.instrumented(Registro.class, datosCliente);
    }
}
