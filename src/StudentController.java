public class StudentController {
    Student model;
    StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public String getStudentName() {
        return this.model.getStudentName();
    }

    public String getRollNumber() {
        return this.model.getRollNumber();
    }

    public Enum<Stream> getStudentStream() {
        return this.model.getStudentStream();
    }

    public void setStudentName(String studentName) {
        this.model.studentName = studentName;
    }

    public void setRollNumber(String rollNumber) {
        this.model.rollNumber = rollNumber;
    }

    public void setStudentStream(Enum<Stream> studentStream) {
        this.model.studentStream = studentStream;
    }

    public void updateView(){
        this.view.printStudentDetails(this.model.getStudentName(),
                this.model.getRollNumber(), this.model.getStudentStream());
    }
}
