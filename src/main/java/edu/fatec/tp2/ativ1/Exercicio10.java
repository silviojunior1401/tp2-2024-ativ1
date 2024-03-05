/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Venda> vendas = new ArrayList<>();
        double totalVendido = 0;
        int totalItensVendidos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o código do produto: ");
            String codigoProduto = scanner.next();
            System.out.print("Informe o valor unitário do produto: ");
            double valorUnitario = scanner.nextDouble();
            System.out.print("Informe a quantidade vendida do produto: ");
            int quantidade = scanner.nextInt();

            Venda venda = new Venda(codigoProduto, valorUnitario, quantidade);
            vendas.add(venda);

            System.out.println("Valor total desta venda: " + venda.valorTotal());

            totalVendido += venda.valorTotal();
            totalItensVendidos += quantidade;
        }

        Venda maiorVenda = Collections.max(vendas, Comparator.comparing(Venda::valorTotal));
        Venda menorVenda = Collections.min(vendas, Comparator.comparing(Venda::valorTotal));

        System.out.println("Valor médio vendido: " + totalVendido / vendas.size());
        System.out.println("Produto com maior venda: Código " + maiorVenda.codigoProduto + ", Quantidade " + maiorVenda.quantidade + ", Valor total " + maiorVenda.valorTotal());
        System.out.println("Produto com menor venda: Código " + menorVenda.codigoProduto + ", Quantidade " + menorVenda.quantidade + ", Valor total " + menorVenda.valorTotal());
        System.out.println("Valor total vendido: " + totalVendido);
        System.out.println("Quantidade total de itens vendidos: " + totalItensVendidos);
    }
}
