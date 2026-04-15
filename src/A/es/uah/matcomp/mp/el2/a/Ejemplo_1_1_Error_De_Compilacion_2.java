package A.es.uah.matcomp.mp.el2.a;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

//Ejemplo ScannerFromFile resuelto con la inclusión de una estructura try-catch
public class Ejemplo_1_1_Error_De_Compilacion_2 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("test.in"));
            // hacer algo más en caso de no haber excepciones...
            System.out.println("El archivo test.in ha sido encontrado");
            // la lógica principal va aquí en el bloque del "try"
        }

        catch (FileNotFoundException ex) {
            // el manejo de errores se separa de la lógica principal
            ex.printStackTrace();
            // se imprime por pantalla el rastreo de la pila de la excepción correspondiente
            System.out.println("Se ha imprimido el rastreo de pila correctamente");
        }
    }
}
