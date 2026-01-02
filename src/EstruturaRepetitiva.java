import java.util.Scanner;

public class EstruturaRepetitiva {
    public static void main(String[] args) {
        // programa que repita a leitura de uma senha até que ela seja válida
        // para cada leitura de senha incorreta, exibir "senha inválida"
        // quando a senha for correta, exibir "acesso permitido"
        Scanner sc = new Scanner(System.in);

        int senha = 2002;

        System.out.println("Digite a senha: ");
        int palpite = sc.nextInt();

        while (palpite != senha) {
            System.out.println("Senha inválida");
            System.out.println("Digite a senha: ");
            palpite = sc.nextInt();
        }

        System.out.println("Acesso permitido");

    }
}
