package main;

import java.util.concurrent.ThreadLocalRandom;

public class Driver {

    /*
    create 3 catalogues
    add 3,4,5 entries in each catalogue
    add 3 grades for each entry in each catalogue
     */

    public static void main(String[] args) {
        Catalogue clasa_A = new Catalogue("clasa_A");
        Catalogue clasa_B = new Catalogue("clasa_B");
        Catalogue clasa_C = new Catalogue("clasa_C");

        Teacher prof_Daniel = new Teacher("Daniel", "Sihastru", "04/02/1967");
        Teacher prof_Magdalenta = new Teacher("Magdalena", "Cacau", "28/12/1977");
        Teacher prof_Aurelia = new Teacher("Aurelia", "Stere", "14/06/1955");
        Teacher prof_Enache = new Teacher("Enache", "Alexandru", "01/08/1980");
        Teacher prof_Janeta = new Teacher("Janeta", "David", "09/09/1948");

        Student Andrei_Branza = new Student("Andrei", "Branza", "26/09/1990");
        Student Liana_Moisescu = new Student("Liana", "Moisescu", "20/01/1991");
        Student Mioara_Popa = new Student("Mioara", "Popa", "29/02/1960");
        Student Victor_Branza = new Student("Victor", "Branza", "04/03/1956");
        Student Maria_Popa = new Student("Maria", "Popa", "25/02/1932");
        Student Vasile_Popa = new Student("Vasile", "Popa", "30/01/1940");
        Student Florin_Branza = new Student("Florin", "Branza", "14/03/1988");
        Student Camelia_Moisescu = new Student("Camelia", "Moisescu", "04/06/1960");
        Student Nelu_Moisescu = new Student("Nelu", "Moisescu", "30/09/1961");
        Student Cristiana_Moisescu = new Student("Cristiana", "Moisescu", "25/07/1985");
        Student Ilinca_Nedelcu = new Student("Ilinca", "Nedelcu", "08/04/1933");
        Student Horia_Bagaftea = new Student("Horia", "Bagaftea", "22/11/1989");
        Student Julius_Maroncea = new Student("Julius", "Maroncea", "18/12/1993");
        Student Luciana_Funfust = new Student("Luciana", "Funfust", "12/10/1992");

        clasa_B.addStudent_To_Catalogue(Liana_Moisescu);
        clasa_B.addStudent_To_Catalogue(Mioara_Popa);
        clasa_B.addStudent_To_Catalogue(Victor_Branza);
        clasa_B.addStudent_To_Catalogue(Maria_Popa);
        clasa_B.addStudent_To_Catalogue(Andrei_Branza);

        clasa_A.addStudent_To_Catalogue(Vasile_Popa);
        clasa_A.addStudent_To_Catalogue(Florin_Branza);
        clasa_A.addStudent_To_Catalogue(Camelia_Moisescu);
        clasa_A.addStudent_To_Catalogue(Nelu_Moisescu);
        clasa_A.addStudent_To_Catalogue(Cristiana_Moisescu);

        clasa_C.addStudent_To_Catalogue(Ilinca_Nedelcu);
        clasa_C.addStudent_To_Catalogue(Horia_Bagaftea);
        clasa_C.addStudent_To_Catalogue(Julius_Maroncea);
        clasa_C.addStudent_To_Catalogue(Luciana_Funfust);

        for (Student student : Student.getTotal_students()) {
            //each student needs 5 grades
            for (int i = 0; i < 5; i++) {
                //assigns random grade from 1 to 10 to each student for each subject
                student.setGrade(ThreadLocalRandom.current().nextDouble(1, 10), Subject.getSubject(i), Teacher.getTotal_teachers().get(ThreadLocalRandom.current().nextInt(0, 5)));
            }
        }

        Andrei_Branza.print_average_grade_ofThis_student();

        Utilitaries.average_grade_of_each_class();

        Utilitaries.average_grade_off_all_classes();

        Utilitaries.average_grade_of_each_student();

    }
}
