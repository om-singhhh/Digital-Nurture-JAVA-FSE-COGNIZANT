package Design_Patterns_and_Principles.ObsereverPattern;

public class MobileApp implements Observer {

    @Override
    public void update(double price) {

        System.out.println("Mobile App : Stock Price Updated = " + price);

    }
}