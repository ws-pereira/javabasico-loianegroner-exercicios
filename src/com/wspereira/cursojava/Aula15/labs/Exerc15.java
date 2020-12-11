/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - apresentar até o n-enésio termo de Fibonacci
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		
		int pTermo = 0;    // Primeiro termo
		int sTermo = 1;    // Segundo Termo
		int fibo = 0;
		int count = 0;
		
		System.out.println();
		System.out.println("Termos de Fibonacci até 500");
		System.out.print(pTermo + " -> " + sTermo);
		while(fibo <= 500) {
			
			fibo = pTermo + sTermo;
			pTermo = sTermo;
			sTermo = fibo;
			System.out.print(" -> " + fibo);
			
			// Gerando quebra de linha
			count++;
			if(count == 10) {
				count = 0;
				System.out.println();
			}
		}

	}

}
