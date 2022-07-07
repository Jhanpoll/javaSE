package ClasesJavaSE.Seccion7.ValorVsReferencia;

public class PasarPorValor {

	public static void main(String[] args) {
		/*tanto como primitivo o como Objeto el valor permanece igual*/
		int numero = 1996;
		System.out.println("inicia en el metodo main numero = "+numero);
		test(numero);
		System.out.println("\ntermina metodo main con numero = "+numero);

	}
	
	public static void test(int numero) {
		System.out.println("\ninicia metodo test con numero = "+numero);
		numero= 2022;
		System.out.println("termina el metodo test con numero = "+numero);
	}

}
