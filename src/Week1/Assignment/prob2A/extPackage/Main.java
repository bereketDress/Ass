package week1.Assignment.prob2A.extPackage;
import week1.Assignment.prob2A.Student;

public class Main {

    public static void main(String[] args) {
        Student s = new Student("Alice");

        //get name from student class
        System.out.println("Student: " + s.getName());

        // get name via grade report class
        System.out.println("GradeReport belongs to: " + s.getReport().getSt().getName());
    }
}