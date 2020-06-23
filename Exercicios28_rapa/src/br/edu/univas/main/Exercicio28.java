package br.edu.univas.main;

import java.util.Scanner;

public class Exercicio28 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		
		int[] numerosSort = new int [6];
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite os numeros apostados: ");
			numerosSort[i] = read.nextInt();
			
		}
		int[] numerosApost = new int [6];
		for (int i = 0; i < 6; i++) {
			numerosApost[i] = read.nextInt();
			
		}
		int contador = 0;
		
		for (int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if (numerosSort[i] == numerosApost[j]) {
					
					contador++;
					
				}
			}
		
		System.out.println(contador);
		}
		
		read.close();
	}

}
