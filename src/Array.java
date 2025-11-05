public class Array {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4,5};

        // calculate length of array===== arrayName.length
        for (int number : numbers) { ///  enhanced for loop
            System.out.println(number);
        }

        String[] names= {"rohini", "diksha","sakshi"};
        for (String name : names) {
            System.out.println(name);
        }
    }
}
