/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop+ condicional - Calculo do valor total
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exerc22 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de CDs investido - ");
		int qtdCds = sc.nextInt();
		
		double somaValores = 0.00;
		
		for(int x = 0; x < qtdCds; x++) {
			
			System.out.print("Valor do CD #"+ (x+1) + " R$ ");
			double valorCd = sc.nextDouble();
			somaValores += valorCd;
		}
		
		double mediaValor = somaValores / qtdCds;
		
		System.out.println("Valor médio CDs gasto R$ "+mediaValor);
		sc.close();
		
	}

}
