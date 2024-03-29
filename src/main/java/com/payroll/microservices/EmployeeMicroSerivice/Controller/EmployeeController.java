package com.payroll.microservices.EmployeeMicroSerivice.Controller;

import com.payroll.microservices.EmployeeMicroSerivice.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.payroll.microservices.EmployeeMicroSerivice.Model.Employee;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    Environment environment;

    @GetMapping("/employee/{empId}")
    public Employee getEmployeeDetails(@PathVariable Long empId){

        //return new Employee("Amit","roy",20000,001L);

        Optional<Employee> employeeDetails = employeeRepository.findById(empId);

       if(employeeDetails.isPresent()){
           Employee employee = employeeDetails.get();
           employee.setPort(environment.getProperty("local.server.port"));
           return employee;
       }
       else
           return null;

    }
}
