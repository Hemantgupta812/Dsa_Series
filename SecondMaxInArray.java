import java.util.Scanner;

// By Hemant Gupta
// Our YouTube Channnel - Developer's WorkOut
// Like and Subscribe My Channel
public class SecondMaxInArrayDsa1 {
    public static void main(String[] args) {

        Scanner readInput = new Scanner(System.in);

        // For displaying the Hint Message for required Input from user's side
        System.out.println("Enter the Size of Array = ");

        // enter the size of array
        int arrSize = readInput.nextInt();

        // create the integer array of size according to user
        int[] arr = new int[arrSize];

        // initialise the array
        System.out.println("Enter the Elements of Array = ");

        for (int index = 0; index < arrSize; index++) {
            arr[index] = readInput.nextInt();
        }

        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;// Integer.MIN_VALUE = -2147483648(Smallest
                                                                        // Possible value)
        /*
         * // Using Two Loop
         * // calculating the First Max In Array
         * for (int index = 0; index < arrSize; index++) {
         * 
         * if (arr[index] > firstMax) {
         * firstMax = arr[index];
         * }
         * }
         * 
         * // calculating the Required Second Max In Array
         * for (int index = 0; index < arrSize; index++) {
         * 
         * if (arr[index] > secondMax && arr[index] != firstMax) {//5
         * secondMax = arr[index];
         * }
         * }
         */

        // Using One Loop

        //1,2,3,4,5
        //1,2,5,3,4

        for (int index = 0; index < arrSize; index++) {

            if (arr[index] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[index];
            } else if (arr[index] > secondMax && arr[index] != firstMax) {
                secondMax = arr[index];
            }

        }

        if (secondMax != Integer.MIN_VALUE) {
            System.out.println("Second Maximum Element in Array = " + secondMax);
        } else {
            System.out.println("Second Max Element are Not Present in the Array");
        }

    }

}
