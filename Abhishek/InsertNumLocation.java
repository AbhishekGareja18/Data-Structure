 import java.util.Scanner;
 public class InsertNumLocation{
 	public static void main(String[] args) {
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int[] array=new int[size];

		for (int i=0;i<size ;i++ ) {
			System.out.print("enter array of element:");
			array[i]=sc.nextInt();

		}

		System.out.println("choose a index to you change it:");
		int index=sc.nextInt();

		 System.out.println("enter number to you change in entered index:");
		int number=sc.nextInt();

		int[] new_array=new int[size+1];
		int j=0;
		int i=0;
		

		while(j<size+1)
		{
			if(j!=index)
			{
				new_array[j]=array[i];
				j++;
				i++;
			}
			else
			{
				new_array[j]=number;
				j++;
			}
			
		}

		for ( j=0;j<size+1 ;j++ ) {
						System.out.print(new_array[j]+" ");
			}
	}}
		
		