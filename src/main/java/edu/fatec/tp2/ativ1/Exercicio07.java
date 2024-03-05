/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.fatec.tp2.ativ1;

/**
 *
 * @author Silvio Junior
 */

public class Exercicio07 {
    public static void main(String[] args) {
        // a. crie uma variável a1 do tipo aluno que receba a instância de Aluno
        Aluno a1 = new Aluno();

        // b. atribua valores arbitrários
        a1.nome = "João";
        a1.p1 = 7.5;
        a1.p2 = 8.5;

        // c. mostre os valores
        System.out.println("Nome do aluno a1: " + a1.nome);
        System.out.println("Nota p1 do aluno a1: " + a1.p1);
        System.out.println("Nota p2 do aluno a1: " + a1.p2);

        // d. crie uma variável a2 que receba a1
        Aluno a2 = a1;

        // e. altere os valores da p1 e p2 na variável a2 e mostre os valores dos atributos de a1 e a2
        a2.p1 = 9.0;
        a2.p2 = 9.5;

        System.out.println("Nome do aluno a2: " + a2.nome);
        System.out.println("Nota p1 do aluno a2: " + a2.p1);
        System.out.println("Nota p2 do aluno a2: " + a2.p2);

        System.out.println("Nome do aluno a1 após alteração: " + a1.nome);
        System.out.println("Nota p1 do aluno a1 após alteração: " + a1.p1);
        System.out.println("Nota p2 do aluno a1 após alteração: " + a1.p2);
        
        /**
         * Como a1 e a2 são referências para o mesmo objeto, as alterações feitas através de a2 também afetam a1.
         */
    }
}
