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
		
		String usuario = "fabio";
		String senha = "123456";
		
		if(usuario.equals("fabio1") && senha.equals("123456") || usuario.length() > 3) {
			System.out.println("Usuário logado...");
		}else {
			System.out.println("Usuário ou Senha inválidos...");			
		}
		
		String texto = "Jesus é a luz do mundo!!!";
		
		// Operador Ternário
		boolean textoMaiorQue5 = texto.length() > 20 ? true : false;
		System.out.println(textoMaiorQue5);

		String meuTime = "Corinthians";
		
		System.out.println("Corinthians " + ( (meuTime.equalsIgnoreCase("Corinthians")) ? "Tem Mundial!" :  "Não tem Mundial!"));
		
		boolean podeAcessarSistema = true;
		boolean somenteParaFuncionario = true;
		
		if (!podeAcessarSistema && somenteParaFuncionario) {
			System.out.println("Você pode acessar os sistema!");
		} else {
			System.out.println("Você não pode acessar os sistema!");
		}
		
	}
}
