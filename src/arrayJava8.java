import java.util.Arrays;

public class arrayJava8 {

    public static void main(String[] args) {
        int[] intArray = new int[] {1, 2, 3, 4, 5};
        String[] strArray = new String[] {"John", "Mary", "Bob"};

        //Prior to Java 8
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(strArray));

        // In Java 8 we have lambda expressions
        Arrays.stream(intArray).forEach(System.out::println);
        Arrays.stream(strArray).forEach(System.out::println);
    }
}
