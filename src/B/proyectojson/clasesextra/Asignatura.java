package B.proyectojson.clasesextra;
import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    // Parámetros de la clase Asignatura
    private String nombre;
    private List<Estudiante> estudiantes;

    // Constructor por defecto de la clase Asignatura
    public Asignatura() {
        this.nombre = "Matemáticas y Computación";
        // Se instancia un array y se añaden dos estudiantes...
        this.estudiantes = new ArrayList<>();
        this.estudiantes.add(new Estudiante("Román", 19));
        this.estudiantes.add(new Estudiante("Selena", 21));
    }

    // Getter del 'nombre'
    public String getNombre() {
        return nombre;
    }

    // Setter del 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter de los estudiantes
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    // Setter de los estudiantes
    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    // Metodo toString() para que show funcione correctamente.
    @Override
    public String toString() {
        return "Asignatura[nombre= " + nombre +", estudiantes=" + estudiantes + "]";
    }
}
