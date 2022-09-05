package Repository;

import Model.Employee;

public interface EmployeeRepository {
    void displayListEmployee();
    void addNewEmployee(Employee newEmployee);
    void editEmployee();
}
