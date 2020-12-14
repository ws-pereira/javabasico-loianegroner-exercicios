/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - média aritmética de N notas
 */
package com.wspereira.cursojava.Aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantidade de notas - ");
		int qtdNotas = sc.nextInt();
		double media = 0;
		double notas;
		
		for(int x = 0; x < qtdNotas; x++) {
			notas = sc.nextDouble();
			media += notas;
		}
		
		media /= qtdNotas;
		
		System.out.println("Média - " + media);
		
		sc.close();
		
	}

}
