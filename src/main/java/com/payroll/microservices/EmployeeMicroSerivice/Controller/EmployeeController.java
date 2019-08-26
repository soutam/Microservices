package com.payroll.microservices.EmployeeMicroSerivice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.payroll.microservices.EmployeeMicroSerivice.Model.Employee;
@RestController
public class EmployeeController {

    @GetMapping("/employee/{empId}")
    public Employee getEmployeeDetails(@PathVariable Long empId){

        return new Employee("Amit","roy",20000,001L);
    }
}
