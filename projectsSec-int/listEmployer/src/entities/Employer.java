package entities;

public class Employer {
    private int id;
    private String nome;
    private double salario;

    public Employer(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void increscimoSalario(double porcentagem){
        salario += salario * porcentagem / 100;
    }

}
