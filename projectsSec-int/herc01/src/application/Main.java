package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccont;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccont(1001, "Rafael", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 3));
        list.add(new SavingsAccont(1003, "Bob", 400.0, 2.0));
        list.add(new BusinessAccount(1004, "Alex", 1000.0, 1));

        double sum = 0.0;

        for ( Account acc : list){
            sum += acc.getBalance();
        }
        System.out.printf("Total balance : %.2f%n", sum);

        for ( Account acc : list){
            acc.deposit(10.0);
        }
        for ( Account acc : list){
            System.out.printf("Updated balance for accont %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }
}