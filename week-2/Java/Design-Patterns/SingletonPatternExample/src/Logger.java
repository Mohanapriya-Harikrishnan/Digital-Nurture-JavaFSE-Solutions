public class Logger {

    // Single instance of Logger
    private static Logger instance;

    // Private constructor
    private Logger() {

    }

    // Method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}