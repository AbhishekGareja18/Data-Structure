import java.util.Scanner;
import java.util.Arrays;

public class Lab3_8{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int numNames = sc.nextInt();
        sc.nextLine(); 
        String[] names = new String[numNames];

        System.out.println("Enter the names:");
        for (int i = 0; i < numNames; i++) {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
