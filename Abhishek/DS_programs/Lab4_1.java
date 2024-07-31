import java.util.Scanner;

public class Lab4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a= {1,2,3,4,5};
        System.out.println("Enter Number which you want to add = ");
        int num = sc.nextInt();
        System.out.println("Enter Index =");
        int index = sc.nextInt();
        int []b = new int[6];
        for(int i=0;i<b.length;i++){
            if(i<index){
                b[i] = a[i];
            }
            if(i== index){
                b[i] = num;
            }
            if(i> index){
                b[i] = a[i-1];
            }
        }
        for(int j = 0;j<b.length;j++){
            System.out.print(b[j]+",");
        }
    }
}