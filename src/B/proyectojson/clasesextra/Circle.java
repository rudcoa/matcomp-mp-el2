package B.proyectojson.clasesextra;

public class Circle {

    private double radius;

    public Circle() {
        this.radius = 1.0;
    } // Se asigna el valor pedido inicial en la variable corresondiente.

    public Circle(double radius) {
        this.radius = radius;
    } // Se asigna el valor que se quiera en el constructor.

    public double getRadius() {
        return this.radius;
    } // Se retorna el valor actual de radius.

    public void setRadius(double radius) {
        this.radius = radius;
    } // Se cambia el valor de radius.

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    } // Se retorna el valor del área (r^2 * PI).

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    } // Se retorna el valor de la circunferencia (2*PI*r).

    @Override
    public String toString() {
        return "Circle[radius=" + this.radius + "]";
    } // Se retorna lo que piden que se retorne.
}
