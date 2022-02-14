package project.model;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String groupName;
    private int course;
    private int yearOfAdmission;
    private int yearOfEnding;
    private List<Student> studentList;
    private Teacher teacher;

    public Group(String groupName, int course, int yearOfAdmission, int yearOfEnding, Teacher teacher) {
        this.groupName = groupName;
        this.course = course;
        this.yearOfAdmission = yearOfAdmission;
        this.yearOfEnding = yearOfEnding;
        this.studentList = new ArrayList<>();
        this.teacher = teacher;
    }

    public String getGroupName() {
        return groupName;
    }

    public Group setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public int getCourse() {
        return course;
    }

    public Group setCourse(int course) {
        this.course = course;
        return this;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Group setTeacher(Teacher teacher) {
        this.teacher = teacher;
        return this;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public int getYearOfEnding() {
        return yearOfEnding;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", course=" + course +
                ", yearOfAdmission=" + yearOfAdmission +
                ", yearOfEnding=" + yearOfEnding +
                ", studentList=" + studentList +
                ", teacher=" + teacher +
                '}';
    }
}
