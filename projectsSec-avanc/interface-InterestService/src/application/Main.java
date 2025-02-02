package application;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInteresetService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("Payment: %.2f", payment));
        System.out.println(String.format("Interest rate : %.1f", is.getInteresetRate()));


        sc.close();
    }
}