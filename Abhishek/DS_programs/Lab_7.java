import java.util.Scanner;
public class Lab_7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("Factors are: ");
		int fac = 1;
		for (int i = 1;i <= n ;i++ ) {
				if(n%i == 0){
				System.out.println(i);	
				}
			}		
	}
}	