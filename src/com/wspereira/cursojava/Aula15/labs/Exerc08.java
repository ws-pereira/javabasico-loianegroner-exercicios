/* Autor: Wanderson Pereira
 * Exerc�cios curso Java B�sico - Instrutora Loiane Groner
 * Trabalhando com loop - digitar 5 n�meros e apresentar a soma e m�dia deles
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nros, soma = 0;
		System.out.println("Digite 5 n�meros abaixo ");
		
		for(int x = 0; x < 5; x++) {
			nros = sc.nextInt();
			
			soma += nros;
		}
		double media = soma / 5;
		
		System.out.println("Soma dos n�meros  " + soma);
		System.out.println("M�dia dos n�meros " + media);
		sc.close();
		
	}

}
