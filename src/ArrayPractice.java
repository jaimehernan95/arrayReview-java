import javax.swing.*;
import java.sql.Array;
import java.util.Arrays;

public class ArrayPractice {

    public static void printArray (int[] array) {

        System.out.println("|");
        for (int i = 0; i < array.length; i++) {
            int item = array[i];
            System.out.println(item);
            if (i < array.length - 1){
                System.out.print(",");
            }
        }
        System.out.println("|");
    }

    public static void printArray (String[] array) {

        System.out.println("|");
        for (int i = 0; i < array.length; i++) {
            String item = array[i];
            System.out.println(item);
            if (i < array.length - 1){
                System.out.print(",");
            }
        }
        System.out.println("|");
    }


    public static void main(String[] args) {

        // index: 0 1 2 3 4
        //Array: [0,5,3,2,1] -->length 5
        //index: 0
        //Array: ["bob,"bobby", "max"] --> length 3

        int[] intArray1;
        int [] intArray2 = new int[4];
        printArray(intArray2);
        int [] intArray3 = {5,2,9,1,3};

        String[] shoppingList ={"bananas", "Apples", "pears"};

        intArray2[0] = 10;
        intArray2[1] = 8;
        intArray2[2] = 5;
        intArray2[3] = 10;

        //print of arrays
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(intArray3));
        System.out.println();

        //custom print out arrays
        printArray(intArray2);
        printArray(intArray3);
        System.out.println();

        // retrieve objects
        System.out.println(intArray2[3]);

        //given functions
        Arrays.sort(intArray3);
        printArray(intArray3);

        // print string array
        printArray(shoppingList);

        System.out.println("special for loop");
        // special for loop for each
        for (String s : shoppingList){
            System.out.println(s);

        }

    }
}
