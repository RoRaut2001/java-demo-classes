import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {

        //create object for scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name- ");
        String name = sc.nextLine();
        System.out.println("Hii " +name + "!");
        System.out.println("Enter your age- ");
        int age = sc.nextInt();
        System.out.println("Your age is " +age);
        System.out.println("Enter boolean value- ");
        boolean flag = sc.nextBoolean();
        System.out.println("Boolean value " +flag);
        // Hi Rohini, your age is 25!
        System.out.println("Hi " +name + ",your age is " + age +"!");

    }
}
