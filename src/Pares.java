import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        int contagem = 0;

        System.out.println("Números ímpares: ");

        for (int i = 0; i <= numero; i++) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
