package main;

public class Grade {
    private static long id;
    private double value;
    private Subject subject;
    private Teacher teacher;

    private Grade() {
    }

    public Grade(Subject subject, double value, Teacher teacher) {
        generateId();
        setValue(subject, value);
        this.teacher = teacher;
    }

    public static long getId() {
        return id;
    }

    public static void generateId() {
        Grade.id += 1;
    }

    public double getGrade_Value() {
        return value;
    }

    public void setValue(Subject subject, double value) {
        this.value = value;
        this.subject = subject;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
