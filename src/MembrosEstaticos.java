import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticos {

    public static void main(String[] args) {
        // new scanner
        Scanner sc = new Scanner(System.in);

        // new object calculator using Calculator class
        Calculator calc = new Calculator();

        // asking for radius
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        // c and v are calculated by methods in Calculator class
        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        // printing Circumference, Volume and PI
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

    }
}
