package GradedStudents;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Double[] myScores = {85.52, 98.85, 100.00};
        Student student1 = new Student("Isaiah", "Garcia", myScores);
        student1.addExamScores(92.78);
        student1.setExamScores(1, 95.0);
        student1.getNumberOfExamsTaken();
        System.out.println(student1.getExamScores());
        System.out.println("Exam Average: " + student1.getAverageExamScore());


        Double[] brotherScores = {95.2, 89.5, 75.8};
        Student student2 = new Student("Nelson", "Garcia", brotherScores);
        System.out.println("=====ToString=====");
        System.out.println(student1.toString());

        System.out.println("=====Classroom=====");
        Double[] tuckersScore = {50.5, 76.5};
        Student[] students = {student1, student2};

        Classroom classroom = new Classroom(1);
        classroom.addStudent(student1);
        Student student3 = new Student("Chris", "Tucker", tuckersScore);
//        System.out.println("Average of all students exams: " + classroom.getAverageExamScores());
        classroom.addStudent(student3);
        System.out.println(Arrays.toString(classroom.getStudents()));
        classroom.removeStudent("Chris", "Tucker");
        System.out.println((classroom.getAverageExamScores()));

    }
}
