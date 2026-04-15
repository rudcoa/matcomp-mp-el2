package A.es.uah.matcomp.mp.el2.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo_1_1_Separacion_De_Logica {
    public static void main(String[] args) {
        // Se creará un objeto de tipo escaner que esté vacío -> no se hace nada de momento
        Scanner in = null;
        try {
            // Se intentará abrir un archivo "test.in" creándolo como tipo File y luego ese File es la subclase que el "Scanner" leerá
            in = new Scanner(new File("test.in"));

            // Si no han habido excepciones aún, pues se impimirá linea por linea del archivo MIENTRAS tenga una linea siguiente
            while (in.hasNext()) {
                // 1: La nueva linea es la que va siguiente a la anterior
                String linea = in.nextLine();
                // 2: Se imprime la linea actual en la que nos encontramos
                System.out.println(linea);
            }
        }

        // Se captura la excepción "FileNotFoundException" para la primera parte del try
        catch (FileNotFoundException ex) {
            // Imprimimos por pantalla el mensaje de error correspondiente y el rastreo de la pila
            System.out.println("Error: archivo no encontrado");
            ex.printStackTrace();

        }

        // Se captura la excepción "Exception" para cualquier tipo de excepciones relacionados con la Entrada/Salida de archivos al sistema
        catch (Exception ex) {
            // Imprimimos por pantalla el mensaje de error correspondiente (IO) y el rastreo de la pila
            System.out.println("Error general de entrada/salida");
            ex.printStackTrace();

        }

        // Si o si, en caso de haber podido abrir el archivo, lo cerramos, si no, nada.
        finally {
            // "Poder abrir el archivo" -> in != null
            if (in != null) {
                in.close();
                // Se lo hacemos saber al usuario
                System.out.println("Archivo cerrado correctamente");
            }
        }
    }
}