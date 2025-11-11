public class SpecialSavings extends SavingsAccount{

    SpecialSavings(){ //use parent default constructor
        super();
    }

    SpecialSavings(double annualInterestRate, double savingsBalance) { //use parent constructor
        super(annualInterestRate, savingsBalance);
    }

    @Override
    public void calculateMonthlyInterest(double annualInterestRate, double savingsBalance){ //child override (polymorphism)
        if(savingsBalance >= 10000.0) {
            setsavingsBalance(getsavingsBalance() + getsavingsBalance() * (0.1 / 12));
        }
        else {
            super.calculateMonthlyInterest(annualInterestRate, savingsBalance);
        }

    }

}
