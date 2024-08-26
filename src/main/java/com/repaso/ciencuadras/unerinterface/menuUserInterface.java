package com.repaso.ciencuadras.unerinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class menuUserInterface {


    public static final Target BTN_MENU = Target.the("Boton menu").located(By.xpath("//a[@title='StartSharp']"));
    public static final Target BTN_NORTWIND = Target.the("Boton Registrarse").located(By.xpath("//span[contains(text(),'Northwind')]"));
    public static final Target BTN_CLIENTES= Target.the("Boton Propietario").located(By.xpath("(//span[contains(text(),'Customers')])[1]"));

    public static final Target BTN_NUEVO_CLIENTE= Target.the("Boton Propietario").located(By.xpath("//div[@data-action='add']"));

}
