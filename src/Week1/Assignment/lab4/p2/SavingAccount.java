package week1.Assignment.lab4.p2;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String acctId, double interestRate, double startBalance) {
        super(acctId, startBalance);
        this.interestRate = interestRate;
    }

    @Override
    public String getAccountID() {
        return acctId;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance + (interestRate * balance);
    }
}

