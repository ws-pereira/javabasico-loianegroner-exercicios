/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Crescimento da população
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int ano = 0;
		double popA, popB, taxaA, taxaB;
		boolean valida = false;
		
		// Inserindo e validando dados da população
		do {
			System.out.print("População A e População B - ");
			popA = sc.nextDouble();
			popB = sc.nextDouble();
			
			if(popA > 0 && popB > 0) {
				valida = true;
			}
			else{
				System.out.println("Valores devem ser maiores que zero\n");
			}
		}while(!valida);
		
		valida = false;
		do {
			System.out.println("Taxa de crescimento de A e B");
			taxaA = sc.nextDouble();
			taxaB = sc.nextDouble();
			if(taxaA > 0 && taxaB > 0) {
				valida = true;
			}
			else {
				System.out.println("Valores da taxa incorreto");
			}
		}while(!valida);
		
		valida = false;
		while(popA < popB) {
			
			popA += popA * (taxaA / 100);
			popB += popB * (taxaB / 100);
			ano++;
			
		}
		
		System.out.println("População A - " + popA);
		System.out.println("População B - " + popB);
		System.out.println("Anos - " + ano);
		sc.close();
	}

}
