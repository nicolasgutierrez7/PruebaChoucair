# language: es
Característica: Crear cuenta en la pagina de ciencuadras

  Antecedentes:
    Dado el usuario ha ingresado  a la pagina de cien cuadras

  @registro
  Esquema del escenario: crear cuenta propietario
    Cuando el usuario ingresa las credenciales "<datosSesion>"
    Y el usuario ingresa los datos para crear cuenta "<datoscliente>"
    Entonces el usuario valida la creacion exitosa
    Ejemplos:
      |datosSesion| datoscliente  |
      |datosSesion1| datoscliente1 |
