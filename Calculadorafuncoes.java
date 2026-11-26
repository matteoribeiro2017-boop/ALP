/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoesapl1;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class Calculadorafuncoes {

    public static int menu() {
        Scanner leia = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("===CALCULADORA SIMPLES===");
        System.out.println("=========================");
        System.out.println("1-Adiçao");
        System.out.println("2-Subtraçao");
        System.out.println("3-Mutiplicaçao");
        System.out.println("4-Divisao");
        System.out.println("Digite a opçao: ");
        int op = leia.nextInt();
        return op;
    }

    public static float entradaDados() {
        System.out.println("===ENTRADA DE DADOS===");
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite numero:");
        float n = leia.nextFloat();
        return n;
    }
    
    public static float adicao(float n1, float n2){
    
        
    }

    public static void main(String[] args) {

    }
}
