import java.lang.String;
import java.util.Scanner;


public class ProblemStatement{
    Scanner sc = new Scanner(System.in);
    void takeName(){
        System.out.println("Enter Student Name: ");
        String studentName = sc.nextLine();
        System.out.println("Student name is " + studentName);
    }
    void takeAge(){
        System.out.println("Enter student age: ");
        int studentAge = sc.nextInt();
        System.out.println("Student age is" + studentAge);
    }

    public static  void main(String[] args){
        ProblemStatement obj = new ProblemStatement();
        obj.takeName();
        obj.takeAge();
    }
}
