/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - apresentando a quantidade de nros pares e ímpares
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int qtdPares = 0, qtdImpares = 0;

		System.out.println("Entre com 10 números");
		for (int x = 0; x < 10; x++) {
			int nros = sc.nextInt();
			if(nros % 2 != 0) {
				qtdImpares++;
			}
			else {
				qtdPares++;
			}
		}
		
		System.out.println("Quantidade de pares   - " + qtdPares);
		System.out.println("Quantidade de impares - " + qtdImpares);
		sc.close();

	}

}
