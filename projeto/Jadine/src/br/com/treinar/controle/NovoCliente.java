package br.com.treinar.controle;

public class NovoCliente {

	public static void main(String[] args) {

		Cliente c = new Cliente();
		c.setNome("Gleidson"); // cliente está como privado então tem que usar
								// ser para atribuir nome a variavel e get para
								// pegar a variavel
		System.out.println(c.getNome());

	}

}