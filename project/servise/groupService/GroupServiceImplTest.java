package project.servise.groupService;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Test;
import project.constant.Constant;
import project.model.Student;
import project.model.base.Address;

import static org.junit.Assert.*;

public class GroupServiceImplTest {

    @Test
    public void addStudentToGroup() {

        GroupService groupService = new GroupServiceImpl();

        Student student = new Student("Vlad", "Penkin", Constant.GENDER_MAN, 20,
                new Address("Minsk", "Kirova", 11, 1));
        groupService.addStudentToGroup(student).;


        Student student2 = new Student("Tolik", "Penkin", Constant.GENDER_WOMAN, 22,
                new Address("Grodno", "Lenina", 4, 3));
        groupService.addStudentToGroup(student2);

        assertEquals(2,groupService.addStudentToGroup(student));

    }
}