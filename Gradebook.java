import java.util.Scanner;
import java.util.ArrayList;

public class Gradebook{

private ArrayList<Student> classroom = new ArrayList<Student>();
       
    public void createStudent(){
        System.out.println("Enter name of students here. To quit enter 'q'.");
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String name = sc.nextLine();
            if(name.equals("q"))
                break;            
            else{
                classroom.add(new Student(name));
            }
        }
    }

    public void viewClass(){
        System.out.println("Class list");
        for(int i=0;i<classroom.size();i++){
            Student temp = classroom.get(i);
            temp.printStudentName();
        }
    }

    public void option(){
        System.out.println("Would you like to enter grades? [Y/N]");
        Scanner sc = new Scanner(System.in);
        char answer = sc.next(".").charAt(0);
        result(answer);
    }

    public void option2(){
        System.out.println("Would you like to enter more grades? [Y/N]");
        Scanner sc = new Scanner(System.in);
        char answer = sc.next(".").charAt(0);
        result(answer);
    }

    public void result(char x){
        switch(x){
            case 'Y':
                beginGrading();
                break;
            case 'y':
                beginGrading();
                break;
            case 'N':
                System.out.println("Exited grading.");
                break;
            case 'n':
                System.out.println("Exited grading.");
                break;
            default:
                System.out.println("That wasn't an option, try again.");
                option();
        }
    }

    public void result2(char x){
        switch(x){
            case 'Y':
                printFinalMarks();
                break;
            case 'y':
                printFinalMarks();
                break;
            case 'N':
                System.out.println("Goodbye.");
                break;
            case 'n':
                System.out.println("Goodbye.");
                break;
            default:
                System.out.println("That wasn't an option, try again.");
                viewFinalMarks();
        }
    }
    

    public void beginGrading(){
        System.out.println("Enter the student name to begin grading");
        Scanner sc = new Scanner(System.in);
        String studentName = sc.nextLine();
        if(studentCheck(studentName)){
            System.out.println("Enter the students grade");
            Scanner gr = new Scanner(System.in);
            int grade = gr.nextInt();
            gradeAddition(studentName,grade);
        }
        else{
            System.out.println("The student doesn't exist");
            option();
        }         
    }

    // confirms if student actually exists
    public boolean studentCheck(String name){
        for(int i =0; i<classroom.size();i++){
            Student temp = classroom.get(i);
            String tempName = temp.getName();
            if(tempName.equals(name)){
                return true;                
            }            
        } 
        return false;       
    }

    // responsible for adding grades to students grade array
    public void gradeAddition(String name, int grade){
        for(int i =0; i<classroom.size();i++){
            Student temp = classroom.get(i);
            String tempName = temp.getName();
            if(tempName.equals(name)){
                temp.addGrade(grade);      
                temp.printGrades();          
            }            
        }
        option2();
    }
    
    public void viewFinalMarks(){
        System.out.println("Would you like to see the final marks of all students? [Y/N]");
        Scanner sc = new Scanner(System.in);
        char answer = sc.next(".").charAt(0);
        result2(answer);
    }

    public void printFinalMarks(){
        for(int i =0; i<classroom.size();i++){
            Student temp = classroom.get(i);
            temp.printAverageGrade();                      
        } 
    }

}