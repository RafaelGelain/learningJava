package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();
        Double sum = 0.0;

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i=0;i<n;i++){
            System.out.println("Tax payer #"+(i+1)+" data:");
            System.out.print("Individual or Company (i/c)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            if ( ch == 'i'){
                System.out.print("Name : ");
                String name = sc.nextLine();
                System.out.print("Anual Income: ");
                Double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));

            }
            else {
                System.out.print("Name : ");
                String name = sc.nextLine();
                System.out.print("Anual Income: ");
                Double anualIncome = sc.nextDouble();
                System.out.print("Number of Employees: ");
                Integer numberOfEmployees = sc.nextInt();
                list.add(new Company(name,anualIncome,numberOfEmployees));
            }
        }
        System.out.println();
        System.out.println("Taxes Paid: ");

        for (TaxPayer tp : list){
            double tax = tp.tax();
            System.out.println(tp.getName()+" : $ "+ String.format("%.2f",tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES : $ "+ sum);

        sc.close();
    }
}