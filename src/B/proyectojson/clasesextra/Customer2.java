package B.proyectojson.clasesextra;

public class Customer2 {

    private int id;
    private String name;
    private char gender;

    // SE NECESITA UN CONSTRUCTOR POR DEFECTO PARA QUE FUNCIONE BIEN
    public Customer2() {
        this.id = 1;
        this.name = "Sandra";
        this.gender = 'm';
    }

    public Customer2(int id, String name, char gender) { // Se crea el Customer2 introduciendo los valores que se quieran a las variables.
        this.id = id;
        this.name = name;
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        }
        else {
            System.out.println("Introduce tu sexo corrdectamente.");
        }
    }


    // Se retorna el valor actual de las variables.
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public char getGender() {
        return this.gender;
    }



    public String  toString() {
        return this.name + "(" + this.id + ")";
    } // Se retorna lo que el enunciado pide.
}
