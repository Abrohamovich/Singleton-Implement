package ua.ithillel;

public class Application {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.printf("Is logger1 equal to logger2: %b\n",logger1.equals(logger2));

        logger1.logMessage("This is the first log message.");
        logger2.logMessage("This is the second log message.");

        System.out.printf("Is logger1 equal to logger2: %b\n",logger1.equals(logger2));

    }
}
