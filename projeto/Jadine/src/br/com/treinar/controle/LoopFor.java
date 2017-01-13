package br.com.treinar.controle;

import java.util.Scanner;

public class LoopFor {

	public static void main(String args[]) {

//SCANER		
		Scanner leitor = new Scanner(System.in); // para pegar informação do
													// teclado
		
		System.out.print("Nome: ");
		String nome = leitor.nextLine();
		
		System.out.print("Quantidade: ");
		
		int quantidade = leitor.nextInt(); //nextInt - espera um numero inteiro
		leitor.close(); //para não ficar utilizando recurso desnecessário
		
		for (int i = 0; i < quantidade; i++) {
			System.out.println(i + 1 + "- " + nome);
			
			
		}
		
		

		for (int x = 10; x < 20; x++) { // o x vale 10, enquanto x <20,
										// incrementar 1. o x foi declarado
										// dentro do for, portanto só pode ser
										// usado no for
			System.out.print("value of x : " + x);
			System.out.print("\n");
		}

		for (int x = 1; x <= 10; x++) {
			System.out.println(x + "- Jadine");
		}
	}
}