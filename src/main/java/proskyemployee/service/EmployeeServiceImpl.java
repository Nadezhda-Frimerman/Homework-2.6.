package proskyemployee.service;

import org.springframework.stereotype.Service;
import proskyemployee.Employee;
import proskyemployee.exception.EmployeeAlreadyAddedException;
import proskyemployee.exception.EmployeeNotFoundException;
import proskyemployee.exception.EmployeeStorageIsFullException;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final int employeeAmount;

    private List<Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new ArrayList<>(List.of(
                new Employee("Ольга", "Карманова"),
                new Employee("Иван","Петров"),
                new Employee("Наталья", "Аронова"),
                new Employee("Антон", "Пиков")));
        this.employeeAmount=10;
    }

    @Override
    public int getEmployeeAmount() {
        return employeeAmount;
    }

    @Override
    public String printAllEmployee() {
        return employees.toString();
    }

    @Override
    public void addEmployee(String firstName, String lastName) {
        Employee e = new Employee(firstName, lastName);
        if (employees.size() >= employeeAmount) {
            throw new EmployeeStorageIsFullException();
        } else if (employees.contains(e)) {
            throw new EmployeeAlreadyAddedException();
        } else {
            employees.add(e);
        }
    }

    @Override
    public Employee findEmployee(String firstName, String lastName) {
        for (Employee employee : employees) {
            if (employee.getFirstName().equals(firstName)
                    && employee.getLastName().equals(lastName)){
                return employee;
            }
        }
        throw new EmployeeNotFoundException();
    }

    @Override
    public void removeEmployee(String firstName, String lastName) {
        Employee e = findEmployee(firstName,lastName);
        employees.remove(e);

    }
}














