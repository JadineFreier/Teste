package br.com.treinar.controle;

import javax.swing.JOptionPane;

public class LoopDoWhile {

	public static void main(String[] args) {
		int x = 10;
		String result = "";
		do {
			result += "value of x : " + x + "\n";
			x++;
			// System.out.println("\n");
		} while (x < 20);
		JOptionPane.showMessageDialog(null, result, "titulo alert", 1);
	}

}
