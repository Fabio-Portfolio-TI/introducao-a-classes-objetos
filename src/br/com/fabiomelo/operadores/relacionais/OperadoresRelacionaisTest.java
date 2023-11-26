package br.com.fabiomelo.operadores.relacionais;

public class OperadoresRelacionaisTest {

	public static void main(String[] args) {

		// ==, !=, >, <, >=, <=
		
		int saldoBancario = 20000;
		int saque = 1000;
		
		boolean possoFazerSaque = saldoBancario > saque;		
		System.out.println("Variável posso fazer saque 20000 >  1000:  " + possoFazerSaque);
		
		saque = 30000;
		possoFazerSaque = saldoBancario > saque;
		System.out.println("Variável posso fazer saque 20000 >  30000: " + possoFazerSaque);
		
		saque = 20000;
		possoFazerSaque = saldoBancario == saque;
		System.out.println("Variável posso fazer saque 20000 == 20000: " + possoFazerSaque);
		
		saque = 1000;
		possoFazerSaque = saque <= saldoBancario;
		System.out.println("Variável posso fazer saque 1000  <= 20000: " + possoFazerSaque);
		
		int minhaIdade = 35;
		int minhaMae = 55;
		
		boolean idadeDiferente = minhaIdade == minhaMae;
		System.out.println(idadeDiferente);
		
		Pessoa obj = null;
		
		boolean objetoNulo = obj != null;
		System.out.println(objetoNulo);
		
	}

}
