package project.repositories.listStudent;

import project.model.Student;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {

    private List<Student> listStudent;

    public ListStudent() {
        this.listStudent = new ArrayList<>();
    }

    public List<Student> getListStudent() {
        return listStudent;
    }
}
