package proskyemployee.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import proskyemployee.Employee;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class EmployeeService {


    private int employeeAmount=4;

    private List<Employee> employees;


    public EmployeeService(List employees) {
        this.employees = employees;
    }

    public int getEmployeeAmount() {
        return employeeAmount;
    }

    public void setEmployeeAmount(int employeeAmount) {
        this.employeeAmount = employeeAmount;
    }

}
//    public void addEmployee(String firstName, String lastname){
//        if (employees.size()>=employeeAmount) {
//            System.out.println("");
//        }
//            Employee e =new Employee(firstName,lastname);
//
//        for (int i = 0; i < employees.size(); i++) {
//           if (e.equals(employees.get(i))){
//               System.out.println("");
//           };
//           else {
//
//
//        }
//        for (int i = 0; i < employees.size(); i++) {
//            if (employees.get(i)==null){
//                employees.add(new Employee(firstName, lastname));
//            }
//        }




