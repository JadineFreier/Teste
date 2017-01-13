package br.com.treinar.estudo.operador;

public class LogicalOperators {
	
	public static void main(String[] args) {
		
		boolean maiorDeIdade = true;
		boolean possuiIngresso = false;
		
		//e && - o segundo & evita que a segunda opção seja executada caso a primeira seja falsa
		boolean podeEntrar = maiorDeIdade && possuiIngresso;
		System.out.println(podeEntrar);
		
		//ou
		podeEntrar = maiorDeIdade || possuiIngresso;
		System.out.println(podeEntrar);
		
		//não pode entrar usa !
		podeEntrar = maiorDeIdade || possuiIngresso;
		System.out.println(!podeEntrar);
		
	}

}
