/* Autor: Wanderson Pereira
 * Exerc�cios curso Java B�sico - Instrutora Loiane Groner
 * Trabalhando com loop - validar nro primo
 */
package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um n�mero ");
		int num = sc.nextInt();
		
		boolean primo = true;
		
		for(int x = 2; x < num; x++) {
			if(num % x == 0 ) {
				primo = false;
				System.out.println("N�o � numero Primo - divis�vel por " + x);
			}	
		}
		
		if(primo) {
			System.out.println("Numero Primo - divis�vel por 1 e ");
		}
		
		sc.close();

	}

}
