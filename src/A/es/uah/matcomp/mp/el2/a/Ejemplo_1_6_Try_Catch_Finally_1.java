package A.es.uah.matcomp.mp.el2.a;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Ejemplo_1_6_Try_Catch_Finally_1 {
    // Se crea el metodo estático main de la clase
    public static void main(String[] args) {
        try { // lógica principal del cuerpo
            System.out.println("Comienzo de la lógica principal");
            System.out.println("Se intenta abrir un archivo...");
            Scanner in = new Scanner(new File("test.in"));
            System.out.println("Archivo encontrado, en procesamiento...");
            System.out.println("Fin de la lógica principal");
        }
        catch (FileNotFoundException ex) { // el manejo de errores se separa de la lógica principal del programa
            System.out.println("Se ha capturado la excepción File Not Found...");
        }
        finally { // siempre se ejecuta no importe si se ha dado una excepción o no
            System.out.println("El finally-block se ejecuta sin importar el estado de la excepción");
        }
        // después de finaliza el try-catch-finally
        System.out.println("Después del try-catch-finally, la vida continua con su destino...");
    }
}
