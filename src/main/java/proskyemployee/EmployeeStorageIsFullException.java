package proskyemployee;

public class EmployeeStorageIsFullException extends RuntimeException{
    public void EmployeeNotFoundException(){
        super ("превышен лимит количества сотрудников в фирме");
    }
}
