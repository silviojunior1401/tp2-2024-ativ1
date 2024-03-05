/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.fatec.tp2.ativ1;

import java.util.Scanner;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        
        int num = scanner.nextInt();
        boolean numPrimo = true;
        for(int i = 2; i <= num / 2; ++i) {
            if(num % i == 0) {
                numPrimo = false;
                break;
            }
        }

        if (numPrimo)
            System.out.println(num + " é um número primo.");
        else
            System.out.println(num + " não é um número primo.");
    }
}
