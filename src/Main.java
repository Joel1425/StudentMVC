//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Repository students = populateStudents();
        invokeQueries(students);
    }

    private static Repository populateStudents(){
        Repository students=new Repository();
        students.addStudent("ITM2017001",
                new Student("Aditya", "ITM2017001", Stream.SCIENCE));
        students.addStudent("ITM2017002",
                new Student("Joel", "ITM2017002", Stream.SCIENCE));
        students.addStudent("ITM2017003",
                new Student("Harsh", "ITM2017003", Stream.ARTS));
        students.addStudent("ITM2017004",
                new Student("Sneha", "ITM2017004", Stream.COMMERCE));
        students.addStudent("ITM2017005",
                new Student("Nawaz", "ITM2017005", Stream.COMMERCE));
        return students;
    }

    private static void invokeQueries(Repository students){
        //  1. Extract info for student with roll number ITM2017005 and change it's stream to ARTS
        Student model;
        StudentView view= new StudentView();
        StudentController controller;
        model = students.getStudent("ITM2017005");
        controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentStream(Stream.ARTS);
        controller.updateView();
        //  2. Extract info for student with roll number ITM2017001 and change it's name to Jack
        model = students.getStudent("ITM2017001");
        controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Jack");
        controller.updateView();
    }
}