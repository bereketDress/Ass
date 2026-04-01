package week1.Assignment.prob2A;
/*
mandatory 1-1 bidirectional association:
--One class creates object → uses new
--Other class receives → uses constructor parameter
 */

public class Student {
    private String name;
    private GradeReport report;

    public Student(String name){
        this.name=name;
        report =new GradeReport(this);
        //this: current Student object being created
    }

    public String getName() {
        return name;
    }

    public GradeReport getReport() {
        return report;
    }
}
