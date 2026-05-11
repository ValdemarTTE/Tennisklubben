package interfaces;
import java.time.LocalDateTime;

public interface ILogger {
    String LOG_FILE_PATH = "application.log";
    void logInfo( String message);
    void logWarning(String message);
    void logError(String message, Exception e);
    void clearLog();
    LocalDateTime timestampFormat();
}
