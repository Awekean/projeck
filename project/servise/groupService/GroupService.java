package project.servise.groupService;

;
import project.model.Group;
import project.model.Methodist;
import project.model.Student;
import project.model.Teacher;

public interface GroupService {

    Teacher changeTeacher(Teacher newTeacher);

    void init(Group group);
    void addStudentToGroup(Student student);
    void removeStudentFromGroup(Student student);
}
