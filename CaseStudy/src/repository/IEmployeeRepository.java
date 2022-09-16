package repository;

import model.Employee;

import java.util.List;

public interface IEmployeeRepository {
    void addEmployee(Employee employee);
    List<Employee> findAll();
    void editEmployee(int index, Employee employee);
}
