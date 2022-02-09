package project.servise.employeeService;

import project.base.Employee;
import project.model.Group;
import project.model.Teacher;

import java.util.List;

public interface EmployeeService {

    void addEmployee (Employee newEmployee);

    void removeEmployee (Employee newEmployee);

    public List<Teacher> allTeacher();

}
