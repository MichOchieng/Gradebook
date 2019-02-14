import java.util.ArrayList;

public class Student{
    private static String name;
    private static int grade;
    private static int average = 0;
    private static ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name){
       this.name = name;     
    }

    
    // Name related methods
    public static String getName(){
        return name;
    }

    public static void printStudentName(){
        System.out.println(name + " is a student");
    }


    // Grade related methods
    public void addGrade(int x){
       grades.add(x); 
    }

    public void printGrades(){
        System.out.println("These are " + name + "'s grades:");
        for(int i=0; i<grades.size(); i++){
            System.out.println(grades.get(i));
        }
    }
        
    public void calculateAverage(){
        int temp = 0;        
        for(int i=0;i<grades.size();i++){
            temp += grades.get(i);
            int temp2 = temp/grades.size();
            average = temp2 ;
        }
    }

    public void printAverageGrade(){
        calculateAverage();
        System.out.println(name + "'s average grade is " + average);
    }
} 