package constructor;

import java.util.ArrayList;

public class Student {
    // name grade  courses
    private String name;
    private String grade;
    private ArrayList<String> courses = new ArrayList<String>();
    int courseIndex = 0;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        boolean checkRemovedCourse = courses.remove(course);

        if (!checkRemovedCourse) {
            System.out.println(course + " not found !!!");
        }
    }
}
