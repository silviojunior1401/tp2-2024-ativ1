/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edu.fatec.tp2.ativ1;

import java.util.Scanner;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio04 {

    public static void main(String[] args) {
        int n = 10;
        int negativos = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Informe o número da posição " + (i + 1) + ": ");
            if (scanner.nextInt() < 0) {
                negativos++;
            }
        }

        System.out.println("Quantidade de números de números negativos informados: " + negativos);
    }
}
