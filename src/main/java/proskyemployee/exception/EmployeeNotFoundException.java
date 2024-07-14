package proskyemployee.exception;

public class EmployeeNotFoundException extends RuntimeException{
    public String EmployeeNotFoundException(){
        return "сотрудник не найден";
    }
}
