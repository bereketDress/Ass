package week1.Assignment.lab4.p2;

public abstract class Account {
    protected String acctId;
    protected double balance;

    public Account(String acctId, double startBalance) {
        this.acctId = acctId;
        this.balance = startBalance;
    }

    public abstract String getAccountID();
    public abstract double getBalance();
    public abstract double computeUpdatedBalance();
}
