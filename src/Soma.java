import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        int soma = numero1 + numero2;

        System.out.printf("SOMA = %d", soma);

        sc.close();
    }
}
