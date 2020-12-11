/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - fatorial de um número
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Fatoria de ");
		int fat = sc.nextInt();
		int fatorial = 0;
		
		if(fat == 0 || fat == 1) {
			System.out.println(1);
		}
		else {
			for(int x = fat; x > 2; x--) {
				fat *= x - 1;
			}
		}
		
		System.out.println(fat);
		
		sc.close();
		
	}

}
