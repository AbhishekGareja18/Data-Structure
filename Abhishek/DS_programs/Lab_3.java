import java.util.Scanner;
public class Lab_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Character : ");
        String st = sc.nextLine();
        char ch = st.charAt(0);
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
            System.out.println("Vovel");
        }
        else{
            System.out.println("Not vovel");
        }
    }
}
