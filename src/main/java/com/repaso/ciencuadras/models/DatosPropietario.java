package com.repaso.ciencuadras.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DatosPropietario {

    String tipoDocumento;
    String cedula;
    String nombre;
    String apellido;
    String correo;
    String clave;
}
