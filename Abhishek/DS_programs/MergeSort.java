import java.util.Scanner;
public class MergeSort {
   void MergeSort(int []arr,int low,int high){
    if (low<high) {
        int mid =(low+high)/2;
        
        MergeSort(arr,low,mid);
        MergeSort(arr,mid+1, high);
       merge(arr,low,high,mid);
    }
   } 
   public static void merge(int []b,int []arr,int low,int high,int mid){
    int h=low;
    int i=low;
    int j=mid+1;

    while (h<=mid & j<=high) {
        if(arr[h] <= arr[j]){
            b[i]=arr[h];
            h++;
        }
        else{
            b[i]=arr[j];
            j++;
        }i++;
    }
    if (h>mid) {
       for(int k=j;k<=high;k++){
        b[i]=arr[k];
        i++;
       }
    }
    else{
        for(int k=h;k<=mid;k++){
            b[i]=arr[k];
            i++;
        }
    }
    for(int k=low;k<=high;k++){
        arr[k]=b[k];
    }
   }

       public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of arry");
        int n=sc.nextInt();
        System.out.println("enter elment of arry");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("------Unsorted array-------");
        for(int i=0;i<n;i++){
           System.out.println(arr[i]+"");
        }
 
        System.out.println("------sorted array-------");
        for(int i=0;i<n;i++){
           System.out.println(arr[i]+"");
        }sc.close();
    }
}