import java.util.Scanner;

class Student_Detail {
    long EnrollmentNumber;
    String Name;
    int Sem;
    double cpi;

    Student_Detail() {
        this.EnrollmentNumber = EnrollmentNumber;
        this.Name = Name;
        this.Sem = Sem;
        this.cpi = cpi;
    }

    void display() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 2; i++) {
            System.out.println("Enter Enrollment Number: ");
            this.EnrollmentNumber = sc.nextLong();
            System.out.println("Enter Name: ");
            this.Name = sc.next();
            System.out.println("Enter Semester: ");
            this.Sem = sc.nextInt();
            System.out.println("Enter CPI: ");
            this.cpi = sc.nextDouble();
        }
        for (int i = 0; i <= 2; i++) {
            System.out.println("Enrollment Number: " + this.EnrollmentNumber);
            System.out.println("Name: " + this.Name);
            System.out.println("Semester: " + this.Sem);
            System.out.println("CPI: " + this.cpi);
        }
    }
}

public class Lab6_3 {
    public static void main(String[] args) {
        Student_Detail obj = new Student_Detail();
        obj.display();
    }
}
