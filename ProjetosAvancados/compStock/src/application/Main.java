package application;

import entities.*;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Client Data : ");
        System.out.print("Name : ");
        String name = sc.nextLine();
        System.out.print("Email : ");
        String email = sc.next();
        System.out.println("Birth Date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data : ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf( sc.next());

        Order order = new Order(client, status, new Date());

        System.out.println("How many items to this order? ");
        int N = sc.nextInt();

        for (int i = 0 ; i<N; i++){

            System.out.println("Enter #" + ( i + 1) + " item data: ");
            System.out.println("Product Name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println("Product price : ");
            double productPrice = sc.nextDouble();
            System.out.println("Quantity : ");
            int quantity = sc.nextInt();

            Product product = new Product(productPrice, productName);
            OrderItem it = new OrderItem(quantity,productPrice,product);

            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);


        sc.close();
    }
}