package validators;

import interfaces.IValidator;
import model.Member;

import java.io.File;

public class MemberValidator implements IValidator<Member> {
    private String errorMessage;

    @Override
    public boolean validate(File file, Member member) {

        if (!checkName(member.getName())) {
            errorMessage = "Invalid Name";
            return false;
        }

        if (!checkAge(member.getAge())) {
            errorMessage = "Invalid Age";
            return false;
        }

        return true;
    }

    @Override
    public String getErrorMessage(){
        return errorMessage;
    }

    private boolean checkAge (int age){

        return age > 0 && age < 120;
    }


    private boolean checkName (String name){
        return name !=null && !name.trim().isEmpty();
    }
}
