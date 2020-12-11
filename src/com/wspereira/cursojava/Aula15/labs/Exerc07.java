/* Autor: Wanderson Pereira
 * Exerc�cios curso Java B�sico - Instrutora Loiane Groner
 * Trabalhando com loop - entrada de nros via teclado e apresentar o maior nro
 * Alterei o exerc�cio para apresentar o maior e menor n�mero
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int auxMaior = Integer.MIN_VALUE;
		int auxMenor = Integer.MAX_VALUE;
		
		System.out.println("Entre com 5 n�meros");
		
		for(int x = 0; x < 5; x++) {
			int nros = sc.nextInt();
			if(nros > auxMaior) {
				auxMaior = nros;
			}
			if(nros < auxMenor) {
				auxMenor = nros;
			}
		}
		
		System.out.println("O maior n�mero � " + auxMaior);
		System.out.println("O menor n�mero � " + auxMenor);
		sc.close();
		
	}

}
