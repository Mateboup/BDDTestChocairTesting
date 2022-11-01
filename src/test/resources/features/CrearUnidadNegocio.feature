#language: es
Característica: Crear Unidad de negocio y agendar reunión
  Yo como usuario en el sitio web StarSharp
  Deseo crear una unidad de negocio
  Para con ella poder agendar reuniones

  Esquema del escenario:Ingresar a StarSharp crear unidad de negocio y agendar reuniones

    Dado que un asesor se loguea al sitio web StarSharp
    Cuando el usuario cree una nueva unidad de negocio con nombre "TEST PRUEBA TECNICA CHOCAIR" con el negocio "Technology » R&D"
    Y agende una reunión
    | Nombre Reunión | <Nombre Reunión> |
    | Tipo Reunión   | <Tipo Reunión>   |
    | Fecha inicio   | <Fecha inicio>   |
    | Fecha fin      | <Fecha fin>      |
    | Ubicación      | <Ubicación>      |
    | Organizador    | <Organizador>    |
    | Asistentes     | <Asistentes>     |
    | Numero Reunión | <Numero Reunión> |
    | Unidad         | <Unidad>         |
    | Reportero      | <Reportero>      |

    Entonces la reunión debe quedar agendada exitosamente

    Ejemplos:
    |Nombre Reunión     |Tipo Reunión|Fecha inicio|Fecha fin |Ubicación|Organizador |Asistentes   |Numero Reunión|Unidad          |Reportero   |Reportero|
    |Test prueba tecnica1|General     |11/11/2022  |12/11/2022|On Site  |Aaron Taylor|Adam Edwards |1             |Technology » R&D|Alexis Lopez|         |










