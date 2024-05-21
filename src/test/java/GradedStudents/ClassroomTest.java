package GradedStudents;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {



    private Classroom classroom;
    private Student student1;

    private Student student2;


    @BeforeEach
    void setUp() {
        Double[] scores1 = {85.52, 98.85, 100.00};
        student1 = new Student("Isaiah", "Garcia", scores1);
        Double[] scores2 = {95.2, 89.5, 75.8};
        student2 = new Student("Nelson", "Garcia", scores2);
        classroom = new Classroom();
        classroom.addStudent(student1);
        classroom.addStudent(student2);
    }

    @Test
    void getAverageExamScores() {
        //given
        double total = 85.52 + 98.85 +100.00 + 95.2 + 89.5 + 75.8;
        //when
        double expected = total / 6;
        //then
        Assertions.assertEquals(expected, classroom.getAverageExamScores());
    }

    @Test
    void addStudent() {
        //given
        Double[] tuckerScores = {99.01};
        Student student = new Student("Chris" , "Tucker", tuckerScores);
        classroom.addStudent(student);
        Student[] expected = classroom.getStudents();
        Assertions.assertArrayEquals(expected, classroom.getStudents());
    }

    @Test
    void removeStudent() {
        classroom.removeStudent("Nelson", "Garcia");
        Student[] expected = classroom.getStudents();
        Assertions.assertEquals(expected, classroom.getStudents());
    }
}