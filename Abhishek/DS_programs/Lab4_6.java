import java.util.Arrays;
import java.util.Scanner;

public class Lab4_6 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter size of first array =");
        int n = sc.nextInt();

        System.out.println("Enter size of second array =");
        int n2 = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[n2];

        System.out.println("Enter First Array element =");

        for(int i = 0; i < arr1.length ; i++){
           arr1[i] = sc.nextInt();
        }

        System.out.println("Enter Second Array element =");

        for(int j = 0; j < arr2.length ; j++){
            arr2[j] = sc.nextInt();
         }

        int arr3[] = new int[n+n2];

        for(int k = 0; k < arr1.length ;k++){
            arr3[k] = arr1[k];
        }

        for(int l = 0; l < arr2.length ; l++){
            arr3[n] = arr2 [l];
            n++;
        }
        Arrays.sort(arr3);

        System.out.print("Merge array : ");

        for(int m = 0 ; m < arr3.length ; m++){
            System.out.print(arr3[m] +" ");
        }
    }
}