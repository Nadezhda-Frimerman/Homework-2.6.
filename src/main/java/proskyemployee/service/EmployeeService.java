package proskyemployee.service;

import proskyemployee.Employee;

public interface EmployeeService {
    int getEmployeeAmount();

    String printAllEmployee();

    void addEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

    void removeEmployee(String firstName, String lastName);
}
