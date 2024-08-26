package com.repaso.ciencuadras.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DatosCliente {

    String idCliente;
    String companyName;
    String contactName;
    String contactTytle;
    String representative;

}
