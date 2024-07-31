import java.util.Scanner;

public class Lab4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to add in the array:");
        int length = sc.nextInt();

        int[] arr = new int[length];

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter number:");
            arr[i] = sc.nextInt();
        }

      
        int newLength = length;
        for (int i = 0; i < newLength; i++) {
            for (int j = i + 1; j < newLength; j++) {
                if (arr[i] == arr[j]) {
                   
                    for (int k = j; k < newLength - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    newLength--; 
                    j--;
                }
            }
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}