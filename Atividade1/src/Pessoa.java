
public class Pessoa {

	 public static void main(String[] args) {
		 System.out.println("Esmaltes: ");
		Esmalte a = new Esmalte ();
		a.cor = "rosa = ";
		a.quantidade = 5;
		System.out.println(a.cor + a.quantidade);
		
		a.cor = "azul = ";
		a.quantidade = 0;
		System.out.println(a.cor + a.quantidade);
		
		a.cor = "preto = ";
		a.quantidade = 1;
		System.out.println(a.cor + a.quantidade);
		
		a.cor = "branco = ";
		a.quantidade = 0 ;
		System.out.print(a.cor + a.quantidade);
		
		if (a.quantidade == 0) {
			System.err.println(" - em falta");
		}
	}
}
