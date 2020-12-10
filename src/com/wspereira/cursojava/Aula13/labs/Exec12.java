/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Cálculos do peso, com entrada apenas da altura
 */

package com.wspereira.cursojava.Aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exec12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com sua altura ");
		double altura = sc.nextDouble();
		
		// Calculo usando a fórmula fornecido (72.7*altura) - 58
		
		double peso = (72.7 * altura) - 58;
		
		System.out.println("Peso ideal - " + peso);
		sc.close();
	}

}
