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
public class areas {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor de A");
        double a = leia.nextDouble();
        System.out.println("Digite o valor de B");
        double b = leia.nextDouble();
        System.out.println("Digite o valor de C");
        double c = leia.nextDouble();

        double areat = a * c / 2;
        System.out.println("A) a area do triangulo e: " + areat);
        double pi = 3.14159;
        double areac = pi * (c * c);
        System.out.println("B) a area do circulo e: " + areac);
        double areatra = (a + b) * c / 2;
        System.out.println("C) a area do trapzeo e: " + areatra);
        double areaq = b * b;
        System.out.println("D) a area do trapzeo e: " + areaq);
        double arear = a * b;
        System.out.println("E) a area do  retrangulo e: " + arear);
        double peri = 2 * (a + b);
        System.out.println("F) O perimetro do retangulo e: " + peri);

    }
}
