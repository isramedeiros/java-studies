import java.util.Scanner;

public class Coordenadas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("X: ");
        int x = sc.nextInt();

        System.out.println("Y: ");
        int y = sc.nextInt();

        String quadrante;

        if (x > 0 && y > 0) {
            quadrante = "primeiro";
        } else if (x > 0 && y < 0) {
            quadrante = "quarto";
        } else if (x < 0 && y > 0) {
            quadrante = "segundo";
        } else {
            quadrante = "terceiro";
        }

        System.out.println(quadrante);
    }
}
