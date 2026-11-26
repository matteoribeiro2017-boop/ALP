/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetoresalp;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
// 1 obter o tamanho
// 2 criar/popular o vetor
// 3 imprimir
public class ex2 {

    public static int definirtamanho() {
        System.out.println("--- Tamanho do vetor ---");
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o Tamanho do vetor: ");
        int tamanho = leia.nextInt();
        return tamanho;
    }

    public static int[] criarvetor(int tamanho) {
        System.out.println("--- Criando vetor ---");

        Scanner leia = new Scanner(System.in);
        int vetor[] = new int[tamanho];

        //pecorrer o vetor e solicitar os numeros
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Vetor [%d]: ", i);
            vetor[i] = leia.nextInt();
        }
        return vetor;
    }

    public static int somarnumeros(int vetor[]) {
        System.out.println("--- Somando elementos ---");
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i]; //ou soma+= vetor[i]
        }
        return soma;
    }

    public static void imprimir(int vetor[]) {
        System.out.println("--- Imprimindo o VETOR ---");

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor [%d]: %d\n", i, vetor[i]);
        }
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("---Main---");
        System.out.println("");
        int tamanho = definirtamanho();
        int[] vetor = criarvetor(tamanho);
        imprimir(vetor);
        System.out.println("=============");
        int soma = somarnumeros(vetor);
        System.out.println("Soma foi de: " + soma);
    }
}
