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
private Employee employee;
    private final int employeeAmount;

    private List<Employee> employees;

    public EmployeeService() {
        this.employees = new ArrayList<>(List.of(
                new Employee("Ольга", "Карманова"),
                new Employee("Иван","Петров"),
                new Employee("Наталья", "Аронова"),
                new Employee("Антон", "Пиков")));
        this.employeeAmount=10;
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
        int a=-1;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstName().equals(firstName)
                    && employees.get(i).getLastName().equals(lastName)) {
                a=i;
            }
        }
        if (a<0){
            throw new EmployeeNotFoundException();
        }
        else return employees.get(a);
    }

    public void removeEmployee (String firstName, String lastName) {
        int r=-1;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstName().equals(firstName)
                    && employees.get(i).getLastName().equals(lastName)) {
                r=i;
            }
        }
        if (r<0) {throw new EmployeeNotFoundException();}
        else {employees.remove(r);}

    }
}














