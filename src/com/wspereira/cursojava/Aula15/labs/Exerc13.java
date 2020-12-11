/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - calcula potencia
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com base e expoente");
		int base = sc.nextInt();
		int expo = sc.nextInt();
		double resultado = base;
		
		for(int x = 1; x < expo; x++) {
			resultado *= base;
		}
		
		System.out.println(base + " ^ " + expo + " = " + resultado );
		
		sc.close();

	}

}
