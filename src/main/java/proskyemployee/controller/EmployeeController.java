package proskyemployee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import proskyemployee.Employee;
import proskyemployee.service.EmployeeService;

import java.util.ArrayList;
import java.util.Arrays;


@RestController
@RequestMapping ("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public void addEmployee(@RequestParam (value = "firstName") String firstName,
                      @RequestParam (value = "lastName") String lastName){
        employeeService.addEmployee(firstName,lastName);
    }
    @GetMapping (path = "/print")
    public String printEmployees(){
        return employeeService.printAllEmployee();
    }
    @GetMapping("/find")
    public String findEmployee(@RequestParam (value = "firstName") String firstName,
                    @RequestParam (value = "lastName") String lastName){
        return employeeService.findEmployee(firstName,lastName).toString();
    }

}
