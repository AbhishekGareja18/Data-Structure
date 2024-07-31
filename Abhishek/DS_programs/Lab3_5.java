import java.util.Scanner;

public class Lab3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    count++;
                }
            }
        }
        if (count>=1){
        System.out.println("Array contains duplicate number.");    
        }
        else {
            System.out.println("Array does not contains duplicate number.");
        }
        
    }
}