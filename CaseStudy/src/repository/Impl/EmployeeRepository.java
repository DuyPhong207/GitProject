package repository.Impl;

import model.Employee;
import repository.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public void editEmployee(int index, Employee employee) {
        employeeList.set(index, employee);
    }
}
