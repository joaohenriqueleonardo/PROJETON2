import java.util.Scanner;

public class QuartaQuestao {
    public static void main(String[] args) {
        // Matriz representando as distâncias entre as cidades
        int[][] distanciasEntreCidades = {
            {0, 2, 11, 6, 15, 11, 1},
            {2, 0, 7, 12, 4, 2, 15},
            {11, 7, 0, 11, 8, 3, 13},
            {6, 12, 11, 0, 10, 2, 1},
            {15, 4, 8, 10, 0, 5, 13},
            {11, 2, 3, 2, 5, 0, 14},
            {1, 15, 13, 1, 13, 14, 0}
        };

        // Objeto Scanner para obter entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar origem, destino e tempo total de viagem
        int origem = -1;
        int destino = -1;
        int tempoTotal = 0;

        // Número total de cidades
        int distancia = 7 * 7;

        // Loop para obter a cidade de origem válida
        do {
            System.out.println("Digite o número da cidade de origem (1-7):");
            origem = scanner.nextInt();

            // Verifica se a cidade de origem é válida
            if (origem <= 0 || origem > distancia) {
                System.out.println("Número de Origem Inválido!");
            }

        } while (origem <= 0 || origem > distancia);

        // Loop para obter a cidade de destino e calcular o tempo total de viagem
        do {
            System.out.println("Digite o número da cidade de destino (1-7) ou 0 para retornar à origem:");
            destino = scanner.nextInt();

            // Verifica se a cidade de destino é válida
            if (destino < 0 || destino > distancia) {
                System.out.println("Número da cidade de destino inválido!");
            } else if (destino != 0) {
                // Adiciona a distância entre as cidades ao tempo total
                tempoTotal += distanciasEntreCidades[origem - 1][destino - 1];
                // Atualiza a cidade de origem para a cidade de destino
                origem = destino;
            }
        } while (destino != 0);

        // Exibe o tempo total de viagem quando o destino final é alcançado
        System.out.println("Você chegou ao seu destino final. O tempo total de viagem é: " + tempoTotal + " horas");
    }
}
