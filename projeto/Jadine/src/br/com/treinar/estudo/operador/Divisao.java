package br.com.treinar.estudo.operador;

public class Divisao {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 8;
		int resultado = i/j;
		int resto = i%j;
		float g = 1.5f;
		
		System.out.println("10/8 = " + resultado + " resto = " + resto);
		
		float resultado2 = i/g;	
		
		System.out.println("10/1.5 = " + resultado2);
	
	}
}
