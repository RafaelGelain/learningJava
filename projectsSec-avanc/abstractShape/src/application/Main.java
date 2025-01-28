package application;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes : ");
        int n = sc.nextInt();

        List<Shape> list = new ArrayList<>();

        for (int i = 0;i<n;i++){
            System.out.println("Shape #"+ ( i + 1) +" data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Whats color is RED,BLUE,BLACK : ");
            Color color = Color.valueOf(sc.next());
            sc.nextLine();
            if ( ch == 'r'){
                System.out.print("Width : ");
                double width = sc.nextDouble();
                System.out.print("Radius : ");
                double radius = sc.nextDouble();
                list.add( new Rectangle(color, width, radius));
            }
            else{
                System.out.print("Radius : ");
                double radius = sc.nextDouble();
                list.add( new Circle(color , radius));
            }
        }
        System.out.println("RADIUS : ");
        for (Shape shape : list){
            System.out.println(String.format("%.2f",shape.area()));
        }


        sc.close();
    }
}