/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - exemplo de caixa registradora
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exerc25 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lojas Tabajaras");
		
		double somaValor = 0.00;
		double valorProduto = 0;
		int x = 1;
		
		do {
			System.out.print("Produto " + x + " R$ ");
			valorProduto = sc.nextDouble();
			somaValor += valorProduto;
			x++;
		}while(valorProduto != 0);
		
		System.out.println("Total - R$ " + String.format("%.2f", somaValor));
		System.out.print("Dinheiro - R$ ");
		double pgtoDinheiro = sc.nextDouble();
		double troco = pgtoDinheiro - somaValor;
		
		System.out.println("Troco - R$ " + String.format("%.2f", troco));
		sc.close();
	}

}
