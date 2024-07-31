import java.util.Scanner;

public class SumOfNumbers{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter m:");
		int m=sc.nextInt();
		System.out.print("Enter n:");
		int n=sc.nextInt();
		int sum=0;
		for (int i=m;i<=n ;i++ ) {
			sum=sum+i;
		}
		System.out.println("sum of m to n:"+sum);
	}
}