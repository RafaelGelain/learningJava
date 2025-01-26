package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employees : ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i=0;i<n;i++){
            System.out.println("Employee #"+(i+1)+" data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name : ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours : ");
            int hours = sc.nextInt();
            System.out.print("Value per Hours : ");
            double valuePerHour = sc.nextDouble();

            if (ch == 'y'){
                System.out.print("Aditional Charge : ");
                double aditionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, aditionalCharge));
            }
            else {
                list.add(new Employee(name , hours, valuePerHour));
            }

        }

        System.out.println();
        System.out.println("Payments:");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.payment()));
        }


    }
}