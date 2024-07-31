import java.util.Scanner;

public class Lab4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 1, 2, 3, 5 };
        System.out.println("Enter Number Which you want to delete = ");
        int num = sc.nextInt();
        int[] b = new int[3];
        int count = 0;
        int length = a.length;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < num) {
                b[i] = a[i];
            }
            if (a[i] > num) {
                b[i - 1] = a[i];

            }

        }
        for (int k = 0; k < b.length; k++) {
            System.out.print(b[k] + ",");
        }
    }
}