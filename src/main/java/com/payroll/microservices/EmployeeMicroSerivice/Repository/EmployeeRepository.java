package com.payroll.microservices.EmployeeMicroSerivice.Repository;

import com.payroll.microservices.EmployeeMicroSerivice.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
