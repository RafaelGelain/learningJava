package entities;

public class acconts {
    private int id;
    private String name;
    private double balance;

    public acconts(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double balance){
        this.balance += balance;
    }
    public void withdraw(double balance){
        this.balance -= balance + 5;
    }
    public String toString() {
        return "Conta : " + id
                + ", Nome : "
                + name
                + " , Dinheiro : "
                + String.format("%.2f", balance);
    }
}

