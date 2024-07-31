import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for (int i = m; i < n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of numbers between m and n is: " + sum);

    }

}
