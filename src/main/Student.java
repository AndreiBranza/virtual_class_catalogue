package main;

import java.util.ArrayList;

public class Student extends Person {
    private static final ArrayList<Student> total_students = new ArrayList<>();
    private final ArrayList<Grade> grades = new ArrayList<>();
    private long id;

    private Student() {
    }

    public Student(String first_name, String last_name, String dob) {
        generateId();
        this.id = getId();
        this.first_name = first_name;
        this.last_name = last_name;
        setDob(dob);
        total_students.add(this);
    }

    public static ArrayList<Student> getTotal_students() {
        return total_students;
    }

    public long getStudent_Id() {
        return id;
    }

    public String getFull_Name() {
        return first_name + " " + last_name;
    }

    public void changeName(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public String getDob() {
        return dob.toString();
    }

    public double getGrade_Value(Subject subject) {
        for (Grade grade : grades) {
            if (grade.getSubject() == subject)
                return grade.getGrade_Value();
        }
        return 0;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrade(double value, Subject subject, Teacher teacher) {
        grades.add(new Grade(subject, value, teacher));
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Date of birth= " + getDob() +
                ", name = " + getFull_Name() +
                ", grades=" + grades +
                '}';
    }
}
