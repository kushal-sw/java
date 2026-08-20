// create an integer array of 10 numbers count how many numbers are ven and odd take no of element from user using scanner take inout  and traverse


import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = 10; // array of 10 numbers
        int[] arr = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int evenCount = 0, oddCount = 0;

        // Traverse the array to count even and odd numbers
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        for (int i = 0; i < size; i++){
            if(arr[i] >= 70 ){
                System.out.println(arr[i] + " is greater than or equal to 70");
                evenCount++; // Increment even count for numbers >= 70
            } else {
                System.out.println(arr[i] + " is less than 70");
                oddCount++; // Increment odd count for numbers < 70
            }
        }

        // Display the array
        System.out.print("\nArray elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n\nTotal Even numbers: " + evenCount);
        System.out.println("Total Odd numbers: " + oddCount);

        sc.close();
    }
}