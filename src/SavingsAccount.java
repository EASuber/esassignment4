public class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    SavingsAccount() { //default constructor
        annualInterestRate = 0.0;
        savingsBalance = 0.0;
    }

    SavingsAccount(double annualInterestRate, double savingsBalance) { //constructor
        SavingsAccount.annualInterestRate = annualInterestRate;
        this.savingsBalance = savingsBalance;
    }

    //setters
    protected void setsavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    protected static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    //getters

    protected double getsavingsBalance() {
        return savingsBalance;
    }


    protected double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void print(){ //print
        System.out.printf("Savings Account Balance: %.2f\n", getsavingsBalance());
        System.out.printf("Annual Interest Rate: %.2f\n\n", getAnnualInterestRate());
    }


    //extra methods
    public void calculateMonthlyInterest(double annualInterestRate, double savingsBalance){ //calculate method

        this.savingsBalance += savingsBalance * (annualInterestRate / 12);

    }

    public void deposit(double amount){ //adding money to account
        this.savingsBalance += amount;
    }

    public void withdraw(double amount){ //removing from account
        this.savingsBalance -= amount;
    }

}
