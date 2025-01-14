package application;

import entities.empregado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        empregado emp = new empregado();

        System.out.print("Nome : ");
        emp.nome = sc.nextLine();
        System.out.print("Salario Bruto : ");
        emp.salarioBruto = sc.nextDouble();
        System.out.print("Taxa : ");
        emp.taxa = sc.nextDouble();

        System.out.println();
        System.out.println("Empregado : " + emp);
        System.out.println();
        System.out.println("Quanto % quer aumentar do salario ?");
        double porcentagem = sc.nextFloat();
        emp.aumentoSalario(porcentagem);
        System.out.println();
        System.out.println("Salario Atualizado " + emp);




    }
}