package br.com.fabiomelo.operadoresaritmeticos;

public class OperadoresAritmeticosTest {

	public static void main(String[] args) {

		// +, -, *, /, %

		// ++, --

		int salario = 15000;

		int horaExtra = 1000;

		int salarioBruto = salario + horaExtra;

		System.out.println("Sal�rio Bruto: " + salarioBruto);

		int desconto = 500;

		// int salarioLiquido = salarioBruto - desconto;
		// System.out.println("Sal�rio Liquido: " + salarioLiquido);
		System.out.println("Sal�rio Liquido: " + (salarioBruto - desconto));

		int numeroA = 25;
		int numeroB = 50;

		int resultado = numeroA * numeroB;
		System.out.println("O resultado da multiplica��o �: " + resultado);
		
		int numero = 100;
		int restoDivisao = numero % 3;
		System.out.println(restoDivisao);
		
		String nome = "F�bio";
		String sobrenome = "Melo";
		System.out.println(nome + " " + sobrenome);

	}

}
