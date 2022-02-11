package project.servise.groupService;

import com.sun.org.apache.xpath.internal.VariableStack;
import project.model.Student;
import project.model.Teacher;

public interface GroupService {

    Teacher changeTeacher(Teacher newTeacher);

    void addStudentToGroup(Student student);
    void removeStudentFromGroup(Student student);

}
