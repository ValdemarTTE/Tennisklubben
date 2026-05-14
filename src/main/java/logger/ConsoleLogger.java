package logger;
import interfaces.ILogger;
import util.ConsoleColors;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleLogger implements ILogger {
    // Giver logger et tidsstempel
    private final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public void logInfo(String message){
        String timestamp = LocalDateTime.now().format(formatter);
        System.out.println(timestamp + " [INFO]: " + message);
    }

    @Override
    public void logWarning(String message){
        String timestamp = LocalDateTime.now().format(formatter);
        // Gul bruges til advarsler
        System.out.println(ConsoleColors.YELLOW + timestamp + " [WARNING]: " + message);
    }

    @Override
    public void logError(String message, Exception e) {
        System.out.println(
                ConsoleColors.RED +
                        timestampFormat() +
                        " [ERROR]: " + message +
                        ConsoleColors.RESET
        );

        if (e != null) {
            e.printStackTrace();
        }

    }

    @Override
    public void clearLog() {
        // Console logs usually cannot truly be cleared.
        // Optional: simulate clear screen
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }

    @Override
    public String timestampFormat() {
        return LocalDateTime.now().format(formatter);
    }
}

