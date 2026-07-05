package Design_Patterns_and_Principles.AdapterPattern;

public class StripeGateway {

    public void pay(double amount) {
        System.out.println("Payment of Rs." + amount + " processed using Stripe.");
    }

}