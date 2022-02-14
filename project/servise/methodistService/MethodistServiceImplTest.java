package project.servise.methodistService;

import org.junit.Before;
import org.junit.Test;
import project.constant.Constant;
import project.model.Methodist;
import project.model.Teacher;
import project.model.base.Address;

import static org.junit.Assert.*;

public class MethodistServiceImplTest {

    private MethodistService methodistService;
    private Teacher teacher;
    private Methodist methodist;

    @Before
    public void generateAttribute() {

        methodist = new Methodist("Kata", "kim", Constant.GENDER_WOMAN, 32,
                new Address("Mir", "Kirova", 11, 11));

        methodistService = new MethodistServiceImpl();

        teacher = new Teacher("Anna", "Kitova", Constant.GENDER_WOMAN, 34,
                new Address("Mir", "Kotova", 22, 12));

        methodistService.init(methodist);
    }

    @Test
    public void addTeacher() {
        methodistService.addTeacher(teacher);
        assertEquals(1,methodist.getTeacherList().size());
        assertEquals(teacher,methodist.getTeacherList().get(0));
        assertNotNull(teacher);
    }

    @Test
    public void removeTeacher() {
        methodistService.removeTeacher(teacher);
        assertEquals(0,methodist.getTeacherList().size());
        assertNotNull(teacher);
    }
}
