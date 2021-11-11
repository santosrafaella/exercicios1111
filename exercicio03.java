package br.com.generation.exercicios1111;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[][] n1 = new int[2][3];
		int[][] n2 = new int[2][3];
		int[][] m1 = new int[2][3];
		int[][] m2 = new int[2][3];
		
		for(int l = 0; l < 2; l++) {
			for(int c = 0; c < 3; c++) {
			
				System.out.println("Digite os valoes de N1: ");
				n1[l][c] = entrada.nextInt();
				System.out.println("Digite os valores de N2: ");
				n2[l][c] = entrada.nextInt(); 
				
				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}
		
		for(int l = 0; l < 2; l++) {
		       for(int c = 0; c < 3; c++) {
		    	   System.out.print("\nMatriz M1: " + m1[l][c]);
		    	   System.out.println(" | Matriz M2: " + m2[l][c]);
			}
		       entrada.close();
		}
		

	}

}
