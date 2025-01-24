package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccont;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1, "Rafael", 1000.0);
        acc.withdraw(50);
        System.out.println(acc.getBalance());

        Account acc1 = new SavingsAccont(2, "Maria", 1000.0, 0.01);
        acc1.withdraw(50);
        System.out.println(acc1.getBalance());
    }
}