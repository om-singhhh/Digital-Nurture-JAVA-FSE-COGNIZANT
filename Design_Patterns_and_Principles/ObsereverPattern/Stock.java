package Design_Patterns_and_Principles.ObsereverPattern;

// Subject Interface
public interface Stock {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}