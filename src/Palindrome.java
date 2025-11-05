
public class Palindrome {
    public static void main(String[] args) {
        String str= "Level";
        String rev = "";  // store the revresed string === empty string
        for(int i = str.length() -1 ; i>=0; i--){
            rev = rev + str.charAt(i); // 4 --- 4,3,2,1,0   level
        }
        System.out.println(rev);

        if(str.equalsIgnoreCase(rev)){
            System.out.println("In if loop");
            System.out.println( "String is Palindrome");
        } else {
            System.out.println("String is not Palindrome");
        }
        System.out.println(+5);
        System.out.println(-5);
        int a = 5;
        System.out.println(++a);


        int a1 = ++a;
        int a2 = a++;


        System.out.println(a++);

//
//        String trimString = "  Level  up  ";
//        System.out.println(trimString);
//        System.out.println(trimString.trim());
//        System.out.println(str.trim());


    }
}
