/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz14al;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class Diariodeclasse {

    //1- prencher a matriz via Scanner
    //funçao que modifica o obj
    //funçao com efeito colateral
    public static void PreencherNotas(float matriz[][], Scanner leia) {
        System.out.println("=== Preenchendo a Matriz ===");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("=== Nota do Aluno " + (i + 1) + "  ===");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Avaliaçao " + (j + 1) + " :");
                matriz[i][j] = leia.nextFloat();
            }
        }

    }

    //2 imprimir elementos por elemnetos da matriz
    public static void imprimirNotas(float matriz[][]) {
        System.out.println("=== IMPRIMINDO A MATRIZ ===");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Aluno " + (i + 1) + " :\t");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%.1f\t", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static float[] calcularmedia(float matriz[][]) {
        // criaçao do vetor medias
        float medias[] = new float[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            float soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma = soma + matriz[i][j];
            }
            medias[i] = soma / matriz[i].length;
        }
        return medias;
    }

    //3 imprimir o vetor de medias
    public static void imprimirVetorMedidas(float[] medias) {
        for (int i = 0; i < medias.length; i++) {
            System.out.printf("Aluno %d -> Media: %.1f\n", (i + 1), medias[i]);
        }

    }

    //4 Funçao que verifique a quantidade de alunos abaixo da media
    //Funçao que verifica a quantidade de alunos a baixo da media
    //OBS: ela recebe o vetor de medias e retorna a qtde 
    //testar no mian
    public static int alunosAbaixoMedia(float medias[]) {
        int quantidade = 0;

        for (int i = 0; i < medias.length; i++) {
            if (medias[i] < 6) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int qtdealunos = 3;
        int qtdenotas = 4;

        //matriz 3 linhas e 4 colunas 3 alunos e 4 notas
        float notas[][] = new float[qtdealunos][qtdenotas];

        //1 Passagem e do Scanner por parametro
        PreencherNotas(notas, leia);

        //2 impressao da matriz
        System.out.println("=== Boletim da Turma ===");
        imprimirNotas(notas);
        float mediasdosalunos[] = calcularmedia(notas);
        System.out.println("=== MEDIA INDIVIDUAL DOS ALUNOS ===");
        imprimirVetorMedidas(mediasdosalunos);
        int abaixodamedia = alunosAbaixoMedia(mediasdosalunos);
        System.out.println("=== ALUNOS ABAIXO DA MEDIA ===");
        System.out.println("Alunos abaixo da media: " + abaixodamedia);

    }

}
