package Design_Patterns_and_Principles.ObsereverPattern;

public class WebApp implements Observer {

    @Override
    public void update(double price) {

        System.out.println("Web App : Stock Price Updated = " + price);

    }
}