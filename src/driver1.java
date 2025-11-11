public class driver1 {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setsavingsBalance(2000.00);
        saver2.setsavingsBalance(3000.00);

        saver1.modifyInterestRate(0.04);
        saver2.modifyInterestRate(0.04);

        saver1.calculateMonthlyInterest(saver1.getAnnualInterestRate(), saver1.getsavingsBalance());
        saver2.calculateMonthlyInterest(saver1.getAnnualInterestRate(), saver1.getsavingsBalance());

        System.out.printf("saver1's balance one month with 4%% interest: %.2f\n",saver1.getsavingsBalance());
        System.out.printf("saver2's balance one month with 4%% interest: %.2f\n\n", saver2.getsavingsBalance());

        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest(saver1.getAnnualInterestRate(), saver1.getsavingsBalance());
        saver2.calculateMonthlyInterest(saver1.getAnnualInterestRate(), saver1.getsavingsBalance());

        System.out.printf("saver1's balance one month with 5%% interest: %.2f\n",saver1.getsavingsBalance());
        System.out.printf("saver2's balance one month with 5%% interest: %.2f", saver2.getsavingsBalance());

    }
}
/*
test:
saver1's balance one month with 4% interest: 2006.67
saver2's balance one month with 4% interest: 3006.69

saver1's balance one month with 5% interest: 2015.03
saver2's balance one month with 5% interest: 3015.08
Process finished with exit code 0
 */