package A.es.uah.matcomp.mp.el2.a;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

//Ejemplo ScannerFromFile resuelto con la inclusión en el metodo estatico main
public class Ejemplo_1_1_Error_De_Compilacion_1 {
    public static void main(String[] args) throws FileNotFoundException {
                            // 'tirar' la excepción hace que esta sea manejada por el metodo de mayor nivel -> propagación hacia arriba
        Scanner in = new Scanner(new File("test.in"));
                           // este metodo tiene la posibilidad de tirar la excepción "FileNotFoundException"
        // hacer algo en consecuencia...
        System.out.println("El archivo test.in ha sido encontrado");
    }
}
