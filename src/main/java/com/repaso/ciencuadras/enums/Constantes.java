package com.repaso.ciencuadras.enums;

public enum Constantes {

    USER_DIR("user.dir"),
    URL_CIENCUADRAS ("https://www.ciencuadras.com/arriendo?utm_source=google&utm_medium=cpc&utm_campaign=arriendormkt&utm_content=search&gad_source=1&gclid=EAIaIQobChMIttWvmu-EiAMV7bdaBR1KsQd-EAAYASAAEgKwyvD_BwE"),
    MENSAJE_ERROR_LECTURA_ARCHIVO("No se logró leer el archivo de forma exitosa"),

    DATOS_PROPIETARIO("datosPropietario"),

    RUTA_INFORMACION_PORPIETARIO(System.getProperty(USER_DIR.getValor()) + "\\src\\test\\resources\\json\\informacion_propietario.json"),

    SALTO_LINEA("\n");

    private final String valor;

    Constantes(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }



}
