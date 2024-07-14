package proskyemployee.exception;


public class EmployeeStorageIsFullException extends RuntimeException {
    public String EmployeeStorageIsFullException() {
        return ("превышен лимит количества сотрудников в фирме");
    }
}