package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio29 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"
				, "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
		float [] mes = new float [12];
		int i = 1;
		float soma = 0f;
	
		float media = 0f;
		do {
			System.out.println("Digite a temperatura:");
			mes[i] = read.nextFloat();
			
			media = soma + mes [i];
			
			i++;
	
		
		}while (i <= 12);
		
		for ( i = 0; i < 12; i++) {
			if (mes[i] > soma) {
				System.out.println(meses[i] + " - " + mes[i]);
			}
			
		}
		
		media = media/12;
		System.out.println("A média da temperatura anuel é: " + media);
		System.out.println("O flamengo se ferrou");
		read.close();
	}

}
