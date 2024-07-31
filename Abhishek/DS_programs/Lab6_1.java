import java.util.Scanner;

public class Lab6_1 {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        swap(a, b);
        System.out.println("Before" + a);
        System.out.println("Before" + b);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After : " + a);
        System.out.println("After : " + b);
    }
}
