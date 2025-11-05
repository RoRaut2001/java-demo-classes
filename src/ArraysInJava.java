import java.util.Scanner;
public class ArraysInJava {
    public  static void main(String[] args){
        //take input of 3 students marks, 3 student
        //step1
        Scanner sc = new Scanner(System.in);
        String[] names= new String[3]; // arrays for student name
        int[] studentMarks = new int[3]; //{} array for student marks

        //step2
        System.out.println("Enter Student Name and marks:");
        for(int i = 0; i < 3; i++){
            System.out.println("Enter student name: ");
            names[i] = sc.nextLine();

            System.out.println("Enter student marks: ");
            studentMarks[i] = sc.nextInt();
            sc.nextLine();
        }

        //step 3
        System.out.println("---------------Student Marksheet----------------");
        for(int i =0 ; i <3; i++){
            System.out.println(names[i] + "-" +studentMarks[i]);
        }
        sc.close();
    }
}
