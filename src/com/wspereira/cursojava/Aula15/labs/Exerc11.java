/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - gerador de tabuada
 */
package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual tabuada deseja saber? ");
		int valor = sc.nextInt();
		int valorTabuada;
		
		for(int x = 1; x <=10; x++) {
			valorTabuada = x * valor;
			System.out.println(x + " x " + valor + " = " + valorTabuada);
		}
		
		sc.close();
	}

}
