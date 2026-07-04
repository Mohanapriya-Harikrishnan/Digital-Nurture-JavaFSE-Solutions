public class Logger {

<<<<<<< HEAD
    private static Logger instance;

    private Logger() {
        // Private constructor
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
=======
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

>>>>>>> a4a7a8b (Completed Bootstrap Exercise 1.1 and Singleton Pattern Example)
        return instance;
    }
}