package interfaces;
//<T> reusable for many object types, type-safe, avoids unnecessary casting
public interface IValidator <T> {
boolean validate (T obj);
String getErrorMessage();
}
