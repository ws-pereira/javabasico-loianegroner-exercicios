/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Cálculos com nros inteiros e e real
 */

package com.wspereira.cursojava.Aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exec11 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Entrada dos dados
		System.out.print("Digite dois nros. inteiro separados com espaço - ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.print("");
		System.out.print("Digite um nr. com casa decimal - ");
		double n3 = sc.nextDouble();

		// Cálculos 
		 
		double n4 = ((n1 * 2) * (n2 /2));
		double n5 = ((n1  * 3) + n3);
		double n6 = Math.pow(n3, 3);
		
		System.out.println("Dobro do primeiro com metade do segundo " + n4);
		System.out.println("Soma do triplo do primeiro com o terceiro " + n5);
		System.out.println("terceiro elevado ao cubo " + n6);
		
		sc.close();

	}

}
