/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ1;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio08 {
    public static void main(String[] args) {
        int[] amostraX = {2, 7, 4, 3, 2};
        int[] amostraY = {1, 2, 3, 6, 5};

        // a) Σxj de j=1 para j=5
        int somaA = 0;
        for (int x : amostraX) {
            somaA += x;
        }

        // b) Σ(xj*yj) de j=1 para j=5
        int somaB = 0;
        for (int j = 0; j < amostraX.length; j++) {
            somaB += amostraX[j] * amostraY[j];
        }

        // c) Σ(xj*yj^2) de j=2 para j=4 e soma Σ3 de j=1 para j=5
        int somaC = 0;
        for (int j = 1; j <= 3; j++) {
            somaC += amostraX[j] * Math.pow(amostraY[j], 2);
        }
        
        somaC = somaC + (5 * 3);

        System.out.println("a) " + somaA);
        System.out.println("b) " + somaB);
        System.out.println("c) " + somaC);
    }
}
