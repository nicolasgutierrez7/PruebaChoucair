package com.repaso.ciencuadras.unerinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class incioSesionUserInterface {

    public static final Target TXT_USUARIO = Target.the("Boton Ingresar").located(By.xpath("//input[@name='Username']"));
    public static final Target TXT_CLAVE = Target.the("Boton Registrarse").located(By.xpath("//input[@name='Password']"));
    public static final Target BTN_INICIARSESION= Target.the("Boton Propietario").located(By.xpath("//button[@id='LoginPanel0_LoginButton']"));
}
