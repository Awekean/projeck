package project;

import project.constant.Constant;
import project.model.Group;
import project.model.Student;
import project.model.Teacher;
import project.model.base.Address;
import project.servise.groupService.GroupService;
import project.servise.groupService.GroupServiceImpl;


import static project.constant.Constant.GENDER_MAN;
import static project.constant.Constant.GENDER_WOMAN;

public class Main {

    public static void main(String[] args) {

        Student Anna = new Student("Anna", "Serinka", GENDER_WOMAN, 19,
                new Address("Grodno", "Ojesk", 11, 11));
        Student student2 = new Student("Vlad", "Penkin", Constant.GENDER_MAN, 20,
                new Address("Minsk", "Kirova", 11, 1));
        Student student3 = new Student( "Vlad", "Penkin", Constant.GENDER_MAN, 20,
                new Address("Minsk", "Kirova", 11, 1));
        Student student4 = new Student("Vasili", "Veseli", GENDER_MAN, 19,
                new Address("Vitebsk", "Ovesko", 14, 14));

        Teacher teacher1 = new Teacher("Mari", "Spiridonova", GENDER_WOMAN, 34,
                new Address("Mogilev", "Limoj", 24, 30));

        Teacher teacher2 = new Teacher("Petr", "Nat", GENDER_MAN, 55,
                new Address("Minsk", "Mir", 19, 85));

        Group group1 = new Group("12",2,2020,2025,teacher1);
        Group group2 = new Group("13",1,2021,2026,teacher2);

        GroupService groupServise = new GroupServiceImpl();

        groupServise.init(group1);
        groupServise.addStudentToGroup(Anna);
        groupServise.addStudentToGroup(student2);

        groupServise.init(group2);
        groupServise.addStudentToGroup(student3);
        groupServise.addStudentToGroup(student4);

        System.out.println(group1.getStudentList());
        System.out.println(group2.getStudentList());
    }
}
