/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - garantir que os dados inseridos estejam de acordo com
 * as condições estabelecidas.
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean valida = false;

		// Valida que o tamanho do nome seja igual ou superior a 3 caracteres
		do {
			System.out.print("Nome - ");
			String nome = sc.nextLine();
			if (nome.length() >= 3) {
				valida = true;
			} else {
				System.out.println();
				System.out.println("Nome com tamanho menor que 3 caracteres");
				System.out.println("Digite novamente ");
			}

		} while (!valida);

		// Valida entrada da idade - condição de 0 <= 150
		valida = false;
		do {
			System.out.print("Idade - ");
			int idade = sc.nextInt();

			if (idade >= 0 && idade <= 150) {
				valida = true;
			} else {
				System.out.println();
				System.out.println("Idade invalida. Deve estar entre 0 - 150\n");
				System.out.println("Digite novamente");
			}
		} while (!valida);

		// Valida salario maior que zero
		valida = false;
		do {
			System.out.print("Salário - R$ ");
			double salario = sc.nextDouble();

			if (salario > 0) {
				valida = true;
			} else {
				System.out.println();
				System.out.println("Salário invalid0. Deve estar acima de 0");
				System.out.println("Digite novamente");
			}
		} while (!valida);

		// Valida sexo Masculino e Feminino
		valida = false;
		do {
			System.out.print("Sexo - ");
			String sexo = sc.next();

			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("F")
					|| sexo.equalsIgnoreCase("M")) {
				valida = true;
			} else {
				System.out.println();
				System.out.println("Opção invalida. Deve ser M ou m ou F ou f ");
				System.out.println("Digite novamente");
			}

		} while (!valida);

		// Valida estado civil
		valida = false;
		do {
			System.out.print("Estado civil - ");
			String estadoCivil = sc.next();

			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v")
					|| estadoCivil.equalsIgnoreCase("d") 
					|| estadoCivil.equalsIgnoreCase("S")
					|| estadoCivil.equalsIgnoreCase("C")
					|| estadoCivil.equalsIgnoreCase("V")
					|| estadoCivil.equalsIgnoreCase("D")) {
				valida = true;
			} else {
				System.out.println();
				System.out.println("Opção invalida.");
				System.out.println("Digite novamente");
			}

		} while (!valida);
		sc.close();

	}

}
