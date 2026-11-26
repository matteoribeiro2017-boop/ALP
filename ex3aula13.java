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
public class ex3aula13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int matriz [][]= {{1,2,3} , {4,5,6}, {7,8,9}};
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Matriz [%d] [%d]:  %d\n" , i, j, matriz[i][j]);
            }
        }
        
        
    }
}
