package br.com.fabiomelo.operadores.precedencia;

public class OperadoresPrecedenciaTest {

	public static void main(String[] args) {

		int a = 10;
		int b = 2;
		int c = 60;
		
		int resultado = a   + b *  c   / 2 + a++ -3 + 8 - --b;
//							   10 + 2 *  60 / 2 + 10    -3 +8  -   1 
//							   10 +   120   /  2 + 10    -3 +8  -   1
//							   10 +          60    + 10    -3 +8  -   1
//							                88                   -3       -   1
//											88 - 4 == 84
		
		System.out.println(resultado);
		
		a = 20;
		
		// Ele trás os valores operação anterior
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

		int resultado2 = (a = 7 + 3) + b *  c   / 2 + a++ -3 + 8 - --b;
		System.out.println(resultado2);

	}

}
