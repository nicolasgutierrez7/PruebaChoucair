package com.repaso.ciencuadras.unerinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class registroUserInterface {


    public static final Target BTN_INGRESAR = Target.the("Boton Ingresar").located(By.xpath("(//span[contains(text(),'Ingresar')])[1]"));
    public static final Target BTN_REGISTRARSE = Target.the("Boton Registrarse").located(By.xpath("//a[contains(text(),'Regístrate')]"));
    public static final Target BTN_PROPIETARIO = Target.the("Boton Propietario").located(By.xpath("//span[contains(text(),' Propietario ')]"));
    public static final Target TXT_NUMERO_DOCUMENTO = Target.the("Numero Documento").located(By.xpath("//input[@formcontrolname='customerDocument']"));
    public static final Target TXT_NOMBRE_COMPLETO = Target.the("Nombre Completo").located(By.xpath("//input[@formcontrolname='customerName']"));
    public static final Target TXT_CORREO_ELECTRONICO = Target.the("Correo Electronico").located(By.xpath("//input[@formcontrolname='customerEmail']"));
    public static final Target TXT_CLAVE = Target.the("Contraseña").located(By.xpath("//input[@formcontrolname='password']"));
    public static final Target TXT_CONFIRMAR_CLAVE= Target.the("Confirmacion Contraseña").located(By.xpath("//input[@formcontrolname='confirmPass']"));
    public static final Target BTN_NO_SOY_ROBOT= Target.the("Boton ckeck no soy robot").located(By.xpath("//span[@role='checkbox']"));
    public static final Target BTN_REGISTRARME = Target.the("Boton registrarme").located(By.xpath("//span[contains(text(),'Registrarme')]"));
    public static final Target BOTON_SESION = Target.the("Boton de la sesion").located(By.xpath("//a[@id='circleButton']"));
    public static final Target NAME_SESION = Target.the("Nombre de la sesion").located(By.xpath("//p[contains(text(),'nsgutierrez011@gmail.com')]"));



}
