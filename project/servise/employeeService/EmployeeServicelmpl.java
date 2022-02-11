package project.servise.employeeService;

import project.model.base.Employee;
import project.repositories.listEmployee.ListEmployee;
import project.repositories.listGroup.ListGroup;
import project.model.Teacher;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServicelmpl implements EmployeeService {

    private ListEmployee listEmployee;
    private ListGroup listGroup;

    public void init(ListEmployee listEmployee) {
        this.listEmployee = listEmployee;
    }


    @Override
    public void addEmployee(Employee newEmployee) {
        listEmployee.getListEmployee().add(newEmployee);
    }

    @Override
    public void removeEmployee(Employee newEmployee) {
        listEmployee.getListEmployee().remove(newEmployee);
    }

    @Override
    public List<Teacher> allTeacher() {
        return listEmployee.getListEmployee()
                .stream()
                .filter(t -> t instanceof Teacher)
                .map(t -> (Teacher) t)
                .collect(Collectors.toList());
    }
}
