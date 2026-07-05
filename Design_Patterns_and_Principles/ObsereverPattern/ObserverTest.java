package Design_Patterns_and_Principles.ObsereverPattern;

public class ObserverTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        // Register observers
        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        // Change stock price
        stockMarket.setStockPrice(1500);

        System.out.println();

        stockMarket.setStockPrice(1800);

    }
}