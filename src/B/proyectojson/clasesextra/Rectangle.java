package B.proyectojson.clasesextra;

public class Rectangle extends Shape {

    private double width;
    private double length;



    public Rectangle() { // Se dan valores a las variables.
        super();
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length) { // Los valores que se introduzcan se asignarán a las variables.
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) { // Los valores que se introduzcan se asignarán a las variables.
         super(color,filled);
         this.length = length;
         this.width = width;
    }



    // Se retornan los valores actuales de las variables.
    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }
    public double getArea() {
        return this.length * this.width;
    } // Se retorna el área = base*altura.
    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    } // Se retorna el perímetro = 2*base + 2*altura.


    // Se modifican los valores de las variables.
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }



    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ", width = " + this.width + ", length = " + this.length + "]";
    } // Se retorna lo que se pide.
}
