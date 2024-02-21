import java.util.ArrayList;
import java.util.List;

public class Professor implements Visitor{
    private String name;
    List<Student> attendees = new ArrayList<>();

    public Professor(String name, String subject){
        this.name = name;
    }

    @Override
    public void visit(Lecture lecture) {
        lecture.teach(this);
    }

    public void summary(){
        for (Student student : attendees) {
            System.out.println(student.name + " was marked present by " + name);
        }
    }
    
}
