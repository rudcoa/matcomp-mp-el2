package A.es.uah.matcomp.mp.el2.a;

public class Ejemplo_1_7_Todas_Las_Excepciones {
    // Hay que incluir:
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundsException
        try {
            int[] array = new int[3];
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango");
        }

        // NullPointerException
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch (NullPointerException e) {
            System.out.println("Error: Objeto nulo");
        }

        // NumberFormatException
        try {
            int numero = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Error: Formato de número inválido");
        }

        // ClassCastException
        try {
            Object obj = "Hola";
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("Error: Conversión de tipo inválida");
        }

        // IllegalArgumentException
        try {
            int edad = -5;
            if (edad < 0) {
                throw new IllegalArgumentException("Edad no puede ser negativa");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: Argumento ilegal - " + e.getMessage());
        }

        // IllegalStateException
        try {
            boolean procesoIniciado = false;
            if (!procesoIniciado) {
                throw new IllegalStateException("El proceso no ha sido iniciado");
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: Estado ilegal - " + e.getMessage());
        }

        // NoClassDefFoundError
        try {
            throw new NoClassDefFoundError("Clase no encontrada en tiempo de ejecución");
        } catch (NoClassDefFoundError e) {
            System.out.println("Error: Clase no definida - " + e.getMessage());
        }
        System.out.println("Programa finalizado");
    }
}
