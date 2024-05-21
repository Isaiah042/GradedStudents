package GradedStudents;

import java.lang.reflect.Array;
import java.util.*;

public class Classroom {

    private Student[] students;

    public Classroom() {

        this(new Student[30]);
    }

    public Classroom(int maxNumberOfStudents) {

        students = new Student[maxNumberOfStudents];

    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScores() {
        double sum = 0;
        int count = 0;
        for (Student student : students) {
            if (student != null) {
                sum += student.getAverageExamScore();
                count++;
            }
        }
        if (count > 0) {
            return sum / count;
        } else {
            return 0;
        }
    }


    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getFirstName().equals(student.getFirstName())) {
                System.out.println("Can't make the same student twice");
            } else if(students[i] == null) {
                students[i] = student;
                return;
            }
        }
    }

    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                System.out.println("Student doesn't exist");
            } else if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                students[i] = null;
            }
        }
    }

    public Student[] getStudentsByScore(){
        ArrayList<Student> listOfStudents = new ArrayList<>(Arrays.asList(students));
            Comparator<Student> comparator = new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    if (o1 == null)
                        return 0;
                    if (o1.getAverageExamScore() < o2.getAverageExamScore())
                        return 1;
                    else return  -1;
                }
            };
        Collections.sort(listOfStudents, comparator);
        return listOfStudents.toArray(new Student[0]);

    }

}
