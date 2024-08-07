import java.util.Scanner;

public class SelectionSortArray {
    
    static void SelectionSortArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            if(min_index!=i){
                int temp=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=temp;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("Element of ["+i+"]:----"+arr[i]+"");
        }
    }
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter index of["+i+"]:---");
            arr[i]=sc.nextInt();
        }
        SelectionSortArray(arr);
    }
}
