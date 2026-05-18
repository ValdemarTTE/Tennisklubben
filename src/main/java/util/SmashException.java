package util;

public class SmashException {

    public static void handle(Exception e) {

        if (e instanceof FileStorageException) {
            System.out.println("");
            System.out.println(e.getMessage());
        } else if (e instanceof InvalidDateException) {
            System.out.println("");
            System.out.println(e.getMessage());
        } else if (e instanceof MemberNotFoundException) {
            System.out.println("");
            System.out.println(e.getMessage());
        } else if (e instanceof FileWriteException) {
            System.out.println("");
            System.out.println(e.getMessage());
        } else if(e instanceof FileReadException) {
            System.out.println("");
            System.out.println(e.getMessage());
        } else {
            System.out.println("Unknown error ");
            System.out.println(e.getMessage());
        }

    }

    public static class FileWriteException extends Exception {

        public FileWriteException(String message) {
            super(message);
        }
    }

    public static class FileReadException extends Exception {

        public FileReadException(String message) {
            super(message);
        }
    }

    public static class FileStorageException extends Exception {

        public FileStorageException(String message) {
            super(message);
        }
    }

    public static class InvalidDateException extends Exception {

        public InvalidDateException(String message) {
            super(message);
        }
    }

    public static class MemberNotFoundException extends Exception {

        public MemberNotFoundException(String message) {
            super(message);
        }

    }

}
