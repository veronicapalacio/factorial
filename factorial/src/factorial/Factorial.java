/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author vpala
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int factorial=0;
        int resultado=1;
        Scanner f  = new Scanner (System.in);
        System.out.println("escriba un numero");
        factorial = f.nextInt();
    for (int i = factorial; i>0; i --)     
    {
        resultado = resultado * i;
    }
              System.out.println(resultado);  
    }
    
}
