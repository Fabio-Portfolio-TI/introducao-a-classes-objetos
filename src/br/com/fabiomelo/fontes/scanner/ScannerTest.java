package br.com.fabiomelo.fontes.scanner;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Qual o seu nome?");
//		String nome = scanner.nextLine();
//		System.out.println("O meu nome �: " + nome);
//		System.out.println("Qual a soma do n�mero A + n�mero B?");
//		
//		System.out.println("Informe o valor do n�mero A: ");
//		int numeroA = scanner.nextInt();
//		System.out.println("O n�mero A �: " + numeroA);
//		
//		System.out.println("Informe o valor do n�mero B: ");
//		int numeroB = scanner.nextInt();
//		System.out.println("O n�mero B �: " + numeroB);
//		
//		int numeroC = numeroA +  numeroB;
//		System.out.println("A soma do n�mero A + n�mero B �: " + numeroC);
		
		System.out.println("Favor informar o valor de A: ");
		double valorA = scanner.nextDouble();
		
		System.out.println("Favor informar o valor de B: ");
		double valorB = scanner.nextDouble();
		
		System.out.println("Favor informar o valor de C: ");
		double valorC = scanner.nextDouble();
		
		double resultado = (valorC - valorB) / valorA;
		
		System.out.println("O resultado da soma dos 3 n�meros �: " + resultado);
		
		scanner.close();
	}
}
