/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - garantir que uma nota esteja entre 0 e 10
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota;
		boolean validaNota = false;
		
		do {
			System.out.print("Entre com um nota ");
			nota = sc.nextDouble();
			if(nota >= 0 && nota <=10.00) {
				System.out.println("Nota Valida");
				validaNota = true;
			}
			else {
				System.out.println("Nota invalida");
			}
		}while(!validaNota);
		
		sc.close();
		
	}

}
