/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preprova;

import java.util.Scanner;

/**
 *
 * @author matteo.rbatagliese
 */
public class exem3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int op;
      do{
          System.out.println("--CALCULADORA SIMPLES--");
          System.out.println("1-Adiçao");
          System.out.println("2-Subtraçao");
          System.out.println("3-Mutiplicaçao");
          System.out.println("4-Divisao");
          
          System.out.println("ESCOLHA A OPERAÇAO: ");
           op = leia.nextInt();
           
          if (op<1 || op>4){
              System.out.println("Operaçao ivalida!" + "\nDigite uma operaçao entre 1 e 4");
          }
        } while(op<1 || op>4);
        
        System.out.println("Numero um: ");
        double n1= leia.nextDouble();
         System.out.println("Numero dois: ");
        double n2= leia.nextDouble();
        
         double res;
        if (op==1){
        res = n1+n2;
            System.out.println("Resultado: " + res);
        }else if (op==2){
         res = n1-n2;
            System.out.println("Resultado: " + res);
        }else if (op==3){
        res = n1*n2;
            System.out.println("Resultado: " + res);
        }else if (op==4){
        res = n1/n2;
            System.out.println("Resultado: " + res);
        }
        
        
    }
}
