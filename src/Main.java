import com.google.gson.Gson;
import es.uah.matcomp.mp.el3.a.ejemplo.Persona;

public class Main {
    // Se han importado las clases GSON y persona
    public static void main(String[] args) {
        // Se crea un objeto de clase/formato GSON
        Gson gson = new Gson();
        // Se instancia una nueva persona
        Persona p = new Persona("Antonio Moratilla",97);
        // Y se hace un string del GSON asociado a la nueva persona que acabábamos de crear
        String json = gson.toJson(p);
        // Se imprime por pantalla para ver el resultado
        System.out.println(json);
    }
}

