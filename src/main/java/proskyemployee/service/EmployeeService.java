package proskyemployee.service;

import org.springframework.stereotype.Service;
import proskyemployee.Employee;
import proskyemployee.exception.EmployeeAlreadyAddedException;
import proskyemployee.exception.EmployeeNotFoundException;
import proskyemployee.exception.EmployeeStorageIsFullException;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService {

    private int employeeAmount = 10;

    private List<Employee> employees = new ArrayList<>(List.of(
            new Employee("Ольга", "Карманова"),
            new Employee("Наталья", "Аронова"),
            new Employee("Иван","Петров"),
            new Employee("Антон", "Пиков")));

    public EmployeeService(List employees) {
        this.employees = employees;
    }

    public int getEmployeeAmount() {
        return employeeAmount;
    }

    public String printAllEmployee() {
        return employees.toString();
    }

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

    public Employee findEmployee(String firstName, String lastName) {
        Employee e = null;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstName() == firstName && employees.get(i).getLastName() == lastName) {
                e = employees.get(i);
            }
        }

        return e;
    }

    public void removeEmployee(String firstName, String lastName) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstName() == firstName && employees.get(i).getLastName() == lastName) {
                employees.remove(i);
            } else throw new EmployeeNotFoundException();
        }
    }
}














