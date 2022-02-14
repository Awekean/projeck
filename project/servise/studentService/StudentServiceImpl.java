package project.servise.studentService;

import project.model.Student;
import project.repositories.listStudent.ListStudent;

import java.util.List;
import java.util.stream.Collectors;

public class StudentServiceImpl implements StudentService {

    private ListStudent listStudent;

    public void init(ListStudent listStudent) {
        this.listStudent = listStudent;
    }

    @Override
    public void addStudent(Student newStudent) {
        listStudent.getListStudent().add(newStudent);
    }

    @Override
    public void removeStudent(Student newStudent) {
        listStudent.getListStudent().remove(newStudent);
    }

    @Override
    public List<Student> allStudent() {
        return listStudent.getListStudent()
                .stream()
                .filter(t -> t instanceof Student)
                .map(t -> (Student) t)
                .collect(Collectors.toList());
    }
}
