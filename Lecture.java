import java.util.ArrayList;
import java.util.List;

public class Lecture extends Element{
    String name;
    List<Student> attendance = new ArrayList<>();

    public Lecture(String name){
        this.name = name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
    public void markPresent(Student student){
        attendance.add(student);
    }

    public void teach(Professor prof){
        for (Student student : attendance) {
            prof.attendees.add(student);
        }
    }
}
