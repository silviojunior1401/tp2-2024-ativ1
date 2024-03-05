/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.fatec.tp2.ativ1;

import java.util.Scanner;

/**
 *
 * @author Silvio Junior
 */
public class Exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário bruto: ");
        
        double salarioBruto = scanner.nextDouble();
        double valorInss = calcularInss(salarioBruto);
        double aliquotaInss = calcularAliquota(salarioBruto);
        double salarioLiquido = salarioBruto - valorInss;
        
        System.out.println("##########################");
        System.out.println("CALCULADORA DE INSS");
        System.out.println("##########################");
        
        System.out.println("Salário Bruto ....: R$ " + salarioBruto);
        System.out.println("Alíquota INSS (%).: " + aliquotaInss);
        System.out.printf("Desconto INSS ……..: R$ %.2f", valorInss);
        System.out.printf("\nSalário Líquido ..: R$ %.2f", salarioLiquido);
        System.out.printf("\n###########################\n");
    }

    public static double calcularInss(double salarioBruto) {
        if (salarioBruto <= 1212.00) {
            return salarioBruto * 0.075;
        } else if (salarioBruto <= 2427.35) {
            return (salarioBruto * 0.09) - 18.18;
        } else if (salarioBruto <= 3641.03) {
            return (salarioBruto * 0.12) - 91;
        } else if (salarioBruto <= 7087.21){
            return (salarioBruto * 0.14) - 163.82;
        } else {
            return (7087.22 * 0.14) - 163.82;
        }
    }
    
    public static double calcularAliquota(double salarioBruto) {
        if (salarioBruto <= 1212.00) {
            return 7.5;
        } else if (salarioBruto <= 2427.35) {
            return 9.0;
        } else if (salarioBruto <= 3641.03) {
            return 12.0;
        } else {
            return 14.0;
        }
    }
}
