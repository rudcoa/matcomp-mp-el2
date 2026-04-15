package A.es.uah.matcomp.mp.el2.a;
import java.io.*;
import java.awt.AWTException;

public class Ejemplo_1_4_Error_Y_Excepcion {
    /* Vamos a seguir esta estructura de try-catch por cada error o excepción.
    try {
        throw new Excepción(mensaje del tipo de error/excepción)
    }
    catch {
        System.out.println(mensaje de captura del error/excepción)
    }*/

    public static void main(String[] args) {
        // --ERRORES--
        // 1. LinkageError
        try {
            // Mensaje del tipo de error
            throw new LinkageError("Error de enlace");
        }

        catch (LinkageError e) {
            // Mensaje de captura del error
            System.out.println("LinkageError capturado");
        }

        // 2. VirtualMachineError
        try {
            // Mensaje del tipo de error
            throw new VirtualMachineError("Error de máquina virtual") {};
        }

        catch (VirtualMachineError e) {
            // Mensaje de captura del error
            System.out.println("VirtualMachineError capturado");
        }

        // 3. AWTError
        try {
            // Mensaje del tipo de error
            throw new java.awt.AWTError("Error de AWT");
        }

        catch (java.awt.AWTError e) {
            // Mensaje de captura del error
            System.out.println("AWTError capturado");
        }

        // --EXCEPCIONES-- (Las que pertenecen al checked, no las unchecked...)
        // 1. AWTException
        try {
            // Mensaje del tipo de excepción
            throw new AWTException("Excepción de AWT");
        }

        catch (AWTException e) {
            // Mensaje de captura de la excepción
            System.out.println("AWTException capturada");
        }

        // 2. IOException
        try {
            // Mensaje del tipo de excepción
            throw new IOException("Error de entrada/salida");
        }

        catch (IOException e) {
            // Mensaje de captura de la excepción
            System.out.println("IOException capturada");
        }

        // 3. InterruptedIOException
        try {
            // Mensaje del tipo de excepción
            throw new InterruptedIOException("Operación interrumpida");
        }

        catch (InterruptedIOException e) {
            // Mensaje de captura de la excepción
            System.out.println("InterruptedIOException capturada");
        }

        // 4. EOFException
        try {
            // Mensaje del tipo de excepción
            throw new EOFException("Fin de archivo alcanzado");
        }

        catch (EOFException e) {
            // Mensaje de captura de la excepción
            System.out.println("EOFException capturada");
        }

        // 5. FileNotFoundExceotion
        try {
            // En este caso, se intenta elaborar un código que permita que la excepción se dé
            File f = new File("no_existe.txt");
            new FileInputStream(f); // -> FileNotFoundException sí y solo sí "no_existe.txt" no está en el entorno de trabajo, en el portátil, por ejemplo...
        }

        catch (FileNotFoundException e) {
            // Mensaje de captura de la excepción
            System.out.println("FileNotFoundException capturada");
        }

        // Finalmente, se notifica al usuario por pantalla con la finalización del programa...
        System.out.println("Programa finalizado");
    }
}
