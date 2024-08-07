import java.util.*;
public class BubbleSortArray {
    static void BubbleSortArray(int[] arr){
        int  n=arr.length;
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                } 
            }
            if(count==0){
                System.out.println("vector is sorted");
                break;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter index of["+i+"]:---");
            arr[i]=sc.nextInt();
        }
       BubbleSortArray(arr);
    }
}
