import java.util.Scanner;
public class MatrixTwobyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix1=new  int [2][2]; 
        int[][] matrix2=new  int [2][2]; 
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("enter element of 1st 2*2 matrix:-");
                 matrix1[i][j]=sc.nextInt();
                
            }
        } 
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("enter element of 2st 2*2 matrix:-");
                 matrix2[i][j]=sc.nextInt();
               
            }
        } 
        int[][] sum=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                 sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
            

        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                 System.out.println(sum[i][j]+"");
            }

        }
    }
    
}
