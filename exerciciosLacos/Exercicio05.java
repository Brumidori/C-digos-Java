package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		

	Scanner entrada = new Scanner(System.in);
	
	int numero, soma= 0;
	
	do {
		System.out.println("Digite um número: ");
		numero = entrada.nextInt();
		soma += numero;
	} while(numero != 0);
	
	System.out.println("A soma dos números digitados é: " + soma);
	entrada.close();
}

}

