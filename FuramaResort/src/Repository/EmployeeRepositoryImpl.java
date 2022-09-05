package Repository;

import Model.Employee;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private ArrayList<Employee> employeeList;
    @Override
    public void displayListEmployee() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNewEmployee(Employee newEmployee) {
        this.employeeList.add(newEmployee);
    }

    @Override
    public void editEmployee() {

    }
}
