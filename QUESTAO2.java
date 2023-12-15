import java.util.Random;

public class SegundaQuestao {
    public static void main(String[] args) {
        // Gerar temperaturas aleatórias para 28 dias
        Random rand = new Random();
        double[] temperaturas = new double[28];

        for (int i = 0; i < 28; i++) {
            temperaturas[i] = 10 + rand.nextDouble() * 25;
        }

        // Criar matriz 2D para representar temperaturas ao longo de 4 semanas
        double[][] matriztemperaturas = new double[7][4];
        int dia = 0;

        // Preencher a matriz com as temperaturas geradas
        for (int semana = 0; semana < 4; semana++) {
            for (int semanadia = 0; semanadia < 7; semanadia++){
                matriztemperaturas[semanadia][semana] = temperaturas[dia];
                dia++;
            }
        }

        // Calcular a média das temperaturas para cada dia da semana
        double[] mediapordiasdasemana = new double[7];

        for (int i = 0; i < 7; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += matriztemperaturas[i][j];
            }
            mediapordiasdasemana[i] = soma / 4; 
        }

        // Calcular a média geral das temperaturas
        double somatotal = 0;
        for (double temperatura : temperaturas) {
            somatotal += temperatura;
        }

        double mediageral = somatotal / 28;

        // Imprimir as temperaturas registradas por dia
        System.out.println("Temperaturas registradas por dia: ");
        String[] diassemana = {"Domingo", "Segunda", "Terça  ", "Quarta ", "Quinta ", "Sexta  ", "Sábado"};

        for (int i = 0; i < 7; i++){
            System.out.print(diassemana[i] + " ");
        }
        System.out.println();

        // Imprimir a matriz de temperaturas
        for (int semana = 0; semana < 4; semana++){
            for(int semanadia = 0; semanadia < 7; semanadia++){
                System.out.printf("%.2f°C\t", matriztemperaturas[semanadia][semana]);
            }
            System.out.println();
        }

        // Imprimir a média das temperaturas para cada dia da semana
        System.out.println("\nMédia das temperaturas para cada dia da semana: ");
        for (int i = 0; i < 7; i++) {
            System.out.println(diassemana[i] + ": " + String.format("%.2f°C", mediapordiasdasemana[i]));
        }

        // Imprimir a média geral das temperaturas
        System.out.println("\nMédia geral das temperaturas: " + String.format("%.2f°C", mediageral));
        System.out.println();
    }
}
