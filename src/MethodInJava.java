import java.util.Scanner;

public class MethodInJava {
    //method in java
     public void HelloWorld(){
        System.out.println("Hello world!!!"); //non-static
    }
    public static int HelloWorld2(int a, int b){
        System.out.println(a+b);
        return (a + b);
    }

    public static void main(String[] args) {
         MethodInJava obj = new MethodInJava();
         obj.HelloWorld();
         Scanner sc= new Scanner(System.in);
         int a = sc.nextInt();
         int b= sc.nextInt();
         HelloWorld2(a,b);
    }
}
