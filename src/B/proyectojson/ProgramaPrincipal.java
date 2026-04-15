package B.proyectojson;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramaPrincipal {
    // Se le ha llamado 'ProgramaPrincipal' para evitar confusión con el main de las hojas anteriores del mismo pdf.
    public static void main(String[] args) {
        // AHORA SE PROCEDE CON LA SIGUIENTE ESTRUCTURA:
        // 1. DETECTAR CUÁLES SON LOS PARÁMETROS, ES DECIR, OPERACIÓN, Y FICHERO Y SI HAN SIDO INTRODUCIDOS
        if (args.length < 2) {
            System.out.println("Uso: java -jar programa.jar <operacion> <fichero> [clase]");
            System.out.println("Donde [clase] es un parámetro opcional, usando Alumno si no se especifica nada");
            System.out.println("Todos los ejemplos de clases deben de estar en B.proyectojson.clasesextra");
            return;
        }
        // 2. SE ESTABLECEN LOS PARÁMETROS NECESARIOS
        String operacion = args[0]; // Operación a realizar
        String fichero = args[1];   // Ruta del fichero con el que va a trabajar
        String nombreClase = (args.length > 2) ? args[2] : "Alumno";       // Clase con la cual se hace el JSON

        try {
            // Esto lo que hace es transformar el string a una clase...
            Class<?> clase = Class.forName("B.proyectojson.clasesextra." + nombreClase);

            // 3. EN FUNCIÓN DE QUE SI OPERACIÓN ES 'INIT' O 'SHOW', REALIZAR UNA OPERACIÓN U OTRA (CREAR O MOSTRAR EL JSON..., HAY QUE IMPLEMENTARLO PARA QUE FUNCIONE CON OTROS TIPOS DE CLASES)
            if (operacion.equalsIgnoreCase("init")) {
                // Si es init abrir
                System.out.println("Inicializando fichero: " + fichero);
                init(fichero, clase);
            }
            else if (operacion.equalsIgnoreCase("show")) {
                // Si es show imprimir
                System.out.println("Mostrando fichero: " + fichero);
                show(fichero, clase);
            }
            else {
                // Cualquier otra cosa imprime este mensaje
                System.out.println("Operación no válida. Escribir 'init' o 'show' como argumentos");
            }
            // Se imprimen los argumentos finalmente de todos modos
            imprimirArgs(args);
        }

        catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada: " + nombreClase);
        }
    }

    // Esto sirve para hacer debug, se incluirá si o sí.
    public static void imprimirArgs(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            sb.append("Argumento ").append(i).append(": ").append(args[i]).append("\n");
        }
        System.out.println("Argumentos:\n" + sb);
    }

    // Metodo que emula la funcion init que se ha pedido que lo que hace es crear un fichero
    public static <T> void init(String fichero, Class<T> clase) {
        try {
            // Coge el constructor de la clase y crea una nueva instancia, parametrizándolo como un objeto de tipo T
            T objeto = clase.getDeclaredConstructor().newInstance();
            guardarObjetoEnArchivo(fichero, objeto);
        } catch (Exception e) {
            // Error en caso de que cualquier cosa falle
            System.out.println("Error al crear el objeto");
        }
    }

    // Metodo que emula el show o la impresion
    public static <T> void show(String rutaArchivo, Class<T> clase) {
        // Se crea el GSON
        Gson gson = new Gson();
        // Y se intenta crear un lector, y se imprime su resultado
        try (FileReader reader = new FileReader(rutaArchivo)) {
            T objeto = gson.fromJson(reader, clase);
            // Es necesario que tengan toString() para poder imprimir sus datos
            System.out.println(objeto);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Este es un metodo incrustado dentro del propio init() que permite guardar los objetos en los archivos
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        // Se crea el GSON
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            // Y se intenta crear un escritor en vez de un lector
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            // Se captura cualquier posible tipo de excepción de entrada/salida
            e.printStackTrace();
        }
    }
}
