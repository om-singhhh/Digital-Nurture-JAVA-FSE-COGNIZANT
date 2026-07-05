package Design_Patterns_and_Principles.AdapterPattern;

// Adapter for PayPal
public class StripeAdapter implements PaymentProcessor {

    private StripeGateway stripeGateway;

    public StripeAdapter() {
        stripeGateway = new StripeGateway();
    }

    @Override
    public void processPayment(double amount) {

        // Convert common method call
        // into Stripe specific method
        stripeGateway.pay(amount);
    }
}