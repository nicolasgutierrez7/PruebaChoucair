package com.repaso.ciencuadras.unerinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class registroUserInterface {


    public static final Target TXT_ID_CLIENTE = Target.the("Boton Ingresar").located(By.xpath("//input[@name='CustomerID']"));
    public static final Target TXT_COMPANY_NAME = Target.the("Boton Registrarse").located(By.xpath("//input[@name='CompanyName']"));
    public static final Target TXT_CONTAC_NAME = Target.the("Boton Propietario").located(By.xpath("//input[@name='ContactName']"));
    public static final Target TXT_CONTAT_TITLE = Target.the("Numero Documento").located(By.xpath("//input[@name='ContactTitle']"));
    public static final Target SELECT_REPRESENTATIVE = Target.the("Nombre Completo").located(By.xpath("//input[@id='s2id_autogen10']"));
    public static final Target OPTION_REPRESENTATIVE = Target.the("Nombre Completo").located(By.xpath("//div[@id='select2-result-label-59']"));

    public static final Target BTN_SAVE= Target.the("Boton ckeck no soy robot").located(By.xpath("//div[@data-action='save-and-close']"));

    public static final Target BTN_SEARCH= Target.the("Boton ckeck no soy robot").located(By.xpath("(//input[@placeholder='search...'])[2]"));


}
