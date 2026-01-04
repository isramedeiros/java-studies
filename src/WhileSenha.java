import java.util.Scanner;

public class WhileSenha {
    public static void main(String[] args) {
        // pedindo a senha
        pedirSenha();

        // quando encerrado o loop de pedirSenha(), mostrar isso:
        System.out.println("Acesso Permitido");

    }

    static void pedirSenha() {
        // criando novo scanner
        Scanner sc = new Scanner(System.in);

        // criando e inicializando variável senha
        int senha;

        // pede a senha enquanto for diferente de 2002
        do {
            System.out.println("Insira a senha: ");
            senha = sc.nextInt();
        }
        while (senha != 2002);

        // fecha o scanner para economizar recursos
        sc.close();
    }
}
