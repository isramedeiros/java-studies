import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite o combustível utilizado: ");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Sair \n");
        int combustivel = sc.nextInt();

        do {
            exibirMenu();
            combustivel = sc.nextInt();

            switch (combustivel) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Valor inválido. Insira um número de 1 a 4");
            }

        } while (combustivel != 4);

        exibirRelatorio(alcool, gasolina, diesel);
    }

    private static void exibirMenu() {
        System.out.println("\nDigite o combustível utilizado:");
        System.out.println("1. Álcool");
        System.out.println("2. Gasolina");
        System.out.println("3. Diesel");
        System.out.println("4. Sair");
    }

    private static void exibirRelatorio(int alcool, int gasolina, int diesel) {
        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}

