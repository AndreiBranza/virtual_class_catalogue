package main;

import java.util.ArrayList;

public class Catalogue {
    private static final ArrayList<Catalogue> total_catalogues = new ArrayList<>();
    private static long id;
    private String className;
    private final ArrayList<Student> students = new ArrayList<>();


    private Catalogue() {
    }

    public Catalogue(String className) {
        this.className = className;
        id++;
        total_catalogues.add(this);
    }

    public static long getId() {
        return id;
    }

    public static ArrayList<Catalogue> getTotal_catalogues() {
        return total_catalogues;
    }

    public void addStudent_To_Catalogue(Student student) {
        students.add(student);
    }

    public void addGradeToStudent(int student_id, byte grade_value, Subject subject, Teacher assigning_Teacher) {
        for (Student student : students) {
            if (student.getStudent_Id() == student_id) {
                student.setGrade(grade_value, subject, assigning_Teacher);
            }
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getClassName() {
        return className;
    }
}
