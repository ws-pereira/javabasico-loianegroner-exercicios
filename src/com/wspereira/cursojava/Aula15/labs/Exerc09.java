/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - apresentar na telas nros ímpares de 1 a 50
 */

package com.wspereira.cursojava.Aula15.labs;

public class Exerc09 {

	public static void main(String[] args) {
		
		for(int x = 1; x <=50; x++) {
			if(x % 2 != 0) {
				System.out.print(x + " ");
			}
		}
		
		
	}

}
