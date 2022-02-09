package project.util;

import project.model.Methodist;
import project.model.Teacher;

public class TeacherToMethodist implements Converter<Methodist,Teacher>{

    @Override
    public Methodist convert(Teacher t) {
        Converter<Methodist,Teacher> teacherConverter = tm -> new Methodist(t.getFirstName()
                ,t.getLastName()
                ,t.getGender()
                ,t.getDateOfBirth()
                ,t.getAddress());
        return teacherConverter.convert(t);
    }
}
