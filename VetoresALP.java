/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetoresalp;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class VetoresALP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int tamanho = 10;
        int vetor[] = new int[tamanho];

        //System.out.println("Vetor: " + vetor);
        //vetor[0] = -2;
        //vetor[3] = vetor[9]-vetor[0];
        //vetor[5] = 38;
        //vetor[6] = 67;
        //vetor[9] = 500;
        //vetor[0] = -2;
        //vetor[3] = vetor[9]-vetor[0];
        
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Vetor [%d]:",i);
            vetor[i] = leia.nextInt();
        }
        System.out.println("=============\n");
        
        for (int i = 0; i < 10; i++) {
            System.out.printf("vetor[%d]: %d\n",i, vetor[i]);
        }
    }
    }

