import java.util.*;
public class MissingNumberDsa3

// Follow Our Channel - Developer's Workout
// By Hemant Gupta
 {
    public static void main(String[] args) {
        
        Scanner readInput = new Scanner(System.in);

        System.out.println("Enter the Size of Array");

        int arraySize = readInput.nextInt();

        int arr[] = new int[arraySize];

        for(int i =0;i<arraySize-1;i++){
           arr[i] = readInput.nextInt();
        }

        float totalSum = 0, actualSum=0;

        totalSum = arraySize*(arraySize + 1)/2;

        for(int i = 0;i<arraySize-1;i++){
            actualSum+=arr[i];
        }

        // Desired missing Number 
        System.out.println("Missing Number  = "+(int)(totalSum-actualSum));
        
    }
    
}
