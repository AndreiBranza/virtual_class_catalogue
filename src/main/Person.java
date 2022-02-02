package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Person {
    private static long id;
    protected String first_name;
    protected String last_name;
    protected LocalDate dob;

    public static long getId() {
        return id;
    }

    public static void generateId() {
        Person.id = id + 1;
    }

    public void setDob(String dob) {
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dob = LocalDate.parse(dob, formatter);
    }

}
