import java.util.Scanner;
import java.util.*;

public class RemoveDublicateInArrayDsa2 {

    // Subscribe Our Channel - Developer's Workout
    // by Hemant Gupta

    public static void main(String[] args) {

        Scanner readInput = new Scanner(System.in);

        System.out.println("##############################");
        System.out.println("Enter the Size Of Array");

        int n = readInput.nextInt();

        int arr[] = new int[n];
        System.out.println("##############################");
        for (int i = 0; i < n; i++) {
            arr[i] = readInput.nextInt();
        }

        int length = removeDublicateFromArray(arr, n);

        System.out.println("#########################################");
        System.out.println("After Removing Dublicate Elements");

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int removeDublicateFromArray(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];

        int j = 0;

        // Sort the Original Array
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n - 1];

        // update original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }

        return j;

    }

    // 1,2,3,3,2

    // sort the array
    // 1,2,2,3,3
    // temp - 1,2,3
    // output - 1,2,3

}
