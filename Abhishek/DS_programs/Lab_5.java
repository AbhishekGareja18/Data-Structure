import java.util.Scanner;

public class Lab_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        XYZ r = new XYZ();
        int k = r.a(x);
        System.out.println(k);
    }
}

class XYZ {
    int a(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * a(x - 1);
        }

    }

}