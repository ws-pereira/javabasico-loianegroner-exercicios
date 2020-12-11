/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - validar nro primo
 */
package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um número ");
		int num = sc.nextInt();
		
		boolean primo = true;
		
		for(int x = 2; x < num; x++) {
			if(num % x == 0 ) {
				primo = false;
				System.out.println("Não é numero Primo - divisível por " + x);
			}	
		}
		
		if(primo) {
			System.out.println("Numero Primo - divisível por 1 e ");
		}
		
		sc.close();

	}

}
