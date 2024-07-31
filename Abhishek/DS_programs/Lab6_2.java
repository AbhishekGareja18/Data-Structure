import java.util.Scanner;

class Employee_Detail {
    int id;
    String name;
    String designation;
    int salary;

    Employee_Detail() {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void display() {
        Scanner sc = new Scanner(System.in);
        this.id = sc.nextInt();
        this.name = sc.next();
        this.designation = sc.next();
        this.salary = sc.nextInt();
        System.out.println("\n I d :" + this.id + "\n Name : " + this.name + "\n Designation : " + this.designation + "\n Salary : " + this.salary);
    }
}

public class Lab6_2 {
    public static void main(String[] args) {
        Employee_Detail a = new Employee_Detail();
        a.display();
    }
}
