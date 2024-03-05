/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ1;

/**
 *
 * @author Silvio Junior
 */
public class Venda {
    String codigoProduto;
    double valorUnitario;
    int quantidade;
    
    public Venda(){
        
    }

    public Venda(String codigoProduto, double valorUnitario, int quantidade) {
        this.codigoProduto = codigoProduto;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public double valorTotal() {
        return valorUnitario * quantidade;
    }
}
