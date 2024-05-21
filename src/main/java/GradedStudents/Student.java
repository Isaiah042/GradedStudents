package GradedStudents;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName;

    private String lastName;

    private ArrayList<Double> examScores;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }


    public void setExamScores(int examNumber, double newScore) {
        examScores.set(examNumber -1,newScore);
    }

    public String getExamScores(){
        StringBuilder exams = new StringBuilder();
        for (int i =0; i < examScores.size(); i++){
           exams.append("Exam ").append(i + 1).append(" ->").append(examScores.get(i)).append("\n");
        }
        return exams.toString();
    }

    public void addExamScores(double examScore){
        System.out.println(examScores.add(examScore));
    }


    public int getNumberOfExamsTaken(){
        int answer = examScores.size();
        System.out.println("Number of exams taken: " + answer);
        return answer;
}


    public double getAverageExamScore(){
        double total =0;
        for (Double score : examScores){
            total += score;;
        }
        return total / examScores.size();
    }

    @Override
    public String toString() {
        String fullName = firstName + " " + lastName;
        return "Student Name: %s\n> Average Score: %s\n%s".formatted(fullName, getAverageExamScore(), getExamScores());
    }
}