package project.servise.employeeService;

import project.model.Teacher;
import project.model.base.Employee;

import java.util.List;

public interface EmployeeService {

    void addEmployee (Employee newEmployee);

    void removeEmployee (Employee newEmployee);

    public List<Teacher> allTeacher();

}
