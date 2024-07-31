
import java.util.Scanner;
public class Lab6_2{
    
    class EmployeDetail{
      int Employe_ID;
      String Name;
      String Designation;
      Double Salary;

      void EmployeDetail(){
        this.Employe_ID=Employe_ID;
        this.Name;
        this.Designation;
        this.Salary;
      }
    display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Employee id :-");
        Employe_ID=sc.nextInt();
        System.out.println("enter name :-");
        Name=sc.next();
        System.out.println("enter your designation :-");
        Designation=sc.next();
        System.out.println("enter salary:-");
        Salary=sc.nextDouble();
    }
          
    }
    public static void main(String[] args) {
        EmployeDetail e1=new EmployeDetail();
        System.out.println("id:-"+Employee_ID+"\n name:-"+Name+"\n designation"+Designation+"\n Salary"+Salary);
    }
    
    
}