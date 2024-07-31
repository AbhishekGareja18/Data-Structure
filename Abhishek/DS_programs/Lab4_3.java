import java.util.Scanner;

public class Lab4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = { 1, 2, 3, 5 };
        System.out.println("Enter Number Which you want to add = ");
        int num = sc.nextInt();
        int[] b = new int[5];
        int count = 0;
        int length = a.length;
        for (int i = 0; i < b.length - 1; i++) {
            if (a[i] < num) {
                b[i] = a[i];
            }
            if (a[i] > num || a[i]==num) {
                b[i] = num;
                count = i;
                break;
            }
            
        }
        if (a[length - 1] < num) {
            b[length] = num;
        } else {
            for (int j = count + 1; j < b.length; j++) {
                b[j] = a[j - 1];
            }
        }

        for (int k = 0; k < b.length; k++) {
            System.out.print(b[k] );
            if(k!=b.length-1){
                System.err.println(",");
            }
        }
    }
}