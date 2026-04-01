package week1.Assignment.prob2B.exitPackage;

import week1.Assignment.prob2B.Order;
import week1.Assignment.prob2B.OrderLine;

public class Main {
    public static void main(String[] args) {
        Order or = new Order(101);

        OrderLine ol1 = new OrderLine(or);
        OrderLine ol2 = new OrderLine(or);

        System.out.println("Order Number: " + or.getOrderNum());
        System.out.println("Number of OrderLines: " + or.getColl().size());
        System.out.println("OrderLine 1 belongs to Order: " + ol1.getOrd().getOrderNum());
    }
}