public class Student {
    String studentName;
    String rollNumber;
    Enum<Stream> studentStream;

    public Student(String studentName, String rollNumber, Enum<Stream> studentStream) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.studentStream = studentStream;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public Enum<Stream> getStudentStream() {
        return studentStream;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setStudentStream(Enum<Stream> studentStream) {
        this.studentStream = studentStream;
    }
}
