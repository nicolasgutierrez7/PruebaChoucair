package com.repaso.ciencuadras.enums;

public enum Constantes {

    USER_DIR("user.dir"),
    URL_CIENCUADRAS ("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F"),
    MENSAJE_ERROR_LECTURA_ARCHIVO("No se logró leer el archivo de forma exitosa"),

    DATOS_PROPIETARIO("datoscliente"),
    DATOS_SESION("datosSesion"),
    RUTA_INFORMACION_PORPIETARIO(System.getProperty(USER_DIR.getValor()) + "\\src\\test\\resources\\json\\informacion_propietario.json"),
    RUTA_INFORMACION_SESION(System.getProperty(USER_DIR.getValor()) + "\\src\\test\\resources\\json\\informacion_Sesion.json"),

    SALTO_LINEA("\n");

    private final String valor;

    Constantes(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }



}
