/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13alp;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class Aula13ex2 {

    public static int tamanho() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = leia.nextInt();

        return tamanho;
    }

    public static int[] prencher(int tamanho) {
        Scanner leia = new Scanner(System.in);
        int vetor[] = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite o numero [%d]:", i);
            vetor[i] = leia.nextInt();
        }
        return vetor;
    }

    public static void imprimir(int[] vetor) {
        System.out.println("--- Imprimindo... ---");

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("vetor[%d]: %d\n", i, vetor[i]);
        }
    }

    public static int soma(int vetor[]) {
        int soma = 0;
        System.out.println("===========================");
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        return soma;
    }

    public static int[] encontrarMaiorMenor(int vetor[]) {
        int maior = vetor[0];
        int menor = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }

            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        return new int[]{maior, menor};
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int tam = tamanho();
        int vetor[] = prencher(tam);
        imprimir(vetor);

        int resultado = soma(vetor);

        System.out.println("Soma foi: " + resultado);

        int[] maiorMenor = encontrarMaiorMenor(vetor);

        System.out.println("Maior: " + maiorMenor[0]);
        System.out.println("Menor: " + maiorMenor[1]);

    }
}
