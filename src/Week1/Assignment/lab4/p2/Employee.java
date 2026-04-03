package week1.Assignment.lab4.p2;


import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Account> accounts;

    public Employee(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public double computeUpdatedBalanceSum() {
        double sum = 0.0;
        for (Account acc : accounts) {
            sum += acc.computeUpdatedBalance();
        }
        return sum;
    }
}
