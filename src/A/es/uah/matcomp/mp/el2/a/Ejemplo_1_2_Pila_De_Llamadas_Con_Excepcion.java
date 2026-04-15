package A.es.uah.matcomp.mp.el2.a;

public class Ejemplo_1_2_Pila_De_Llamadas_Con_Excepcion {
    // Creamos el metodo estático main()
    public static void main(String[] args) {
        System.out.println("Entrando en el main()");
        // Se ejecuta el metodo A
        metodoA();
        System.out.println("Saliendo del main()");
    }

    // Creamos el metodo estático A tal que main () --> metodoA()
    public static void metodoA() {
        System.out.println("Vamos a realizar diferentes operaciones aritméticas");
        System.out.println("Entrando al métodoA()");
        System.out.println("A. Multiplicación:");
        System.out.println("El resultado de multiplicar ochocientos veintisiete por nueve mil ciento ochenta y dos: "+827*9182);
        // Se ejecuta el metodo B
        metodoB();
        System.out.println("Saliendo del métodoA()");
    }

    // Creamos el metodo estático B tal que main () --> metodoA() --> metodoB()
    public static void metodoB() {
        System.out.println("Entrando al métodoB()");
        System.out.println("B. Exponenciación:");
        System.out.println("El resultado de combinaciones posibles de 22 bits es: "+Math.pow(2,22));
        // Se ejecuta el metodo C
        metodoC();
        System.out.println("Saliendo del métodoB()");
    }

    // Creamos el metodo estático C tal que main () --> metodoA() --> metodoB() --> metodoC()
    public static void metodoC() {
        System.out.println("Entrando al métodoC()");
        System.out.println("C. División:");
        System.out.println("El resultado de dividir uno entre cero es: ");
        // ¡SALTO DEL ERROR FATAL!
        System.out.println(1 / 0); // dividir entre 0 causa que salte la excepción 'ArithmeticException'
        System.out.println("Saliendo del métodoC()");
    }
}
