package br.com.treinar.modelo;

public class TomandoDecisoes {

	public static void main(String[] args) {
		boolean ehNoite = true;
		boolean estaChovendo = false;

		if (ehNoite && !estaChovendo) {
			System.out.println("Bom para dormir...");
		}

		else {
			System.out.println("Bom para ler...");
		}

		int num = 4;
		if (num == 1) { // processa todas as operações
			System.out.println("um");
		} else if (num == 2) {
			System.out.println("dois");
		} else if (num == 3) {
			System.out.println("três");
		} else if (num == 4) {
			System.out.println("quatro");
		} else if (num == 5) {
			System.out.println("cinco");
		} else {
			System.out.println("número não encontrado");
		}

		switch (num) { // o switch só processa a operação que contem o número digitado, não serve para boolean
		case 1:
			System.out.println("um");
			break;
		case 2:
			System.out.println("dois");
			break;
		case 3:
			System.out.println("três");
			break;
		case 4:
			System.out.println("quatro");
			break;
		case 5:
			System.out.println("cinco");
			break;

		default:
			System.out.println("número não encontrado");
			break;
		}
	}
}
