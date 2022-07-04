package ClasesJavaSE;

public class PrimitivoEnteros {
	public static void main(String[] args) {
		
		byte byteNumero = 127;
		//short shortNumero = 1234;
		int entero = 1234567890;
		System.out.println(byteNumero);

		/* TIPO DE DATO BYTE */
		System.out.println("tipo byte en byte es igual a : " + Byte.BYTES);
		System.out.println("tipo byte en bits es igual a : " + Byte.SIZE);
		System.out.println("tope max del byte en positivos  : " + Byte.MAX_VALUE);

		/* TIPO DE DATO : SHORT */
		System.out.println("el short en byte cuanto equivale: " + Short.BYTES);
		System.out.println("el short en bits cuanto equivale: " + Short.SIZE);
		System.out.println("tope max del byte en positivos: " + Short.MAX_VALUE);
		System.out.println("tope min del byte en negativos: " + Short.MIN_VALUE);
		System.out.println("que tipo es : " + Short.TYPE);
		System.out.println(entero);

		/* lo mismo se realiza con tipo long , */

		/*
		 * tipo de dato : var esta disponible apartir de java 10 en adelante es decir
		 * que si lo pruebo con el java 8 no va funcionar
		 */

		var numero = 1996L;
		System.out.println("con el java 11 ahora si funciona " + numero);

	}
}
