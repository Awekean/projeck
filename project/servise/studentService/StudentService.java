package project.servise.studentService;

import project.model.Student;

import java.util.List;

public interface StudentService {

    void addStudent (Student newStudent);

    void removeStudent (Student newStudent);

    public List<Student> allStudent();
}
