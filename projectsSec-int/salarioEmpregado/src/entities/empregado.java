package entities;

public class empregado {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
        return salarioBruto - taxa;
    }
    public void aumentoSalario(double porcentagem){
        salarioBruto += salarioBruto * porcentagem / 100;
    }
    public String toString(){
        return nome +", $" + salarioLiquido();
    }
}
