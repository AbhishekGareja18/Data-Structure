import java.util.Scanner;

public class Average{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of n:");
		int n=sc.nextInt();
		int sum=0;
		for (int i=0;i<=n ;i++ ) {
			sum=sum+i;
		}
		double average=sum/n;
		System.out.println("average of numbers:"+average);
		
	}
}