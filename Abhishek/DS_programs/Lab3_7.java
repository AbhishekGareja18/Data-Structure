import java.util.Scanner;

public class Lab3_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = sc.nextInt();

        int[][] pasTri = new int[rows][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pasTri[i][j] = 1;
                } else {
                    pasTri[i][j] = pasTri[i - 1][j - 1] + pasTri[i - 1][j];
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < rows - i - 1; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(pasTri[i][j] + " ");
            }
            System.out.println();
        }
    }
}
