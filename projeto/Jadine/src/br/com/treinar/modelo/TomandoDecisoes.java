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
		if (num == 1) { // processa todas as opera��es
			System.out.println("um");
		} else if (num == 2) {
			System.out.println("dois");
		} else if (num == 3) {
			System.out.println("tr�s");
		} else if (num == 4) {
			System.out.println("quatro");
		} else if (num == 5) {
			System.out.println("cinco");
		} else {
			System.out.println("n�mero n�o encontrado");
		}

		switch (num) { // o switch s� processa a opera��o que contem o n�mero digitado, n�o serve para boolean
		case 1:
			System.out.println("um");
			break;
		case 2:
			System.out.println("dois");
			break;
		case 3:
			System.out.println("tr�s");
			break;
		case 4:
			System.out.println("quatro");
			break;
		case 5:
			System.out.println("cinco");
			break;

		default:
			System.out.println("n�mero n�o encontrado");
			break;
		}
	}
}
