import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        
        Professor Smith = new Professor("Smith", "Statistics");
        Professor Palmer = new Professor("Palmer", "Psychology");
        Lecture psych101 = new Lecture("PSYCH-101");
        Lecture stat250 = new Lecture("STAT-250");
        Student Jeff = new Student("Jeff", new Lecture[]{psych101});
        Student Tom = new Student("Tom", new Lecture[]{psych101, stat250});
        Student Wendy = new Student("Wendy", new Lecture[]{psych101, stat250});
        Student Anne = new Student("Anne", new Lecture[]{psych101, stat250});

        List<Student> students = new ArrayList<>();
        students.add(Jeff);
        students.add(Tom);
        students.add(Wendy);
        students.add(Anne);

        psych101.accept(Jeff);
        psych101.accept(Wendy);
        psych101.accept(Tom);
        psych101.accept(Palmer);

        stat250.accept(Tom);
        stat250.accept(Wendy);
        stat250.accept(Anne);
        stat250.accept(Smith);

        for (Student student : students) {
            student.summary();
        }
        System.out.println();
        Smith.summary();
        Palmer.summary();
    }
}
