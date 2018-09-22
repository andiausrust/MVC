package com.andi.view;

import com.andi.model.Employee;

public class EmployeeDashbordView {

    private Employee employee;

    public void printEmployeeInformation(Employee employee){
        System.out.println("Name: " + employee.getFirstName() + " " + employee.getLastName());
        System.out.println("SSN: " + employee.getSsNumber());
        System.out.println("Salary: " + employee.getSalaray());


    }

}
