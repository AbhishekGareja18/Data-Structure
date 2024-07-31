import java.util.Scanner;

public class Lab3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int count = 0;
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            sum = sum + i;
            count++;
        }
        System.out.println("Sum is: " + sum);
        avg = sum / count;
        System.out.println("Average is: " + avg);

    }

}
