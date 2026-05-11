package logger;

public enum LogLevel {
    INFO,
    WARNING,
    ERROR;


    public String label() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
