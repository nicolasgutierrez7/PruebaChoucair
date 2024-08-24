package com.repaso.ciencuadras.utils;

import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.repaso.ciencuadras.enums.Constantes.*;
import static com.repaso.ciencuadras.enums.ConstantesNumericas.CERO;


public class LeerJson {
    private static final Logger LOGGER = Logger.getLogger(LeerJson.class);


    public static String leerArchivo(String filePath) {
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath))) {
            while ((line = br.readLine()) != null)
                stringBuilder.append(line).append(SALTO_LINEA.getValor());

        } catch (IOException ioException) {
            LOGGER.error(MENSAJE_ERROR_LECTURA_ARCHIVO.getValor());
        }
        return stringBuilder.toString();
    }

    public static String leerDatosPropietario(String informacion) {
        String archivo = leerArchivo(RUTA_INFORMACION_PORPIETARIO.getValor());
        JSONObject jsonObject = new JSONObject(archivo);
        JSONArray jsonArray = jsonObject.getJSONArray(DATOS_PROPIETARIO.getValor());
        String informacionPropietario;

        informacionPropietario = jsonArray.getJSONObject(CERO).getJSONObject(informacion).toString();

        return informacionPropietario;
    }




}
