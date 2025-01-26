package application;
import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> list = new ArrayList<>();

        for (int i = 0 ; i < n ; i++){
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if ( ch == 'i'){
                System.out.print("Customs Fee: ");
                Double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
            else if ( ch == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.nextLine();
                list.add(new UsedProduct(name,price, new Date()));
            }
            else{
                list.add(new Product(name, price));
            };
        }

        System.out.println();
        System.out.println("PRICE TAGS");
        for (Product p : list){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
