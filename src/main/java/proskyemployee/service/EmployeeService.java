package proskyemployee.service;

import org.springframework.stereotype.Service;
import proskyemployee.Employee;
import proskyemployee.exception.EmployeeNotFoundException;
import proskyemployee.exception.EmployeeStorageIsFullException;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService {

    private int employeeAmount = 10;

    private List<Employee> employees;
    List<Employee> employeesAll = new ArrayList<>(List.of(
            new Employee("Карманова", "Ольга"),
            new Employee("Аронова", "Наталья"),
            new Employee("Пиков", "Антон")));

    public EmployeeService(List employees) {
        this.employees = employees;
    }

    public int getEmployeeAmount() {
        return employeeAmount;
    }

    public String printAllEmployee() {
        return employeesAll.toString();
    }

    public void addEmployee(String firstName, String lastname) {
        if (employeesAll.size() >= employeeAmount) {
            throw new EmployeeStorageIsFullException();
        } else {
            Employee e = new Employee(firstName, lastname);
            employeesAll.add(e);
        }
    }

    public Employee findEmployee(String firstName, String lastname) {
        Employee e = new Employee(firstName, lastname);
        if (employeesAll.contains(e)) {
            return e;
        } else {
            throw new EmployeeNotFoundException();
        }
    }
}














