package application;

import entities.Hight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantas pessoas serao digitadas : ");
        int n = sc.nextInt();

        Hight[] vetor = new Hight[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Dados da " + ( i + 1) + " Pessoa: %n");
            System.out.print("Nome : ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("idade : ");
            int peso = sc.nextInt();
            System.out.print("Altura : ");
            double altura = sc.nextDouble();
            vetor[i] = new Hight(nome , peso , altura);
        }
        int alturatotal = 0; int nmenores = 0;


        // INCOMPLETO //

        
        for (int i = 0; i< n; i++){
            if (vetor[i].getIdade() < 16){
                System.out.println(vetor[i].getName());
            }
        }

    }
}