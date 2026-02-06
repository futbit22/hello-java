package basic.c00_helloworld;

/*
Clase 14 - Ejercicios: Primeros pasos
Vídeo: https://youtu.be/JOAqpdM36wI?t=5108
*/
public class HelloWorldExercises {

    static void main() {


        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Hola, soy William");
        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");
        // 3. Añade un comentario sobre lo que hace cada línea del programa.
//La linea de comando 13 imprime el hola soy William en la pantalla
        //La linea de comando 15 imprime hola mundo pero en lineas separadas
        // 4. Crea un comentario en varias líneas.
/* el codigo de la linea 15 se leeria
"Hola
Mundo"
 */
        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Tengo 21 años");
        System.out.println("Mi color favorito es el negro");
        System.out.println("Soy de El Carmen");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.err.println("Error de codigo");
        // 7. Utiliza varios println para imprimir una frase.
        System.out.println("hola");
        System.out.println("Esto es un error");
        System.out.println("pero es solucionable");
        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        System.out.println(":)");
        // 9. Intenta ejecutar el programa sin el método main y observa el error.
//el editor no deja ejecutar el programa, salta the file in the editor is not runnable
        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
//salta error porque la class declarada no existe.
    }
}