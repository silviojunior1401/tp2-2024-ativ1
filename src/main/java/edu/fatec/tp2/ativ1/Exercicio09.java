/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ1;

import java.util.Scanner;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a taxa Selic: ");
        
        double selic = scanner.nextDouble();
        
        System.out.print("Digite o capital para aplicação: ");
        
        double capital = scanner.nextDouble();

        calcularRendimento("CDB Banco Pague Mais", capital, selic, 0.85, "Rendimento", 0.10, 0);
        calcularRendimento("CBD Fura Bolso", capital, selic, 0.93, "Capital", 0.01, 0.06);
    }

    public static void calcularRendimento(String nome, double capital, double selic, double percentualSelic, String tipoTaxaAdmin, double taxaAdmin, double impostoRenda) {
        System.out.println("\n" + nome + ":");
        System.out.println("Taxa selic: " + selic);
        System.out.println("Capital investido: " + capital);
        System.out.println("Mês Capital Rendimento  Total");
        
        double total = capital;
        
        double descontoTotal = 0;
        
        for (int i = 1; i <= 12; i++) {
            double rendimento = total * (selic * percentualSelic / 100);
            double valorTxAdmin = tipoTaxaAdmin.equals("Rendimento") ? rendimento * taxaAdmin : capital * taxaAdmin;
            double desconto = valorTxAdmin + (total * impostoRenda);
            total += rendimento;
            System.out.printf("%d   %.2f    %.2f    %.2f\n", i, capital, rendimento, total);
            capital = total;
            descontoTotal += desconto;
        }
        
        System.out.printf("\nRendimento Total: %.2f", total);
        System.out.printf("\nDescontos: %.2f", descontoTotal);
        System.out.printf("\nRendimento Líquido: %.2f", (total - descontoTotal));
    }
}
