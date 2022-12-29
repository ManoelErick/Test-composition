package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        /*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");*/
        Client client1 = new Client("Manoel Erick", "manuel@gmail.com", new Date(23/06/1998));

        Product prod1 = new Product("TV", 4897.90);
        Product prod2 = new Product("Notebook Gamer", 6789.78);
        Product prod3 = new Product("SmartPhone", 3590.89);

        OrderItem orderItem1 = new OrderItem(2, 3200, prod3);
        OrderItem orderItem2 = new OrderItem(1, 4500.00, prod1);
        OrderItem orderItem3 = new OrderItem(1, 6500.00, prod2);

        Order order = new Order(new Date(), OrderStatus.valueOf("PROCESSING"), client1);

        order.addItem(orderItem1);
        order.addItem(orderItem2);
        order.addItem(orderItem3);

        System.out.println("ORDER SUMARY: ");
        System.out.println(order);



    }
}