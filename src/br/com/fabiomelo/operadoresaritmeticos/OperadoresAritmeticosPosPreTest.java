package br.com.fabiomelo.operadoresaritmeticos;

public class OperadoresAritmeticosPosPreTest {

	public static void main(String[] args) {

		// ++ (pos-incremento, pre-incremento), -- (pre-decremento, pos-decremento)

		int contador = 10;
//		System.out.println("Contador: " + contador++); // pos-incremento
//		System.out.println("Contador: " + contador); 

//		System.out.println("Contador: " + ++contador); // pre-incremento
		
		System.out.println("Contador: " + contador--); // pos-decremento
		System.out.println("Contador: " + contador);
		System.out.println("Contador: " + --contador); // pre-decremento

	}

}
