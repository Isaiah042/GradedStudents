package GradedStudents;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student1;

    private Student student2;

    private Student student3;

    private ArrayList<Double> examScores;



    @BeforeEach
    void setUp(){
        Double[] myScores = {85.52};
        student1 = new Student("Isaiah", "Garcia", myScores);

    }



    @Test
    void addExamScoresTest(){
        //given
        double addedScore = 90.83;
        //when
        student1.addExamScores(addedScore);
        String expected = "Exam 1 ->85.52" + "\n" + "Exam 2 ->90.83" + "\n";
        //then
        Assertions.assertEquals(expected,student1.getExamScores());
    }


    @Test
    void getNumberOfExamsTakenTest() {
        //given

        //when
        int expected = 1;
        //then
        Assertions.assertEquals(expected, student1.getNumberOfExamsTaken());
    }


    @Test
    void getAverageExamScore() {
        //given
        Double[] brotherScores = {95.2, 85.52};
        student2 = new Student("Nelson", "Garcia", brotherScores);
        //when
        double expected = (85.52 + 95.2) / 2;
        //then
        Assertions.assertEquals(expected,student2.getAverageExamScore());
    }
}