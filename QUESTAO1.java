import java.util.Random;
import java.util.Scanner;

public class PrimeiraQuestao{
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Gera um número aleatório entre 1 e 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;

        // Inicializa as variáveis
        int tentativas = 0;
        int palpite;

        System.out.println("Jogo de Adivinhação!");
        System.out.println("Tente adivinhar um número entre 1 e 100.");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Tente um número menor.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroAleatorio);
    }
}
