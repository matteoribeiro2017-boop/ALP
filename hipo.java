/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcoes;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class hipo {
     public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor do numero 1");
        double n1 = leia.nextDouble();
         System.out.println("Digite o valor do numero 2");
        double n2 = leia.nextDouble();
        
        double hip = n1*n1+n2*n2;
        double res = Math.sqrt(hip);
         System.out.println("A hipotenusa e: " + res);
        
     
     
     
     
     }
}
