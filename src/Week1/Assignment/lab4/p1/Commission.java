package week1.Assignment.lab4.p1;

import java.util.List;

public class Commission extends Employee {
    private double baseSalary;
    private double commission;
    private List<Order> orders;

    public Commission(String empId, double baseSalary, double commission, List<Order> list) {
        super(empId);
        this.baseSalary = baseSalary;
        this.commission = commission;
        this.orders = list;
    }

    @Override
    protected double calcGrossPay(int month, int year) {
        double totalOrderAmount = 0.0;
        for (Order order : orders) {
            if (order.getOrderDate().getMonthValue()==month &&
                    order.getOrderDate().getYear()==year) {
                totalOrderAmount += order.getOrderAmount();
            }
        }
        return baseSalary + (commission * totalOrderAmount);
    }
    @Override
    public void print(){
        super.print();
        System.out.println(" Type : Commissioned");
        System.out.println(" Base Salary :" +baseSalary);
        System.out.println (" Commission: "+ commission * 100);
        System.out.println(" Orders : " + orders.size());
    }
}
