package br.com.fabiomelo.operadores.atribuicao;

public class OperadoresAtribuicaoTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		 // =, +=, -=, *=, /=, %=    --> Abreviados/Compostos
		
		int resultado = 10 + 20;
		
		System.out.println("O valor do resultado é " + resultado);
		
		int numeroA = 100;
//		numeroA = numeroA + 200;
		numeroA += 200;
		System.out.println("O valor do numeroA é " + numeroA);
		
		int numeroB = 500;
//		numeroB = numeroB - 250;
		numeroB -= 250;
		System.out.println("O valor do numeroB é " + numeroB);
		
		int numeroC = 500;
//		numeroC = numeroC * 100;
		numeroC *= 100;
		System.out.println("O valor do numeroC é " + numeroC);
		
		int numeroD = 1000;
//		numeroD = numeroD / 500;
		numeroD /= 500;
		System.out.println("O valor do numeroD é " + numeroD);
	}

}
