import java.util.Scanner;

public class Lab3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] num = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int minPos = 0;
        int maxPos = 0;
        int minVal = num[0];
        int maxVal = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] < minVal) {
                minVal = num[i];
                minPos = i;
            }
            else if (num[i] > maxVal) {
                maxVal = num[i];
                maxPos = i;
            }
        }
        System.out.println("Position of min value is"+minPos);
        System.out.println("Position of max value is"+maxPos);
    }
}
