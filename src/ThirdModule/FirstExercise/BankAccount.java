package ThirdModule.FirstExercise;

public class BankAccount {
    private double balance;
    private final double overdraftLimit;
    private double usedOverdraft;
    private double overdraftFee;

    public BankAccount(double initialBalance){
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }

        this.balance = initialBalance;

        if (initialBalance <= 500) {
            this.overdraftLimit = 50;
        } else {
            this.overdraftLimit = initialBalance * 0.5;
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public double getUsedOverdraft() {
        return usedOverdraft;
    }

    public double getAvailableBalance() {
        return balance + getAvailableOverdraft();
    }

    public double getOverdraftFee() {
        return overdraftFee;
    }

    public double getAvailableOverdraft() {
        return overdraftLimit - usedOverdraft;
    }

    public boolean isUsingOverdraft() {
        return usedOverdraft > 0;
    }

    public void deposit(double amount) {
        credit(amount);
    }

    public void withdraw(double amount) {
        debit(amount);
    }

    public void payBill(double amount) {
        debit(amount);
    }

    public void credit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero");
            return;
        }

        if (overdraftFee > 0) {
            double feePayment = Math.min(overdraftFee, amount);

            overdraftFee -= feePayment;
            amount -= feePayment;
        }

        if (getUsedOverdraft() > 0) {
            double overdraftPayment = Math.min(amount, usedOverdraft);

            usedOverdraft -= overdraftPayment;
            amount -= overdraftPayment;
        }

        if (amount > 0) {
            balance += amount;
        }
    }

    public void debit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be greater than zero");
            return;
        }

        if (amount > getAvailableBalance()) {
            System.out.println("The debit amount is greater than you available balance");
            return;
        }

        if (amount <= balance) {
            balance = balance - amount;
            return;
        }

        double overdraftNeeded = amount - balance;
        balance = 0;
        usedOverdraft += overdraftNeeded;
        overdraftFee += overdraftNeeded * 0.20;
    }
}
