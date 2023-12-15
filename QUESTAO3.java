import java.util.Scanner;

public class TerceiraQuestao {

    public static void main(String[] args) {
       
        int[][] tempopCidades = {
                {0, 2, 11, 6, 15, 11, 1},
                {2, 0, 7, 12, 4, 2, 15},
                {11, 7, 11, 0, 8, 3, 13}, //tabela de tempo de uma cidade para outra
                {6, 12, 11, 0, 10, 2, 1},
                {15, 4, 8, 10, 0, 5, 13,},
                {11, 2, 3, 2, 5, 0, 14,},
                {1, 15, 13, 1, 13, 14, 0}
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            
                System.out.print("Digite o número da cidade de origem de 1 a 7: "); //escolher  a cidade de origem
                int origem = scanner.nextInt();

                System.out.print("Digite o número da cidade de destino de 1 a 7: "); //escolher a cidade de destino
                int destino = scanner.nextInt();

                if (origem == destino) {   // Verifica se a origem é igual ao destino para encerrar o programa
                    System.out.println("Voce colocou a mesma cidade para origem e destino.");
                    break;
                }                
                
                if (origem >= 1 && origem <= 7 && destino >= 1 && destino <= 7) {   //confirma que as cidades estao dentro do tempo permitido, pois nao pode ser menor que 1 nem maior que 7
                    int tempo = tempopCidades[origem - 1][destino - 1];
                    System.out.println("Tempo entre as cidades " + origem + " e " + destino + ": " + tempo + " horas");

                    
                } else {
                    System.out.println("Por favor, digite números entre 1 e 7.");
                } 
            }
        } }
