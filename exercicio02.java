package br.com.generation.exercicios1111;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] lancamentos = new double[10];
		double soma = 0.0, media = 0.0, maior = 0.0, ocorrencias = 0.0;
		
		
		for(int i = 0; i < 9; i++) {
		System.out.println("Insira o " + (i + 1) + " � valor: ");
		lancamentos[i] = entrada.nextDouble();
		
		soma += lancamentos[i];
		media = soma / lancamentos.length;
		
		if(lancamentos[i] > maior) {
			maior += lancamentos[i];
						
		if(lancamentos[i] == maior) {
			ocorrencias++;
		}
		}
		
		
	}
		System.out.println("\nO maior valor �: " + maior + " e o n�mero de ocorr�ncias � de " + ocorrencias + " vezes.");
		System.out.println("\nA m�dia aritm�tica �: " + media);
		entrada.close();
	}
}
