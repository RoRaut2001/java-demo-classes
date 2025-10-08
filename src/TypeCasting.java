public class TypeCasting {
    public static void main(String[] args) {
        int a = 10;
        double d = 99.99;
        // int to double conversion -- implicit conversion
        double convertedA = a;
        System.out.println("int a = " + a);
        System.out.println("converted value of a = " + convertedA);
        //double to int conversion -- explicit conversion
        int convertedD = (int) d;
        System.out.println();
    }
}
