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
			System.out.println("Pode fazer empr�stimo.");
		} else {
			System.out.println("N�o pode fazer empr�stimo.");
		}
		
		String usuario = "fabio";
		String senha = "123456";
		
		if(usuario.equals("fabio1") && senha.equals("123456") || usuario.length() > 3) {
			System.out.println("Usu�rio logado...");
		}else {
			System.out.println("Usu�rio ou Senha inv�lidos...");			
		}
		
		String texto = "Jesus � a luz do mundo!!!";
		
		// Operador Tern�rio
		boolean textoMaiorQue5 = texto.length() > 20 ? true : false;
		System.out.println(textoMaiorQue5);

		String meuTime = "Corinthians";
		
		System.out.println("Corinthians " + ( (meuTime.equalsIgnoreCase("Corinthians")) ? "Tem Mundial!" :  "N�o tem Mundial!"));
		
		boolean podeAcessarSistema = true;
		boolean somenteParaFuncionario = true;
		
		if (!podeAcessarSistema && somenteParaFuncionario) {
			System.out.println("Voc� pode acessar os sistema!");
		} else {
			System.out.println("Voc� n�o pode acessar os sistema!");
		}
		
	}
}
