package project.servise.methodistService;

import project.model.Methodist;
import project.model.Teacher;

public interface MethodistService {

    void init(Methodist methodist);
    void addTeacher (Teacher newTeacher);
    void removeTeacher (Teacher newTeacher);


}
