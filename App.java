public class App{
private static Gradebook teacher;
    public static void main(String[] args) {
        teacher = new Gradebook();
        teacher.createStudent();
        teacher.viewClass();
        teacher.option();
        teacher.viewFinalMarks();        
    }
}