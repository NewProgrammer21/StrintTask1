package kz.bitlab.spring.sprintTask1.db;

import java.util.ArrayList;

public class DBManager {
    private static final ArrayList<Student> students=new ArrayList<>();
    private static long id=11L;

    static {
        students.add(new Student(1L, "name1", "surname1", 90, "null"));
        students.add(new Student(2L, "name2", "surname2", 45, "null"));
        students.add(new Student(3L, "name3", "surname3", 68, "null"));
        students.add(new Student(4L, "name4", "surname4", 95, "null"));
        students.add(new Student(5L, "name5", "surname5", 57, "null"));
        students.add(new Student(6L, "name6", "surname6", 26, "null"));
        students.add(new Student(7L, "name7", "surname7", 78, "null"));
        students.add(new Student(8L, "name8", "surname8", 83, "null"));
        students.add(new Student(9L, "name9", "surname9", 87, "null"));
        students.add(new Student(10L, "name10", "surname10", 84, "null"));
    }

    public static ArrayList<Student> getStudents() {return students; }

    public static void addStudent(Student student){
        student.setId(id);
        id++;
        students.add(student);
    }

    public static Student getStudent(int id){
        return students.stream().filter(student -> student.getId()==id).findFirst().orElse(null);
    }
}
