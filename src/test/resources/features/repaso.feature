# language: es
Característica: Crear cuenta en la pagina de ciencuadras

  Antecedentes:
    Dado el usuario ha ingresado  a la pagina de cien cuadras

  @registro
  Esquema del escenario: crear cuenta propietario
    Cuando el usuario ingresa los datos para crear cuenta "<datosPropietario>"
    Entonces el usuario valida la creacion exitosa
    Ejemplos:
      | datosPropietario  |
      | datosPropietario1 |
