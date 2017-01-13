package br.com.treinar.controle;

public class LoopControl {
	public static void main(String[] args) {
		int x = 10;

		inicio: while (true) {
			x = 10;
			while (x < 20) {
				// System.out.println("valor de x :" + (x -10));
				System.out.println(x);
				x++;
				if (x == 17) {
					break inicio;
				}
			}
		}

		// int i = 5 ;
		// while (i < 10) {
		// System.out.println(i++);

	}

}
