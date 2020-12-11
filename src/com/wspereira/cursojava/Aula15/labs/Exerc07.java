/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - entrada de nros via teclado e apresentar o maior nro
 * Alterei o exercício para apresentar o maior e menor número
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int auxMaior = Integer.MIN_VALUE;
		int auxMenor = Integer.MAX_VALUE;
		
		System.out.println("Entre com 5 números");
		
		for(int x = 0; x < 5; x++) {
			int nros = sc.nextInt();
			if(nros > auxMaior) {
				auxMaior = nros;
			}
			if(nros < auxMenor) {
				auxMenor = nros;
			}
		}
		
		System.out.println("O maior número é " + auxMaior);
		System.out.println("O menor número é " + auxMenor);
		sc.close();
		
	}

}
