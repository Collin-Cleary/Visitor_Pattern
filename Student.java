import java.util.ArrayList;
import java.util.List;

public class Student implements Visitor{
    Lecture[] schedule;
    String name;
    List<Lecture> notes = new ArrayList<>();

    public Student(String name, Lecture[] schedule){
        this.name = name;
        this.schedule = schedule;
    }

    @Override
    public void visit(Lecture lecture) {
        notes.add(lecture);
        lecture.markPresent(this);
    }

    public void summary(){
        for (Lecture lecture : schedule) {
            if(!notes.contains(lecture)){
                System.out.println(name + " did not attend " + lecture.name);
            }
            else{
                System.out.println(name + " attended " + lecture.name);
            }
        }
    }
}
