/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - digitar 5 números e apresentar a soma e média deles
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nros, soma = 0;
		System.out.println("Digite 5 números abaixo ");
		
		for(int x = 0; x < 5; x++) {
			nros = sc.nextInt();
			
			soma += nros;
		}
		double media = soma / 5;
		
		System.out.println("Soma dos números  " + soma);
		System.out.println("Média dos números " + media);
		sc.close();
		
	}

}
