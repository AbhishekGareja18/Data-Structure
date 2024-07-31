import java.util.Scanner;

public class Lab3_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be replaced: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number to replace with: ");
        int num2 = sc.nextInt();

        System.out.println("Replacing " + num1 + " with " + num2 + ":");
        for (int i = 0; i < n; i++) {
            if (arr[i] == num1) {
                arr[i] = num2;
                System.out.println("Replaced at index: " + i);
            }
        }

        System.out.println("Final array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
