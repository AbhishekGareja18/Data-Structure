import java.util.Scanner;
public class MatrixMultiplication {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] m1=new int[3][2];
        int[][] m2=new int[2][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.println("enter matrix1 of element :-");
                m1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.println("enter matrix2 of element :-");
                m2[i][j]=sc.nextInt();
            }
        }
        int r1=3;
        int c1=2;
        int r2=c1;
        int c2=3;
        int[][]ans=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
           
            ans[i][j]=0;
                for(int k=0;k<r2;k++){
                    ans[i][j]+=m1[i][k]*m2[k][j];
                    
                }
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                if (j==2) {
                    System.out.println(ans[i][j]);
                }else{
                    System.out.println(ans[i][j]+" ");
  
                }
            }
        }
        
    }
}
