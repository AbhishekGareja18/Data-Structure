import java.util.Scanner;

public class MaxMinNum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int[] array=new int[size];

		for (int i=0;i<size ;i++ ) {
			System.out.print("enter array of element:");
			array[i]=sc.nextInt();
		}
		int max=array[0];
		int min=array[0];
		for (int i=1;i<size ;i++ )
		{
			if (array[i]>max) 
			{
				max=array[i];
			}
		}

		for (int i=1;i<size ;i++ )
		{
			if (array[i]<min) 
			{
				min=array[i];
			}
		}
		System.out.println("Maximum number is :"+max);
				System.out.println("Minimum number is :"+min);

	}
}