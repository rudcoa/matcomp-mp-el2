package B.proyectojson.clasesextra;

public class Account {

    private int id;
    private Customer2 customer; // Customer2 es el tipo de la variable.
    private double balance;

    // SE NECESITA UN CONSTRUCTOR POR DEFECTO PARA QUE FUNCIONE BIEN
    public Account() {
        this.id = 0;
        this.customer = new Customer2();
        this.balance = 0.0;
    }

    public Account(int id, Customer2 customer) { // Se introducen los valores que se quieran en cada variable para crear un Account.
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }
    public Account(int id, Customer2 customer, double balance) { // Se introducen los valores en las variables (ahora con balance también) para crear el Account.
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }


    // Se retorna el valor actual de las variables.
    public int getId() {
        return this.id;
    }
    public Customer2 getCustomer() {
        return this.customer;
    }
    public double getBalance() {
        return this.balance;
    }

    // Se retorna el valor actual de una variable de customer.
    public String getCustomerName() {
        return customer.getName();
    }


    // Se cambia el valor de la variable balance.
    public void setBalance(double balance) {
        this.balance = balance;
    }


    public String toString() {
        return customer + " balance = $" + this.balance;
    } // Se retorna lo que el enunciado pide.


    // Metodo que hace un pago.
    public Account withdraw(double amount) {
        if (this.balance >= amount) { // Si hay más dinero que la cantidad:
            this.balance = this.balance - amount; // Se retira la cantidad.
        }
        else {
            System.out.println("amount withdrawn exceeds the current balance"); // Si no, salta un mensaje de que hay menos dinero.
        }
        return this;
    }

}
