/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop + condicional - Calculo média de aulos por turma
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qauntidade de turmas = ");
		int qtdTurmas = sc.nextInt();
		int somaAlunos = 0;
		
		System.out.println();
		System.out.println("Quantidade de alunso por turmas");
		
		for(int x = 0; x < qtdTurmas; x++) {
			System.out.print("Turma "+(x+1)+" - ");
			int qtdAlunos = sc.nextInt();
			
			// Assegura que o nr de alunos por turma não ultrapasse 40 alunos
			while(qtdAlunos > 40) {
				System.out.print("Quantidade excede, digite novamente - ");
				qtdAlunos = sc.nextInt();
			}
			somaAlunos += qtdAlunos;
		}
		
		int mediaAlunos = somaAlunos / qtdTurmas;
		System.out.println("Media alunos por turma - " + mediaAlunos);
		sc.close();
		
	}

}
