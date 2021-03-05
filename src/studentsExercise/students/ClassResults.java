package studentsExercise.students;

import java.util.ArrayList;

public class ClassResults {

    ArrayList<Student> studentArrayList = new ArrayList<>();

    public void addStudent(Student student){
        this.studentArrayList.add(student);
    }

    public void printList(){
        this.studentArrayList.forEach(
                (student) -> System.out.println("O estudante "+ student.getName() + " obteve a nota " + student.getGrade()));
    }
}
