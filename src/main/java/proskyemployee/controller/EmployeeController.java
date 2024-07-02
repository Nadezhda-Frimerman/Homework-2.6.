package proskyemployee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import proskyemployee.Employee;
import proskyemployee.service.EmployeeService;

import java.util.ArrayList;
import java.util.Arrays;


@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee/add")
    public String add(@RequestParam (value = "firstName") String firstName,
                      @RequestParam (value = "lastName") String lastName){
        return firstName + lastName;
    }
// = new ArrayList<Employee>(Arrays.asList(tom, don, ann, kate));


}
