public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        // Расчет по скриншоту №1
        double creditAmount = 1_000_000;
        int loanPeriod = 12;
        double monthlyPayment = service.calculate(creditAmount,loanPeriod);
        System.out.println("Расчет №1 : " + (int) monthlyPayment );

        // Расчет по скриншоту №2
        double creditAmount2 = 1_000_000;
        int loanPeriod2 = 24;
        double monthlyPayment2 = service.calculate(creditAmount2,loanPeriod2);
        System.out.println("Расчет №2 : " + (int) monthlyPayment2 );

        // Расчет по скриншоту №3
        double creditAmount3 = 1_000_000;
        int loanPeriod3 = 36;
        double monthlyPayment3 = service.calculate(creditAmount3,loanPeriod3);
        System.out.println("Расчет №3 : " + (int) monthlyPayment3 );
    }
}