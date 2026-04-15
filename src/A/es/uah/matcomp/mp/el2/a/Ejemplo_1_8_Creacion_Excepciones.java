package A.es.uah.matcomp.mp.el2.a;

public class Ejemplo_1_8_Creacion_Excepciones {
    // Se incluye un main que pruebe que la clase está estructurada correctamente
    public static void main(String[] args) {
        try {
            // probamos un try intentando adivinar tres veces
            magic(9); // el 9 es incorrecto, no salta la excepción
            magic(8); // con el 17 ocurre con el mismo
            magic(25); // y finalmente, con el 25 ya si.
        }

        catch (MiPropiaExcepcion ex) {
            // el bloque 'catch' maneja la excepción
            System.out.println("¡Enhorabuena! Has acertado correctamente.");
            ex.printStackTrace();
        }
    }

    // MiPropiaExcepcion debe de estar dentro del cuerpo y de la firma del metodo, en este caso
    public static void magic(int number) throws MiPropiaExcepcion {
        if (number == 25) {
            // Le dice al metodo que haga saltar la excepción instanciada con el mensaje especificado en el constructor...
            throw (new MiPropiaExcepcion("¡Enhorabuena! Has acertado correctamente."));
        }
        System.out.println("¡Buenas! Intenta adivinar el número mágico de nuevo"); // skip if exception triggered
    }

    // Se incluye a la 'clase'/'excepción' MiPropiaExcepcion de forma estática dentro de este archivo
    static class MiPropiaExcepcion extends Exception {
        // Se le concibe como una subclase de la clase Exception de Java.
        public MiPropiaExcepcion(String message) {
            // constructor propio
            super(message);
        }
    }
}
