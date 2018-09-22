package com.andi.controller;

import com.andi.model.Employee;
import com.andi.view.EmployeeDashbordView;

public class EmployeeController {

    private Employee employee;
    private EmployeeDashbordView employeeDashbordView;

    public EmployeeController(Employee employee, EmployeeDashbordView employeeDashbordView) {
        this.employee = employee;
        this.employeeDashbordView = employeeDashbordView;
    }

    public void setEmployee(String name, String lastName){
        employee.setFirstName(name);
        employee.setLastName(lastName);
    }

    public String getEmployeeName(){
        return employee.getFirstName() + " " + employee.getLastName();
    }

    public void setSSN(String ssn){
        employee.setSsNumber(ssn);
    }

    public String getSSN() {
        return  employee.getSsNumber();
    }

    // update our view
    public void updateDashBoardView() {
        employeeDashbordView.printEmployeeInformation(employee);
    }
}
