package com.andi;

import com.andi.controller.EmployeeController;
import com.andi.model.Employee;
import com.andi.view.EmployeeDashbordView;

public class Main {

    public static void main(String[] args) {

        Employee james = retrieveEmployeeFromServer();

        // create view to which we'll write our employee information into
        EmployeeDashbordView view = new EmployeeDashbordView();

        // create controller
        EmployeeController controller = new EmployeeController(james, view);

        controller.updateDashBoardView();

    }

    public static Employee retrieveEmployeeFromServer() {
        Employee employee = new Employee();
        employee.setSsNumber("32345");
        employee.setFirstName("Andi");
        employee.setLastName("Bond");
        employee.setSalaray(12394);
        return employee;
    }
}
