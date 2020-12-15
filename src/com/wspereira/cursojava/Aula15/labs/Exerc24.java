/* Autor: Wanderson Pereira
 * Exerc�cios curso Java B�sico - Instrutora Loiane Groner
 * Trabalhando com loop - apresentar o valor de 1 at� 50, a partir de um pre�o
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exerc24 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor do p�o R$ ");
		double valorPao = sc.nextDouble();
		
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
		for(int x = 1; x <= 50; x++ ) {
			double valor = valorPao * x;
			System.out.println(x+" - R$ " + String.format("%.2f", valor));
		}
		sc.close();
	}

}
