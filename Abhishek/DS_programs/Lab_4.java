import java.util.Scanner;
public class Lab_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int t = n;
        for(int i = 2;i < t; i++){
            n = n*i;
        }
        System.out.println(n);
        
    }
    
}