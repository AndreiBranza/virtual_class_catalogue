package main;

import java.text.DecimalFormat;
import java.util.HashMap;

public class Utilitaries {
    private static final DecimalFormat df = new DecimalFormat("0.0");

    public static void average_grade_of_each_student() {
        for (Student student : Student.getTotal_students()) {
            double sum = 0;
            double average = 0.0;
            for (int i = 0; i < student.getGrades().size(); i++) {
                sum += student.getGrades().get(i).getGrade_Value();
            }
            average = sum / student.getGrades().size();

            System.out.println("The average grade for student " + student.getFull_Name() + " is : " + df.format(average));
        }
    }

    public static void average_grade_of_each_class() {
        for (int i = 0; i < Catalogue.getTotal_catalogues().size(); i++) {
            double sum = 0;
            double average = 0.0;
            int nr_of_grades_class = 0;

            for (Student student : Catalogue.getTotal_catalogues().get(i).getStudents()) {
                for (int j = 0; j < student.getGrades().size(); j++) {
                    sum += student.getGrades().get(j).getGrade_Value();
                    nr_of_grades_class++;
                }
            }
            average = sum / nr_of_grades_class;
            System.out.println("The average grade for class " + Catalogue.getTotal_catalogues().get(i).getClassName() + " is : " + df.format(average));
        }

    }

    public static void average_grade_off_all_classes() {
        double sum = 0;
        double average = 0.0;
        int catalogues = Catalogue.getTotal_catalogues().size();
        int number_of_grades = 0;
        HashMap<String, Double> each_class_Average = new HashMap<>();
        for (int i = 0; i < catalogues; i++) {
            int nr_of_grades_per_class = 0;
            for (Student student : Catalogue.getTotal_catalogues().get(i).getStudents()) {
                for (int j = 0; j < student.getGrades().size(); j++) {
                    sum += student.getGrade_Value(Subject.getSubject(j));
                }
                number_of_grades += student.getGrades().size();
                nr_of_grades_per_class++;

            }
            //media fiecarei clase este suma tuturor notel din acea clasa impartita la numarul total al notelor
            each_class_Average.put(Catalogue.getTotal_catalogues().get(i).getClassName(), sum / nr_of_grades_per_class);
        }

        average = sum / number_of_grades;

        System.out.println("The average grade of all classes is: " + df.format(average));
    }
}
