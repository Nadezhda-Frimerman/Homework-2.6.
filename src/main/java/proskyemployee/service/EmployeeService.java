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
    private int employeeAmount;
    Employee tom=new Employee("Tom","Smith");
    Employee don=new Employee("Don","Adams");
    Employee ann =new Employee("Ann","Henson");
    Employee kate=new Employee("Kate","Tomson");
    private List<Employee> employees = new ArrayList<Employee>(Arrays.asList(tom,don,ann,kate));



    public EmployeeService(int employeeAmount,List employees){
        this.employeeAmount=employeeAmount;
        this.employees= employees;
    }
    public void addEmployee(String firstName, String lastname){
        Employee e =new Employee(firstName,lastname);
        if (employees.size()>=employeeAmount){


        }
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i)==null){
                employees.add(new Employee(firstName, lastname));
            }
        }
    }


}
