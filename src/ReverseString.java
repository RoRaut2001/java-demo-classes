import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String name = sc.nextLine();
        String rev = " ";
        System.out.println(name);
        System.out.println(name.length() - 1);
        for( int i = name.length() -1; i>=0; i--){
            rev += name.charAt(i);
        }
        String isPalindrome = rev;
        System.out.println("Reversed String of "+ name + " is " + rev);

        // name == rev
        if(name == isPalindrome){
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
    }




}
