/* Autor: Wanderson Pereira
 * Exerc�cios curso Java B�sico - Instrutora Loiane Groner
 * Crescimento da popula��o
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
		
		// Inserindo e validando dados da popula��o
		do {
			System.out.print("Popula��o A e Popula��o B - ");
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
		
		System.out.println("Popula��o A - " + popA);
		System.out.println("Popula��o B - " + popB);
		System.out.println("Anos - " + ano);
		sc.close();
	}

}
