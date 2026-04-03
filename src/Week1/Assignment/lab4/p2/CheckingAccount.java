package week1.Assignment.lab4.p2;

public class CheckingAccount extends Account {
    private double monthlyFee;

    public CheckingAccount(String acctId, double monthlyFee, double startBalance) {
        super(acctId, startBalance);
        this.monthlyFee = monthlyFee;
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
        return balance - monthlyFee;
    }
}
