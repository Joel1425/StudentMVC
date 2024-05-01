import java.util.HashMap;

public class Repository {
    HashMap<String, Student> students;

    public Repository() {
        students= new HashMap<>();
    }

    public void addStudent(String rollNumber, Student student){
        this.students.put(rollNumber, student);
    }

    public Student getStudent(String rollNumber){
        return this.students.get(rollNumber);
    }
}
