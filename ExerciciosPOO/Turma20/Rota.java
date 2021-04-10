package Turma20;

import java.util.Scanner;

public class Rota {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] km = {{0, 20, 32, 45, 85, 90}, {20, 0, 20, 40, 65, 70}, {32, 20, 0, 25, 48, 49}, 
                {45, 40, 25, 0, 39, 52}, {85, 65, 48, 39, 0, 36}, {90, 70, 49, 52, 36, 0}};

        int[] rota = new int[6];
        String[] cid = {"Belo Horizonte", "Contagem", "Betim", "Juatuba", "Pará de Minas", "Itaúna"};
        int km_rodados = 0;

        System.out.println("Distância entre Pará de Minas e Betim: "+km[4][2]);

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                System.out.printf("%d\t", km[i][j]);
            }
            System.out.printf("\n");
        }

        System.out.println("Digite sua rota: \n\n1. Belo Horizonte\t2. Contagem\t3. Betim\n"
                + "4. Juatuba\t5. Pará de Minas\t 6.Itaúna\n");

        for(int i = 0; i < 6; i++){
            rota[i] = input.nextInt(); 
        }

        System.out.println("\nROTA: \n");

        for(int i = 0; i < 6; i++){
            System.out.printf("%d. %s\n", i+1, cid[rota[i]-1]);
        }
        for(int i = 0; i+1 < rota.length; i++){
            int idDaCidade = rota[i]-1;
            int idDaProximaCidade = rota[i+1]-1;
            int kmsEntreAsCidades = km[idDaCidade][idDaProximaCidade];
            System.out.println("Distância entre "+cid[idDaCidade]+" e "+cid[idDaProximaCidade]+": "+kmsEntreAsCidades);
            km_rodados += kmsEntreAsCidades; //Equivalente a "km_rodados = km_rodados + kmsEntreAsCidades;"
            System.out.println("Total de kms rodados até agora: "+km_rodados);
        }

        System.out.printf("\nKilômetros rodados: %d\n", km_rodados);
    } 
}