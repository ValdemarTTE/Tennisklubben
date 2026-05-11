package logger;

public enum LogLevel {
    INFO ("Info"),
    WARNING("Warning"),
    ERROR ("Error");

    private final String label;

    LogLevel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return label;
    }
}
