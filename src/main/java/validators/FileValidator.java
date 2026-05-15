package validators;

import interfaces.IValidator;

import java.io.File;

public class FileValidator implements IValidator<File> {
    private String errorMessage;

    @Override
    public boolean validate(File file) {

        if (file == null) {
            errorMessage = "File cannot be null";
            return false;
        }

        if (!file.exists()) {
            errorMessage = "File does not exist";
            return false;
        }

        if (!file.isFile()) {
            errorMessage = "Invalid file";
            return false;
        }

        if (!file.getName().toLowerCase().endsWith(".csv")) {
            errorMessage = "File must be a CSV file";
            return false;
        }

        return true;
    }

    @Override
    public String getErrorMessage() {
        return errorMessage;
    }
}


