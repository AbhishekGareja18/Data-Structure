import java.util.Scanner;

class temp_Converter {
    double c;
    double f;

    temp_Converter() {
        this.c = c;
        this.f = f;
    }

    void celsius() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
        this.c = sc.nextDouble();
        this.f = ((9 / 5) * this.c + 32);
        System.out.println("Temperature in Fahrenheit: " + this.f);
    }

    void fahrenheit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit: ");
        this.f = sc.nextDouble();
        this.c = (5 / 9) * (this.f - 32);
        System.out.println("Temperature in Celsius: " + this.c);

    }

    public static void main(String[] args) {
        temp_Converter t = new temp_Converter();
        t.celsius();
        t.fahrenheit();
    }
}
