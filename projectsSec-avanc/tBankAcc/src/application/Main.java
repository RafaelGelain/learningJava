package application;

import model.entities.Account;
import model.exceptions.DomainExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter accont data: ");
        System.out.print("Number : ");
        int number = sc.nextInt();
        System.out.print("Holder : ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Initial balance : ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw limit : ");
        Double withdrawLimit = sc.nextDouble();
        Account ac = new Account(number, name, balance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw : ");
        Double withdraw = sc.nextDouble();

        try {
            ac.withdraw(withdraw);
            System.out.println(ac.getBalance());
        }
        catch (DomainExceptions e){
            System.out.println("Erro : " + e.getMessage());
        }
    }
}