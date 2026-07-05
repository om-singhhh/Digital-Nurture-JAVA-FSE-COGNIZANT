package Design_Patterns_and_Principles.SingleTonPattern;

public class Logger {

    // Single instance of Logger class
    private static Logger instance;

    // Private constructor
    private Logger() {

    }

    // Method to return the single Logger object
    public static Logger getInstance() {

        // Double Checked Locking

        if (instance == null) {

            synchronized (Logger.class) {

                if (instance == null) {
                    instance = new Logger();
                }

            }
        }

        return instance;
    }

    // Method for logging messages
    public void log(String message) {
        System.out.println("LOG : " + message);
    }
}