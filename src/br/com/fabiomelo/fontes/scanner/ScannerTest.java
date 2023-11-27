package br.com.fabiomelo.fontes.scanner;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Qual o seu nome?");
//		String nome = scanner.nextLine();
//		System.out.println("O meu nome é: " + nome);
//		System.out.println("Qual a soma do número A + número B?");
//		
//		System.out.println("Informe o valor do número A: ");
//		int numeroA = scanner.nextInt();
//		System.out.println("O número A é: " + numeroA);
//		
//		System.out.println("Informe o valor do número B: ");
//		int numeroB = scanner.nextInt();
//		System.out.println("O número B é: " + numeroB);
//		
//		int numeroC = numeroA +  numeroB;
//		System.out.println("A soma do número A + número B é: " + numeroC);
		
		System.out.println("Favor informar o valor de A: ");
		double valorA = scanner.nextDouble();
		
		System.out.println("Favor informar o valor de B: ");
		double valorB = scanner.nextDouble();
		
		System.out.println("Favor informar o valor de C: ");
		double valorC = scanner.nextDouble();
		
		double resultado = (valorC - valorB) / valorA;
		
		System.out.println("O resultado da soma dos 3 números é: " + resultado);
		
		scanner.close();
	}
}
