# generalJava2019
Apuntes generales sobre algunas cuestiones de Java

## Resolver antes del viernes 25 de marzo de 2019, mencionándome en los commit
Contestar a las preguntas en el propio readme. Cuando se pida un programa, se puede añadir al repositorio

## 1. Operadores Booleanos

¿Qué diferencia hay en una expresión booleana entre & y &&?
¿Y entre | y ||?
Haz dos métodos booleanos que impriman algo en pantalla y un programa main que muestre la diferencia. Puedes hacer una
prueba más creativa usando
Thread.sleep(4000);
que recibe el número de milisegundos que espera el programa
¿Cuándo se usará uno u otro?

La diferencia entre & y && es que & siempre comprobará todas las condiciones aunque encuentre una falsa,
mientras que && comprobará las condiciones una por una y si encuentra una falsa parará.

Lo mismo pasa con | y || la diferencia entre ellos es que | comprobará todas las condiciones,
mientras que || cuando encuentre una verdadera te devolverá true.

Ej-->Ir a el paquete de Ejemplo1


## 2. Packages

¿Qué es un package en Java?
Un paquete en Java es un lugar el cual nos permite agrupar diferentes clases,y por tanto diferentes partes del programa.

¿Qué relación tiene con la sentencia import?
Tiene relación con la sentencia import ya que es necesario importar primero el paquete para usar las clases que
se encuentran dentro de él.

Crea un paquete llamado utilidades con una clase llamada Cadena con dos Métodos Estáticos:

* inicialEnMayúcula, que devuelve el String que se le pasa con el primer carácter en mayúsculas y el resto en minúsculas
* camelCase que devuelve las palabras (separadas por espacios) en camelCase (la primera palabra en minúsculas y el resto con la inicial en mayúsculas)

Crea, dentro de ese paquete llamado numeros con una clase llamada Numero con un  método Estático:

* esCuadradoPerfecto que devuelve si un entero que se le pasa es cuadrado perfecto (la raíz del número es un entero)
Crea un programa de ejemplo en otro paquete que importe y utilice esos métodos

## 3. Break y continue con etiquetas

Pon un programa de ejemplo de uso de break y/o continue con etiquetas

## 4. Finalize

¿Para qué sirve el método finalize() de la clase Object?


¿Cuándo es llamado?


¿Para qué se usa?


## 5. Métodos de la clase Math

Indica la signatura de los siguientes métodos de la clase Math y explica para qué sirve


abs-Calcula el valor absoluto de un número
    public static double abs(double a)
    public static float abs(float a)
    public static int abs(int a)
    public static long abs(long a)

max-Devuelve el mayor número que se le ha pasado como argumento
    public static double max(double arg1, double arg2)
    public static float max(float arg1, float arg2)
    public static int max(int arg1, int arg2)
    public static long max(long arg1, long arg2)

min-Devuelve el menor número que se le ha pasado como argumento
    public static double min(double arg1, double arg2)
    public static float min(float arg1, float arg2)
    public static int min(int arg1, int arg2)
    public static long min(long arg1, long arg2)

pow-Te permite realizar potencias,eleva el primer argumento al segundo
    public static double pow(double base, double exponente)

round-Redondea el número pasado como argumento
    public static long round(double d)
    public static int round(float f)

## 6. Inicilizadores


public class PruebaSleep {
  static{
    System.out.println("Una cadena");
  }
  {
       System.out.println("prueba");
     }
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Numeros: 1 2 3");
  }
}

En el programa anterior, ¿Cuál es la salida?
    Una cadena
    Numeros: 1 2 3
¿Cómo conseguimos que se imprima prueba?
    Cuando crees un objeto de la clase PruebaSleep
¿Cuantas veces se imprimirá en un programa "Una Cadena"?
    Cada vez que se carge la clase,es decir,una vez.
¿Y "prueba"?
    Se imprimira tantas veces como objetos de la clase PruebaSleep crees.

## 7. Recolector
¿Para qué sirve System.gc()?
Método que ejecuta el recolector de basuras del sistema.

¿Cuando se le llama?
Cuando quieres eliminar los objetos que se han quedado sin referencia.

¿Qué nos asegura?


## 8. Wrappers

¿Qué son los Wrappers?
    Los Wrappers son las clases de los datos primitivos.

¿Cuántos hay?
    Hay 8,uno por cada tipo de dato primitivo.

¿Para qué sirven?
    Los Wrappers sirven por ejmplo para usar los datos primitivos en estructuras de datos complejas como pueden ser las
    listas,los mapas,los grupos y las colas.

¿Qué constructores tienen?
    Byte(byte byte) .
    Short (short short).
    Integer (int integer)
    Long (long long).
    Boolean (boolean boolean).
    Float (float float).
    Double(double double)
    Character (char character).

¿Para qué sirven los métodos xxxValue()?


¿Para qué sirven y en qué se diferencian los métodos parseXxx y valueOf()?
La diferencia es que valueOf() nos devuelve un nuevo objeto del tipo que sea
mientras que parseXxx nos devuelve un valor primitivo.

La principal diferencia entre el método valueOf() y el parseXxx es que mientras que el valueOf() nos devuelve un 
nuevo objeto el método paseXxx nos devuelve un valor primitivo.

¿Qué es Boxing y Autoboxing?

Haz un programa de ejemplo que tome un color CSS en hexadecimal (#45AB34 o #FFF, por ejemplo) y devuelva el color en RGB decimal: #FFF sería 255,255,255

Supón que el color es siempre correcto (con seis o tres dígitos headecimales)

## 9. Concatenación de cadenas


¿Cómo hemos estado concatenado las cadenas durante el curso?
Usando el operador +.

¿Qué inconvenientes tiene ese método?


Busca un ejemplo de concatenación de cadenas con StringBuffer y otro con StringBuilder

¿Qué diferencia hay entre los dos métodos?
La diferencia entre es que el StringBuilder es más rápido que el StringBuilder

Usando el método 
```java
System.currentTimeMillis();
```
que devuelve el tiempo en milisegundos, crea un programa que muestre la diferencia en tiempo entre usar los tres métodos de concatenación (Se guarda el tiempo antes de efectuar una operación y al tiempo que se obtiene después de efectuar la operación se le resta el que habíamos guardado.)

¿Cuál es el que usaremos a partir de ahora?

## 10. Fechas en Java


Con la información disponible en el siguiente artículo:
http://www.oracle.com/technetwork/es/articles/java/paquete-java-time-2390472-esa.html



Haz un programa que te diga en qué día de la semana caerá tu cumpleaños los próximos diez años.
