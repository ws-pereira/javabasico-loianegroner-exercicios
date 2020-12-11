/* Autor: Wanderson Pereira
 * Exerc�cios curso Java B�sico - Instrutora Loiane Groner
 * Trabalhando com loop - apresentar at� o n-en�sio termo de Fibonacci
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com n-en�simo termo de Fibonacci ");
		int nEnesimo = sc.nextInt();
		
		int pTermo = 0;    // Primeiro termo
		int sTermo = 1;    // Segundo Termo
		int fibo = 0;
		int count = 0;
		
		System.out.println();
		System.out.println("Termos de Fibonacci at� " + nEnesimo);
		System.out.print(pTermo + " -> " + sTermo);
		for(int x = 3; x <= nEnesimo; x++) {
			
			fibo = pTermo + sTermo;
			pTermo = sTermo;
			sTermo = fibo;
			System.out.print(" -> " + fibo);
			
			count++;
			if(count == 10) {
				count = 0;
				System.out.println();
			}
		}
		
		
		sc.close();

	}

}
