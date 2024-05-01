public class StudentView {
    public void printStudentDetails(String studentName, String rollNumber, Enum<Stream> studentStream ){
        System.out.println("Student Details");
        System.out.println("------------------------------------------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Roll Number: " + rollNumber);
        System.out.println("Student Stream: " + studentStream);
        System.out.println("------------------------------------------");
    }
}
