/* Autor: Wanderson Pereira
 * Exercícios curso Java Básico - Instrutora Loiane Groner
 * Trabalhando com loop - Criar tabela de produtos de 1.99, com valor total em cima
 * 						  da quantidade de produtos desejados pelo cliente.
 */

package com.wspereira.cursojava.Aula15.labs;

import java.util.Locale;

public class Exerc23 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double valorProduto = 1.99;
		
		System.out.println("Produtos - Lojas Quase dois");
		
		for(int x = 1; x <= 50; x++) {
			
			System.out.println(x +" - "+(x * valorProduto));
		}

	}

}
