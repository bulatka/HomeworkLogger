import java.time.LocalDateTime;

public class Logger {
    protected int num = 1;

    public void log(String msg) {
        System.out.println("[(" + num++ + ") " + LocalDateTime.now() + "] " + msg);
    }

    private static Logger logger;

    private Logger() {}

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}