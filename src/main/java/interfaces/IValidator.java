package interfaces;

import model.Member;

import java.io.File;

//<T> reusable for many object types, type-safe, avoids unnecessary casting
public interface IValidator {

    boolean validate(File file, Member member);
}
