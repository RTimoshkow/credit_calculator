public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        double paymentAmount = service.calculate(9.99, 1_000_000, 12);
        System.out.println((int) paymentAmount);

        double paymentTwoYears = service.calculate(9.99, 1_000_000, 24);
        System.out.println((int) paymentTwoYears);

        double paymentThreeYears = service.calculate(9.99, 1_000_000, 36);
        System.out.println((int) paymentThreeYears);
    }
}
