package B.proyectojson.clasesextra;

public class Estudiante {
    // Parámetros de la clase
    private String nombre;
    private int edad;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Juan";
        this.edad = 20;
    }

    // Constructor con argumentos necesarios para la clase
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter del nombre
    public String getNombre() {
        return nombre;
    }

    // Setter del nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter de la edad
    public int getEdad() {
        return edad;
    }

    // Setter de la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Metodo toString() para que show funcione correctamente.
    @Override
    public String toString() {
        return "Estudiante[nombre= " + nombre + ", edad=" + edad + "]";
    }
}
