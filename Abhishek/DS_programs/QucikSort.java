import java.util.*;

public class QucikSort {
   
    
    public void QucikSort( int []k,int lb,int ub,int i,int j, boolean flag){
         flag=true;
         if( lb < ub){
            i=lb;
            j=ub+1;
            int key=k[lb];
            while(flag=true){
                i++;
                while (k[i] < key) {
                    i++;
                    j--;
                }
                while(k[j] > key){
                    j--;
                }
                if(i<j){
                    int temp=k[i];
                    k[i]=k[j];
                    k[j]=temp;
                }
                else{
                    flag=false;
                }
            }int abhi=k[lb];
             k[lb]=k[ub];
             k[ub]=abhi;

       
         }
         void sort(){
            
         }
        
    }
    
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array;-");
    int n=sc.nextInt();
    System.out.println("enter array of element :-");
    int []k=new int[n];

    for(int a=0;a<=n;a++){
        k[a]=sc.nextInt();
    }
    
    for(int a=0;a<=n;a++){
        System.out.print(k[a]+",");
    }
     sc.close();
     
   }
    
}
