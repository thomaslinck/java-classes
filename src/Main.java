
public class Main {
    public static void main(String[] args) {
        ClassResults classResults = new ClassResults();

        Student student = new Student();

        student.setName("Jose");
        student.setGrade(10);
        student.setResult(FinalResult.approved);
        classResults.addStudent(student);

        student.setName("Carlos");
        student.setGrade(5);
        student.setResult(FinalResult.notApproved);
        classResults.addStudent(student);

        student.setName("Pedro");
        student.setGrade(7);
        student.setResult( FinalResult.approved);
        classResults.addStudent(student);


        classResults.printList();
    }
}
