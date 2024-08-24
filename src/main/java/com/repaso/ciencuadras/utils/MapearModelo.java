package com.repaso.ciencuadras.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.CharSource;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class MapearModelo {
    public static <T> T deserializarJson(String fileName, Class<T> clase) throws IOException {
        InputStream is = CharSource.wrap(fileName).asByteSource(StandardCharsets.UTF_8).openStream();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(is, clase);
    }

    private MapearModelo(){}
}
