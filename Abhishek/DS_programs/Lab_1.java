.import java.util.Scanner;
public class Lab_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        double r = sc.nextDouble();
        double A = Math.PI*r*r;
        System.out.println("Area of circle is :"+ A);
    }
}