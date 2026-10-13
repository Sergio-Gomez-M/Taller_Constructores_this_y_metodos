1. Análisis de constructores para la clase "Habitacion"
Habitacion(int n, String t) y Habitacion(int numero, String tipo): No pueden existir al mismo tiempo ya que poseen exactamente la misma firma (int, String). A Java no le importan los nombres de los parámetros, sino sus tipos y orden.
Habitacion(int n, String t) y Habitacion(String tipo, int numero): Sí pueden coexistir porque sus firmas son diferentes (int, String vs String, int).
Habitacion(int numero): Sí puede coexistir porque su firma es única (int).


2. Preguntas de Comprensión

1: ¿Qué diferencias hay entre un constructor y un método? Menciona al menos tres.
Nombre: El constructor tiene obligatoriamente el mismo nombre de la clase, mientras que los métodos pueden tener cualquier nombre válido.
Retorno: El constructor no declara ningún tipo de retorno (ni siquiera void), mientras que los métodos exigen definir un tipo de retorno (o void si no devuelven valor).
Ejecución: El constructor se ejecuta automáticamente una sola vez al instanciar el objeto con new, mientras que los métodos se invocan explícitamente cuantas veces se requiera sobre un objeto ya creado.

2: ¿Por qué new Paquete() dejó de compilar en la Etapa 2? ¿Qué harías si la empresa necesitara seguir creando paquetes sin datos?
Dejó de compilar porque en Java, si no defines ningún constructor, el sistema crea un constructor por defecto sin parámetros de forma automática. Al escribir un constructor personalizado con parámetros, el constructor por defecto deja de existir. Si se necesitaran crear paquetes vacíos, bastaría con agregar explícitamente el constructor sin parámetros public Paquete() {} en la clase.

3: ¿Qué ocurriría si en el constructor de Paquete escribieras peso = peso; en lugar de this.peso = peso;? ¿El programa compilaría?
El programa sí compilaría, pero ocurriría un error lógico de sombreado de variables. Al hacer peso = peso;, el parámetro local se asigna a sí mismo, dejando el atributo de la instancia desatendido con su valor por defecto (0.0). El uso de this.peso diferencia inequívocamente el atributo del objeto de los parámetros recibidos.

4: ¿Qué es la firma de un método y por qué el tipo de retorno no sirve para distinguir dos versiones sobrecargadas?
La firma está compuesta exclusivamente por el nombre del método y su lista de parámetros (cantidad, tipos y orden). El tipo de retorno no forma parte de la firma porque al invocar un método en el código, el programador puede optar por no capturar o ignorar el valor devuelto, lo que generaría ambigüedad en el compilador si dos métodos tuvieran idénticos parámetros y nombres.

5: ¿Qué ventaja tiene que los constructores abreviados de `Paquete` deleguen con this(...)en lugar de asignar los atributos ellos mismos?
La principal ventaja es aplicar el principio DRY (Don't Repeat Yourself). Al delegar en el constructor principal mediante this(...), toda la lógica de inicialización y asignación se centraliza en un único lugar. Si en el futuro se modifica la estructura del constructor principal, los constructores abreviados no requerirán cambios adicionales.
