import java.util.Scanner;
import java.util.ArrayList;


private static ArrayList<Object> classroom;


public class Gradebook{
    public static void main(String[] args) {
        // name portion
        System.out.println("Enter student name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Student student1 = new Student(name);
        student1.printStudentName();

        // grade portion
        System.out.println("Enter grade");
        Scanner num = new Scanner(System.in);

        while(num.hasNextInt()){
            int mark = num.nextInt();
            student1.addGrade(mark);
        }

        student1.printGrades();
        student1.printAverageGrade();
        
    }


    
    
    
}