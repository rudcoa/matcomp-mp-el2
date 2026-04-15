package B.proyectojson.clasesextra;

public class Shape {

    private String color;
    private boolean filled;


    public Shape() { // Se asignan los valores a esas variables.
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) { // Los valores que se introduzcan se asignaran a las variables respectivas.
        this.color = color;
        this.filled = filled;
    }



    public String getColor() {
        return this.color;
    } // Retorna el color actual.
    public boolean isFilled() {
        return this.filled;
    } // Retorna true o false dependiendo de si está lleno o vacío.

    // Se modifican los valores de las variables.
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    @Override
    public String toString() {
        return "Shape[color = " + this.color + ", filled = " + this.filled + "]";
    } // Se retorna lo que el enunciado pide.
}
