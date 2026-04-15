package A.es.uah.matcomp.mp.el2.a;

public class Ejemplo_1_6_Try_Catch_Finally_2 {
    // Definición del metodo estático "main"
    public static void main(String[] args) {
        System.out.println("Saliendo del main()");
        methodA();
        System.out.println("Entrando al main()");
    }

    // Definición del metodo estático "methodA()"
    public static void methodA() {
        System.out.println("Entrando al methodA()");
        try {
            System.out.println(1 / 0);
            // Dividir entre 0 provoca una excepción no comprobada - ArithmeticException
            // Este metodo no captura la ArithmeticException
            // Ejecuta el "finally" y se sale de la pila de llamadas...
        }
        finally {
            System.out.println("Finally en methodA()");
        }
        System.out.println("Saliendo del methodA()");
    }
}
