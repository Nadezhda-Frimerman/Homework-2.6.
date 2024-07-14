package proskyemployee.exception;

public class EmployeeAlreadyAddedException extends RuntimeException {
    public String EmployeeAlreadyAddedException () {
        return ("уже есть такой сотрудник");
    }
}
