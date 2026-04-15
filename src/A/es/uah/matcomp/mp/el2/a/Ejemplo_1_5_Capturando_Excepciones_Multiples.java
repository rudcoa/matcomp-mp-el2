package A.es.uah.matcomp.mp.el2.a;

public class Ejemplo_1_5_Capturando_Excepciones_Multiples {
    // Se creará el "metodoC()" del ejemplo en el PDF correspondiente.
    public static void methodC() {
        // este metodo no declara ninguna excepción en su firma
        try {
            // en el cuerpo del metodo, en el try, se llama al "metodoD()", que sí declara tanto la excepción XxxException como la YyyException en su firma.
            methodD(3);     // no excepciones
            methodD(1);     // XxxException
            methodD(2);     // YyyException
        }

        catch (XxxException ex) {
            // se manda el mensaje de captura de la excepción 'XxxException'
            System.out.println("Has dado con el número X...");
        }
        catch (YyyException ex) {
            // se manda el mensaje de captura de la excepción 'YyyException'
            System.out.println("Has dado con el número Y...");
        }

        finally {
            // y, aunque sea opcional, incluimos una estructura de 'finally' al try-catch
            System.out.println("El programa acaba de finalizar");
        }
    }

    // Creamos el "metodoD" dentro de la misma clase para que el "metodoC()" pueda usarlo sin problemas. Ambos deben de ser estáticos.
    public static void methodD(int numero) throws XxxException, YyyException { // method's signature
        // Por qué ocurre XxxException:
        if ( numero == 1 ) {
            throw new XxxException("¡Excepción X!"); // se construye un objeto de la clase XxxException y se "tira" al JVM
        }
        // Por qué ocurre YyyException:
        if ( numero == 2 ) {
            throw new YyyException("¡Excepción Y!"); // se construye un objeto de la clase YyyException y se "tira" al JVM
        }
        // En caso de no dar con el número correcto, no hay excepciones.
        System.out.println("No han habido excepciones");
    }

    // Se incluye a la 'clase'/'excepción' XxxException de forma estática dentro de este archivo
    static class XxxException extends Exception {
        // Se le concibe como una subclase de la clase Exception de Java.
        public XxxException(String message) {
            // constructor propio
            super(message);
        }
    }

    // Se incluye a la 'clase'/'excepción' YyyException de forma estática dentro de este archivo
    static class YyyException extends Exception {
        // Se le concibe como una subclase de la clase Exception de Java.
        public YyyException(String message) {
            // constructor propio
            super(message);
        }
    }
}
