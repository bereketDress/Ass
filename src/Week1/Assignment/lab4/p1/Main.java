package week1.Assignment.lab4.p1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Create some sample orders for the commissioned employee
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("001", LocalDate.of(2025, 9, 5), 5000));
        orders.add(new Order("002", LocalDate.of(2025, 9, 15), 3000));
        orders.add(new Order("003", LocalDate.of(2025, 8, 20), 2000));

        // HOURLY EMPLOYEE
        Hourly e1 = new Hourly("7",20.0, 40);
        double hourlyGross = e1.calcGrossPay(9, 2025);
        System.out.println("Hourly Gross Pay: " + hourlyGross);
        Paycheck p1 = e1.calcCompensation(9, 2025);
        System.out.println("Hourly Employee Paycheck:");
        p1.print();
        System.out.println("Net Pay: " + p1.getNetPay());

        // SALARIED EMPLOYEE
        Salaried e2 = new Salaried("8", 4000.0);
        double salariedGross = e2.calcGrossPay(9, 2025);
        System.out.println("\nSalaried Gross Pay: " + salariedGross);
        Paycheck p2 = e2.calcCompensation(9, 2025);
        System.out.println("Salaried Employee Paycheck:");
        p2.print();
        System.out.println("Net Pay: " + p2.getNetPay());

        // COMMISSIONED EMPLOYEE
        Commission e3 = new Commission("24",2000.0, 0.10, orders);
        System.out.println("\nCommissioned Employee Order Filtering:");
        double totalOrderAmount = 0.0;
        for (Order order : orders) {
            if (order.getOrderDate().getMonthValue()==8 &&
            order.getOrderDate().getYear()==2025) {
                totalOrderAmount += order.getOrderAmount();
                System.out.println("Order Amount: " + order.getOrderAmount());
            } else {
                System.out.println("Order " + order + " is NOT from Sept 2025");
            }
        }

        System.out.println("Total Commissionable Amount: " + totalOrderAmount);
        double commissionGross = e3.calcGrossPay(9, 2025);
        System.out.println("Commissioned Gross Pay: " + commissionGross);
        Paycheck p3 = e3.calcCompensation(9, 2025);
        System.out.println("Commissioned Employee Paycheck:");
        p3.print();
        System.out.println("Net Pay: " + p3.getNetPay());
    }
}
