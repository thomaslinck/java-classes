package studentsExercise.main;

import studentsExercise.students.ClassResults;
import studentsExercise.students.FinalResult;
import studentsExercise.students.Student;

public class Main {
    public static void main(String[] args) {

        ClassResults classResults = new ClassResults();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.setName("Jose");
        student1.setGrade(10);
        student1.setResult(FinalResult.approved);
        classResults.addStudent(student1);

        student2.setName("Carlos");
        student2.setGrade(5);
        student2.setResult(FinalResult.notApproved);
        classResults.addStudent(student2);

        student3.setName("Pedro");
        student3.setGrade(7);
        student3.setResult( FinalResult.approved);
        classResults.addStudent(student3);

        classResults.printList();
    }
}
