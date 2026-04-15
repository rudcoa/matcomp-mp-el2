package B.proyectojson.clasesextra;

public class Ball {

    // Se declaran las variables privadas.
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;



    public Ball(float x, float y, int radius,float xDelta, float yDelta) { // Se crea el constructor que da los datos correspondientes a cada variable.
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }



    public float getX() {
        return this.x;
    } // Se retorna el valor acual de x.
    public void setX(float x) {
        this.x = x;
    } // Se cambia el valor de x.



    public float getY() {
        return this.y;
    } // Se retorna el valor actual de y.
    public void setY(float y) {
        this.y = y;
    } // Se cambia el valor de y.



    public int getRadius() {
        return this.radius;
    } // Se retorna el valor actual del radio.
    public void setRadius(int radius) {
        this.radius = radius;
    } // Se cambia el valor del radio.


    public float getXDelta() {
        return this.xDelta;
    } // Se retorna el valor actual de xDelta.
    public void setXDelta(float xDelta) {
        this.xDelta =xDelta;
    } // SE cambia el valor de xDelta.


    public float getYDelta() {
        return this.yDelta;
    } // Se retorna el valor actual de yDelta.
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    } // Se cambia el valor de yDelta.



    public void move() {
        this.x = this.x + this.xDelta; // El punto x se desplaza xDelta.
        this.y = this.y + this.yDelta; // El punto y se desplaza yDelta.
    }


    public void reflectHorizontal() {
        this.xDelta = (-1) * this.xDelta;
    } // Se coloca su posición en "espejo" respecto su eje.


    public void reflectVertical() {
        this.yDelta = (-1) * this.yDelta;
    } // Se coloca su posición en "espejo" respecto su eje.




    public String toString() {
        return "Ball[(" + this.x + "," + this.y + "), speed=(" + this.xDelta + "," + this.yDelta + ")]"; // Se devuelve lo pedido.
    }
}
