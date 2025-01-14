package application;

import entities.acconts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("NUMERO DA CONTA : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("NOME DO USUARIO : ");
        String name = sc.nextLine();
        acconts ac = new acconts(id, name);
        System.out.print("Deseja fazer um deposito inicial (y/n) : ");
        String x = sc.nextLine();
        double balance;
        if (x.equalsIgnoreCase("y")) {
            System.out.print("Digite o valor do deposito inicial : ");
            balance = sc.nextDouble();
            ac.deposit(balance);
        } else {
            System.out.println("Nao sera feito deposito inicial.");
        }
        System.out.println();
        System.out.println("Dados da Conta :");
        System.out.println(ac);
        System.out.println();

        System.out.print("Digite o valor do deposito : ");
        balance = sc.nextDouble();
        ac.deposit(balance);
        System.out.println("Dados Atualizados da Conta :");
        System.out.println(ac);
        System.out.println();

        System.out.print("Digite o valor do saque : ");
        balance = sc.nextDouble();
        ac.withdraw(balance);
        System.out.println("Dados Atualizados da Conta :");
        System.out.println(ac);







        sc.close();
    }
}