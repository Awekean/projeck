package project.servise.groupService;

import project.model.Group;
import project.model.Student;
import project.model.Teacher;

public class GroupServiceImpl implements GroupService {

    private Group group;

    public void init (Group group){
        this.group = group;
    }

    @Override
    public Teacher changeTeacher(Teacher newTeacher) {
        group.setTeacher(newTeacher);
        return newTeacher;
    }

    @Override
    public  void addStudentToGroup(Student student) {
        group.getStudentList().add(student);
    }

    @Override
    public void removeStudentFromGroup(Student student) {
        group.getStudentList().remove(student);
    }
}
