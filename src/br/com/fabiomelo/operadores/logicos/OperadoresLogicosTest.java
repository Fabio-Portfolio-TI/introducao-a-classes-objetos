package br.com.fabiomelo.operadores.logicos;

public class OperadoresLogicosTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		double rendamensal = 3000;
		int idade = 30;
		boolean temEmprego = true;
		
//		1 ->  idade 			>= 18 e <= 35
//		2 ->  rendamensal >= 2000
//		3 ->  temEmprego >= true

		if (idade >= 18 && idade <= 35 && rendamensal >= 2000 && temEmprego) {
			System.out.println("Pode fazer empréstimo.");
		} else {
			System.out.println("Não pode fazer empréstimo.");

		}
		
	}

}
