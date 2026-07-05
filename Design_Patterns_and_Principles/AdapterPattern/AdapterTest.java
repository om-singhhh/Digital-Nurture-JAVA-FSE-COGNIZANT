package Design_Patterns_and_Principles.AdapterPattern;

public class AdapterTest {

    public static void main(String[] args) {

        PaymentProcessor paypal = new PayPalAdapter();
        paypal.processPayment(1500);

        PaymentProcessor stripe = new StripeAdapter();
        stripe.processPayment(2500);

    }
}