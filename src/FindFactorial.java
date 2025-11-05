import java.util.Scanner;

public class FindFactorial {
    int findFactorial(int n){
        int factorial = 1;   // 5 * 4*... 1
        if(n>0){
        for(int i = n; i >= 1; i --){
            factorial = factorial * i ;
        }
        System.out.println("Factorial of " + n + ":" + factorial );}
        else{
            System.out.println("can not defined");
        }
        return factorial;
    }

    //undefined-- factorial of negative numbers is not possible
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        FindFactorial findFactorial = new FindFactorial();
        findFactorial.findFactorial(n);
    }
}
