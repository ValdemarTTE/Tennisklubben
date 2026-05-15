package logger;

import interfaces.ILogger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger implements ILogger {

    private static final String LOG_FILE_PATH = "log.csv";
    private String LOG_FILE = LOG_FILE_PATH;

    public String getLOG_FILE() {
        return LOG_FILE;
    }

    public void setLOG_FILE(String LOG_FILE) {
        this.LOG_FILE = LOG_FILE;
    }


    @Override
    public void logInfo(String message) {
            log(LogLevel.INFO,message, null);

    }

    @Override
    public void logWarning(String message) {
        log(LogLevel.WARNING,message,null);

    }

    @Override
    public void logError(String message, Exception e) {
        log(LogLevel.ERROR, message,null);

    }

    @Override
    public void clearLog() {
        try (FileWriter fileWriter = new FileWriter(LOG_FILE, false)) {
            fileWriter.write("");
        } catch (IOException e) {
            System.out.println("Error clearing log file.");
        }
    }

    @Override
    public String timestampFormat() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));

    }

    private void log(LogLevel level, String message, Exception e) {


        try (FileWriter fileWriter = new FileWriter(LOG_FILE, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {

            String time = timestampFormat().toString();
            String line = time + " " + level.label() + " " + message;

            if (e != null) {
                line += " | " + e;
            }

            printWriter.println(line);

        } catch (IOException ex) {
            System.out.println("Error writing to log file.");
        }
    }
}
