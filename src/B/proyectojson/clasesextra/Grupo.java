package B.proyectojson.clasesextra;
import java.util.Arrays;

public class Grupo {
    private Circle[] circles;

    // Constructor por defecto de la clase
    public Grupo() {
        this.circles = new Circle[4]; // se creará un array de 4 nulls
    }

    // Metodo toString() para que show funcione correctamente
    public String toString() {
        return Arrays.toString(circles);
    }
}
