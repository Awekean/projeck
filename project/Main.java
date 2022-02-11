package project;

import project.constant.Constant;
import project.model.Group;
import project.model.Student;
import project.model.Teacher;
import project.model.base.Address;
import project.repositories.listStudent.ListStudent;
import project.servise.groupService.GroupService;
import project.servise.groupService.GroupServiceImpl;

import static project.constant.Constant.GENDER_MAN;
import static project.constant.Constant.GENDER_WOMAN;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Anna", "Seriozn1", GENDER_WOMAN, 19,
                new Address("Grodno", "Ojesk", 11, 11));
        Student student2 = new Student("Vlad", "Penkin", Constant.GENDER_MAN, 20,
                new Address("Minsk", "Kirova", 11, 1));
        Student student3 = new "Vlad", "Penkin", Constant.GENDER_MAN, 20,
                new Address("Minsk", "Kirova", 11, 1));
        Student student4 = new Student("Vasili", "Veseli", GENDER_MAN, 19,
                new Address("Vitebsk", "Ojesko", 14, 14));
        Student student5 = new Student("Vasili", "Veseli", GENDER_WOMAN, 19,
                new Address("Grodno", "Ojesko", 15, 15));

        Teacher teacher1 = new Teacher("Mari", "Spiridonova", GENDER_WOMAN, 34,
                new Address("Grodno", "Limoj", 24, 30));

        Teacher teacher2 = new Teacher("pe", "Nat", GENDER_MAN, 55,
                new Address("Minsk", "Mir", 19, 85));


        GroupService groupServise = new GroupServiceImpl();
        ((GroupServiceImpl) groupServise).init(group1);
        groupServise.addStudentToGroup(student1);
        groupServise.addStudentToGroup(student2);

        ((GroupServiceImpl) groupServise).init(group2);
        groupServise.addStudentToGroup(student3);
        groupServise.addStudentToGroup(student4);
        groupServise.addStudentToGroup(student5);

        System.out.println(group1.getStudentList());
        System.out.println(group2.getStudentList());
    }
}
