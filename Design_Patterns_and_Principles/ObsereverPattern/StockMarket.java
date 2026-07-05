package Design_Patterns_and_Principles.ObsereverPattern;

import java.util.ArrayList;

public class StockMarket implements Stock {

    private ArrayList<Observer> observers = new ArrayList<>();

    private double stockPrice;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(stockPrice);
        }
    }

    // Change stock price
    public void setStockPrice(double stockPrice) {

        this.stockPrice = stockPrice;

        // Notify all observers
        notifyObservers();
    }

}