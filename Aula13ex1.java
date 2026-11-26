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
public class Aula13ex1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        //declarar uma variavel para armz o tamanho do vetor
        int tamanho = 10;
        int vetor[] = new int[tamanho];
        int soma = 0;

        //prencher o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o numero [%d]:", i);
            vetor[i] = leia.nextInt();
        }
        System.out.println("===========================");

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Vetor [%d]: %d\n", i, vetor[i]);
        }
        //somar
        System.out.println("===========================");
        for (int i = 0; i < tamanho; i++) {
            soma = soma + vetor[i];
        }
        System.out.println("Soma foi: " + soma);

        int maior = vetor[0];
        int menor = vetor[0];
        for (int i = 0; i < tamanho; i++) {
            if (maior < vetor[i]) {
                maior = vetor[i];
            }
            if (menor > vetor[i]) {
                menor = vetor[i];
            }
        }

        System.out.println("O maior foi: " + maior);
        System.out.println("O menor foi: " + menor);
    }
}
