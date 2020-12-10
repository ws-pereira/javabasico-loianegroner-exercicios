/* Autor: Wanderson Pereira
 * Exercícios de fixação - Curso grátis Loiane Groner
 * Cálculo do tempo para download
 */

package com.wspereira.cursojava.Aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exec14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Entrada do tamanho do arquivo e velocidade
		System.out.print("Tamanho do arquivo ");
		double tamanhoArquivo = sc.nextDouble();
		System.out.print("Velocidade ");
		double velocidade = sc.nextDouble();
		
		// Calculo do tempo
		double tempo = (tamanhoArquivo / (velocidade / 8)) ;
		if(tempo > 60) {
			tempo /= 60;
		}
		
		System.out.println("Tempo estimado " + tempo);
		sc.close();

	}

}
