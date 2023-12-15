import java.util.Scanner;

public class QuintaQuestao {
    public static void main(String[] args) {
        
        int[][] distanciadasCidades = {
            {0, 2, 11, 6, 15, 11, 1},
            {2, 0, 7, 12, 4, 2, 15},
            {11, 7, 0, 11, 8, 3, 13},
            {6, 12, 11, 0, 10, 2, 1},  // Matriz de distâncias entre cidades
            {15, 4, 8, 10, 0, 5, 13},
            {11, 2, 3, 2, 5, 0, 14},
            {1, 15, 13, 1, 13, 14, 0}
        };

        Scanner scanner = new Scanner(System.in);
        int origem, destino, primeiro, segundo;
        int distancia = 7*7;

        do {
            // Solicitar informaçoes do usuario
            System.out.println("Aplicação que escolhe o seu melhor roteiro de viagem!");

            System.out.println("Digite um numero entre 1 e 7 para a cidade de origem: ");
            origem = scanner.nextInt();

            System.out.println("Digite um numero entre 1 e 7 para a primeira cidade de descanso: ");
            primeiro = scanner.nextInt();

            System.out.println("Digite um numero entre 1 e 7 para a segunda cidade de descanso: ");
            segundo = scanner.nextInt();

            System.out.println("Digite um numero entre 1 e 7 para a cidade de destino: ");
            destino = scanner.nextInt();

            // Verificar se as entradas são válidas
            if (origem < 1 || origem > distancia || primeiro < 1 || primeiro > distancia || segundo < 1 || segundo > distancia || destino < 1 || destino > distancia)
                System.out.println("Uma ou mais cidades digitadas são inválidas. Por favor, insira valores entre 1 e " + distanciadasCidades + ".");
        } while (origem < 1 || origem > distancia|| primeiro < 1 || primeiro > distancia || segundo < 1 || segundo > distancia || destino < 1 || destino > distancia);

        // Calcular tempos totais para as duas opções de rota
        int tempoTotalOpcao1 = distanciadasCidades[origem - 1][primeiro - 1] + distanciadasCidades[primeiro - 1][segundo - 1] + distanciadasCidades[segundo - 1][destino - 1];
        int tempoTotalOpcao2 = distanciadasCidades[origem - 1][segundo - 1] + distanciadasCidades[segundo - 1][primeiro - 1] + distanciadasCidades[primeiro - 1][destino - 1];

        // Exibir a melhor rota com base nos tempos totais
        if (tempoTotalOpcao1 < tempoTotalOpcao2) {
            System.out.println("A melhor rota é: Origem -> Cidade de descanso 1 -> Cidade de descanso 2 -> Destino");
            System.out.println("Tempo total de viagem: " + tempoTotalOpcao1 + " horas");
        } else if (tempoTotalOpcao2 < tempoTotalOpcao1) {
            System.out.println("A melhor rota é: Origem -> Cidade de descanso 2 -> Cidade de descanso 1 -> Destino");
            System.out.println("Tempo total de viagem: " + tempoTotalOpcao2 + " horas");
        } else
            System.out.println("Ambas as rotas têm o mesmo tempo total de viagem: " + tempoTotalOpcao1 + " horas");
    }
}
