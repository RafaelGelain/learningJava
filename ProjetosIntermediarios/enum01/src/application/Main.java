package application;

import entities.Order;
import entities.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PROCESSING);

        System.out.println(order);

        OrderStatus os = OrderStatus.DELIVERED;
        OrderStatus os1 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os);
        System.out.println(os1);
    }
}