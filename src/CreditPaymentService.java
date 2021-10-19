public class CreditPaymentService {

    public double calculate(double percent, int sum, double period) {

        double payment = (((percent / 1200 * (Math.pow((1 + percent / 1200), period)))
                / (Math.pow((1 + percent / 1200), period) - 1)) * sum);
        return payment;

    }
}
