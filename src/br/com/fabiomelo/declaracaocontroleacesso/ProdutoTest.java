package br.com.fabiomelo.declaracaocontroleacesso;

import java.math.BigDecimal;

public class ProdutoTest {

	public static void main(String[] args) {

		Produto produto = new Produto();

		produto.detalhesDoProduto = " "; // public
		produto.marca = " "; // default
		produto.valorDoProduto = BigDecimal.ONE; // protected

		produto.limparNomeDoProduto(); // protected
		produto.qualEhAMarca(); // default

		produto.preencherDadosDoProduto(); // public

	}

}
