import java.util.*;

public class amar 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no:");
        int num=sc.nextInt();
        int temp=num;
        int temp2;
        int power=0;
        int sum=0;
        while (num!=0) 
        {
            num/=10;
            power++;
        }
        for (int i = 1; i <= power; i++) 
        {
            temp2=num%10;
            num /=10;
            int ans=1;
            for (int j = 1; j < power; j++) 
            {
                ans *= temp2;
            }
             sum=sum+ temp2;
        }
        if (sum==temp) 
        {
            System.out.println("num is aramstrong");
        }
        else
            System.err.println("not");
    }
}
