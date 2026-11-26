/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgwhile;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class FOR1 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        for (int n = 1; n <= 10; n++) {
            System.out.println("Tabuada do " + n);
            for (int i = 1; i <= 10; i++) {
                int resultado = n * i;
                System.out.println(n + "x" + i + " = " + resultado);
            }
        }
        System.out.println("");
    }

}
