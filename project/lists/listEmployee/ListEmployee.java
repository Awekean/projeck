package project.lists.listEmployee;

import project.base.Employee;

import java.util.ArrayList;
import java.util.List;

public class ListEmployee {

    private List<Employee> listEmployee;

    public ListEmployee() {
        this.listEmployee = new ArrayList<>();
    }

    public List<Employee> getListEmployee() {
        return listEmployee;
    }
}
