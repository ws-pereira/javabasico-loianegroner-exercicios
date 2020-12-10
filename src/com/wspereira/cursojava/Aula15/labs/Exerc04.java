/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Crescimento da população
 */

package com.wspereira.cursojava.Aula15.labs;

public class Exerc04 {

	public static void main(String[] args) {
		
		int paisA = 80000;    // Taxa anual de crescimento de 3%
		int paisB = 200000;   // Taxa anual de crescimento de 1.5%
		
		int ano = 0;          // Calcular quanto tempo A será maior que B
		
		do {
			paisA += paisA * 0.03;
			paisB += paisB * 0.015;
			ano++;
		}while(paisA < paisB);
		
		System.out.println("País A - "+ paisA);
		System.out.println("País B - "+ paisB);
		System.out.println(ano);
	}

}
