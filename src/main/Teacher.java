package main;

import java.util.ArrayList;

public class Teacher extends Person {
    private static final ArrayList<Teacher> total_teachers = new ArrayList<>();
    private long id;

    private Teacher() {
    }

    public Teacher(String first_name, String last_name, String dob) {
        generateId();
        this.id = getId();
        this.first_name = first_name;
        this.last_name = last_name;
        setDob(dob);
        total_teachers.add(this);
    }

    public static ArrayList<Teacher> getTotal_teachers() {
        return total_teachers;
    }

    public long getTeacher_Id() {
        return id;
    }

    public String getName() {
        return first_name + last_name;
    }

    public void changeName(String name) {
        this.first_name = name;
    }

    public String getDob() {
        return dob.toString();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", Date of birth= " + getDob() +
                ", name = " + getName() +
                '}';
    }
}
