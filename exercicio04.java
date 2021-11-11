package br.com.generation.exercicios1111;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		double[][] matriz = new double[3][3];
		double soma = 0.0, somaD = 0.0;
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
			System.out.println("Digite o valor: " );
			matriz[l][c] = entrada.nextDouble();
			
			soma += matriz[l][c];
			if(l == c) {
				somaD = matriz[l][c];
			}
			}
		}
		
		for(int l = 0; l < 3; l++) {
			for(int c = 0; c < 3; c++) {
				
				System.out.print("\n" + matriz[l][c]);
			}
			System.out.println();
		}
		
		
		System.out.println("\nA soma dos valores é: " + soma);
		System.out.println("A soma da diagonal principal é: " + somaD);
		
		entrada.close();
	}
		
}
