/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - lendo várias temperaturas, até que um condição de final
 * seja digitada
 */


package com.wspereira.cursojava.Aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exerc27 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Entrando com a quantidade de leituras
		System.out.print("Entre com a quantidade de temperaturas ");
		int qtdTemp = sc.nextInt();
		
		double maior = Double.MAX_VALUE;
		double menor = Double.MIN_VALUE;
		
				
		double lendoTemp = 0;
		double somaTemp = 0;
		double media = 0;
		
		for(int x = 1; x <= qtdTemp; x++) {
			System.out.print("Entre com a temperatura " + x + " - ");
			lendoTemp = sc.nextDouble();
			
			somaTemp += lendoTemp;
			
			if(maior > lendoTemp) {
				maior = lendoTemp;
			}
			if(menor < lendoTemp) {
				menor = lendoTemp;
			}
			
		}
		
		media = somaTemp / qtdTemp;
		
		System.out.println("Maior Temperatura " + maior);
		System.out.println("Menor Temperatura " + menor);
		System.out.printf("Media temperatura %.1f ", media);
		
		sc.close();
		
	}

}
