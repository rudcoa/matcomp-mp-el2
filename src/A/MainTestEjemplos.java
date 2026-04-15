package A;
import A.es.uah.matcomp.mp.el2.a.*;

public class MainTestEjemplos {
    public static void main(String[] args) {
        // No es posible incluir 1.1 (Error de compilación 1 y 2), 1.2, 1.6 (Try-Catch-Finally 2)
        // Porque las excepciones no son manejadas en sus metodos correspondientes y proceden a finalizar este programa...
        // Impidiendo poder probar las demás
        System.out.println(" > EJEMPLO 1.1: Separación de lógica en bloques try-catch/try-catch-finally");
        Ejemplo_1_1_Separacion_De_Logica.main(args);
        System.out.println("\n > EJEMPLO 1.3 Pila de llamadas con excepción resuelta");
        Ejemplo_1_3_Pila_De_Llamadas_Con_Excepcion_Resuelta.main(args);
        System.out.println("\n > EJEMPLO 1.4: Error y excepción");
        Ejemplo_1_4_Error_Y_Excepcion.main(args);
        System.out.println("\n > EJEMPLO 1.5: Capturando excepciones múltiples");
        // "methodC()" se detendrá tras haber encontrado XxxException, así funciona el flujo del programa
        Ejemplo_1_5_Capturando_Excepciones_Multiples.methodC();
        System.out.println("\n > EJEMPLO 1.6: Try-Catch-Finally 1");
        Ejemplo_1_6_Try_Catch_Finally_1.main(args);
        System.out.println("\n > EJEMPLO 1.7: Todas las excepciones");
        Ejemplo_1_7_Todas_Las_Excepciones.main(args);
        System.out.println("\n > EJEMPLO 1.8: Creación de excepciones");
        Ejemplo_1_8_Creacion_Excepciones.main(args);
        System.out.println("\nFIN DE TODAS LAS PRUEBAS");
        // Finalmente se va a imprimir el registro de la pila de llamadas de los métodos de las clases 1.1, 1.3 y 1.8 si es no se han imprimido antes.
    }
}