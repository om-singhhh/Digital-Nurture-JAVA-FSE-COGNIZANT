package Design_Patterns_and_Principles.AdapterPattern;

// Adapter for PayPal
public class PayPalAdapter implements PaymentProcessor {

    private PayPalGateway payPalGateway;

    public PayPalAdapter() {
        payPalGateway = new PayPalGateway();
    }

    @Override
    public void processPayment(double amount) {

        // Convert the common method call
        // into PayPal specific method
        payPalGateway.makePayment(amount);
    }
}