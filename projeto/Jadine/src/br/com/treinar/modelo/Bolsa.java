package br.com.treinar.modelo;

public class Bolsa {

	String cor;
	char tamanho;
	int quantidade;
	double valor;

	public void informar(String corE) {
		cor = corE;
	}

	public void informar(int quantidadeE) {
		quantidade = quantidadeE;
	}

	public double informar(char tamanho) {
		if (tamanho == 'P') {
			valor = 250.00;

		} else if (tamanho == 'M') {
			valor = 500;

		} else {
			valor = 750.00;
		}
		return valor;
	}

}
