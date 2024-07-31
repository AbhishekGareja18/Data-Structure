import java.util.Scanner;
public class Lab6_1 {
    public static void main(String[] args){
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a ;-");
        a=sc.nextInt();

        System.out.println("Enter value of b ;-");
         b=sc.nextInt();

        swap(a,b);
    }
    public static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
            System.out.println("swap value of a is "+a);
            System.out.println("swap value of b is "+b);

        }
       
}
