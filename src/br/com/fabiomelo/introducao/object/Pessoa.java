package br.com.fabiomelo.introducao.object;

public class Pessoa extends Object{
	
	// Toda Classe herda Object
	
	private String nome;
	
	@Override
	public String toString() {
		return nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}

}
