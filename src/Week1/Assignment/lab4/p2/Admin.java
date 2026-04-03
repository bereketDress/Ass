package week1.Assignment.lab4.p2;

import java.util.List;


public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> employees) {
        double total = 0.0;
        for (Employee emp : employees) {
            total += emp.computeUpdatedBalanceSum();
        }
        return total;
    }
}
