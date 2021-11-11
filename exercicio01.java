package br.com.generation.exercicios1111;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] pontos = new double[5];
		double maior = 0.0;
		int i;
		
		for(i = 0; i <= 4; i++) {
		
		System.out.println("Digite o " + (i + 1) + "º valor: ");
		pontos[i] = entrada.nextDouble();
		
		if(pontos[i] > maior) {
			maior = pontos[i];
		}
		}
		System.out.println("\nO maior valor é: " + maior);
		entrada.close();
	}

}
