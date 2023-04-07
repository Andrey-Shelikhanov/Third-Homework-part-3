public class CreditPaymentService {

    public double calculate(double creditAmount, int loanPeriod) {
        double annualInterestRate = 9.99;
        double monthlyInterestRate = (annualInterestRate / 100) / 12;
        return creditAmount * (monthlyInterestRate + (monthlyInterestRate / (Math.pow(1 + monthlyInterestRate, loanPeriod) - 1)));
    }

}
