/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - apresentar na telas nros ímpares de 1 a 50
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números diferentes");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		for(int x = n1; x <= n2; x++) {
			
			System.out.println(x);
		}
		sc.close();
		
	}

}
