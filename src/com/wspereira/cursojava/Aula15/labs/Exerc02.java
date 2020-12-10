/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - entra com nome e senha, garantindo que a senha seja diferente do nome
 */


package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Nome ");
		String nome = sc.nextLine();
		System.out.print("Senha ");
		String senha = sc.nextLine();
		
		boolean validaSenha = false;
		
		do {
			if(nome.equalsIgnoreCase(senha)) {
				System.out.println("Senha invalida, digite novamente");
				senha = sc.nextLine();
			}
			else {
				validaSenha = true;
			}
		}while(!validaSenha);
		
		sc.close();

	}

}
