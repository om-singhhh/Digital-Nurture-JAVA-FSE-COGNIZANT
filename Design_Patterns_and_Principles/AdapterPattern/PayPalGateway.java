package Design_Patterns_and_Principles.AdapterPattern;
public  class PayPalGateway{
    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " processed using PayPal.");
    }
}