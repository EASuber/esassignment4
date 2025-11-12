public class driver2 {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SpecialSavings(0.04,2000.00);
        SavingsAccount saver2 = new SpecialSavings(0.04, 3000.00);

        saver1.calculateMonthlyInterest();

        System.out.printf("saver1 Balance: %.2f\n", saver1.getsavingsBalance());

        saver1.deposit(8000);
        saver1.withdraw(6.666);

        System.out.printf("saver1 Balance: %.2f\n", saver1.getsavingsBalance());

        saver1.calculateMonthlyInterest();

        System.out.printf("saver1 Balance: %.2f\n", saver1.getsavingsBalance());

        saver1.withdraw(8000);

        saver1.calculateMonthlyInterest();

        System.out.printf("saver1 Balance: %.2f\n\n", saver1.getsavingsBalance());



        saver2.calculateMonthlyInterest();

        System.out.printf("saver2 Balance: %.2f\n", saver2.getsavingsBalance());

        saver2.withdraw(2000);

        saver2.calculateMonthlyInterest();

        System.out.printf("saver2 Balance: %.2f\n", saver2.getsavingsBalance());

        saver2.deposit(10000);

        saver2.calculateMonthlyInterest();

        System.out.printf("saver2 Balance: %.2f\n", saver2.getsavingsBalance());


    }
}

/*
Test:
saver1 Balance: 2006.67
saver1 Balance: 10000.00
saver1 Balance: 10083.33
saver1 Balance: 2090.28

saver2 Balance: 3010.00
saver2 Balance: 1013.37
saver2 Balance: 11105.14

Process finished with exit code 0
 */