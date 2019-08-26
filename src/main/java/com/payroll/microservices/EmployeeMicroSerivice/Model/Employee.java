package com.payroll.microservices.EmployeeMicroSerivice.Model;

public class Employee {

    private String firstName;
    private String lastName;
    private double salary;
    private Long empId;

    public Employee (String firstName, String lastName ,double salary, Long empId ){
        super();
        this.empId=empId;
        this.salary = salary;
        this.firstName=firstName;
        this.lastName =lastName;
    }

    public Employee(){ }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }
}
