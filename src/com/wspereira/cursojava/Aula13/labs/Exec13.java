/* Autor: Wanderson Pereira
 * Exercícios de fixação - Curso grátis Loiane Groner
 * Cálculo do salário no mês atual
 */

package com.wspereira.cursojava.Aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exec13 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Entrada dos dados - valor horas e horas trabalhadas
		System.out.print("Valor da hora - R$ ");
		double valorHora = sc.nextDouble();
		System.out.print("Horas trabalhadas");
		double hrsTrabalho = sc.nextDouble();
		
		//Calculo do Salario Bruto
		double salario = valorHora * hrsTrabalho;
		
		// Calculo dos descontos - 11% imposto de renda, 8% para INSS, 5% sindicato 
		
		double descIR = salario * 0.11;
		double descINSS = salario * 0.08;
		double descSind = salario * 0.05;
		
		// Soma dos descontos
		double totalDesc = descIR + descINSS + descSind;
		double salarioLiquido = salario - totalDesc; // Salário liquido
		System.out.println();
		System.out.println("Salario Bruto R$ " + salario);
		System.out.println("Desconto IR R$ "+ descIR);
		System.out.println("Desconto INSS R$ " + descINSS);
		System.out.println("Desconto Sindicato R$ "+ descSind);
		System.out.println("Desconto Total R$ " + totalDesc);
		System.out.println("Salário Líquido R$ " + salarioLiquido);
		sc.close();
		
	}

}
