package interfaces;
import java.time.LocalDateTime;

public interface ILogger {

    void logInfo( String message);
    void logWarning(String message);
    void logError(String message, Exception e);
    void clearLog();
    String timestampFormat();
}
