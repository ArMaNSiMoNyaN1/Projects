package arman.bank1;

public final class Account {
    private double bal;
    private int accnum;


    public Account(int a) {
        bal = 0.0;
        accnum = a;
    }

    public void deposit(double sum) {
        if (sum > 0)
            bal += sum;
        else
            System.err.println("Account.deposit(...): "
                    + "cannot deposit negative amount.");
    }

    public void withdraw(double sum) {
        if (sum > 0)
            bal -= sum;
        else
            System.err.println("Account.withdraw(...): "
                    + "cannot withdraw negative amount.");
    }

    public double getBalance() {
        return bal;
    }

    public double getAccountNumber() {
        return accnum;
    }

    public String toString() {
        return "Acc " + accnum + ": " + "balance = " + bal;
    }

    public final void print() {
        System.out.println(toString());
    }
}

