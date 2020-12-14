/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop+ condicional - média idades resultado apresentar turma jovem,
 * 									   adulta ou idosa
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int somaIdades = 0;
		
		
		System.out.println("Quantiadde de pessoas - ");
		int qtdPessoas = sc.nextInt();
		
		// Entrada das informações e soma das idades
		System.out.println("Entre com as idades abaixo");
		for(int x = 0; x< qtdPessoas; x++) {
			int idades = sc.nextInt();
			somaIdades += idades;
		}
		
		int mediaIdades = somaIdades / qtdPessoas;
		
		System.out.println("Media das idades - "+ mediaIdades);
		if(mediaIdades <26){
			System.out.println("Turma Jovem");
		}
		else if(mediaIdades > 25 || mediaIdades <= 60){
			System.out.println("Turma Adulta");
		}
		else {
			System.out.println("Turma Idosa");
		}
		sc.close();
		
	}

}
