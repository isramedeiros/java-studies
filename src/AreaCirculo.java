import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        // temos que usar math.pow
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double raio = sc.nextDouble();

        double area = pi * (Math.pow(raio, 2));

        System.out.printf("A=%.4f%n", area);
    }
}
