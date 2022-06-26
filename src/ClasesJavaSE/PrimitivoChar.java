package ClasesJavaSE;

public class PrimitivoChar {
	public static void main(String[] args) {

		
		/* con el tipo de dato CHAR */
		
		char caracterUnicode2 = '\u0040';
		char caracterNormal2 = '@';
		char caracterDecimal2 = 64;
		System.out.println("mostrando un caracter unicode : "+ caracterUnicode2);
		System.out.println("mostrando un caracter tal cual : "+ caracterNormal2);
		System.out.println("mostrando un caracter decimal : "+ caracterDecimal2);
		System.out.println(caracterUnicode2==caracterDecimal2);
		
		/* con el tipo de dato VAR */
		var caracterUnicode = '\u0040';
		var caracterNormal = '@';
		var caracterDecimal = 64;
		System.out.println("mostrando un caracter unicode : "+ caracterUnicode);
		System.out.println("mostrando un caracter tal cual : "+ caracterNormal);
		System.out.println("mostrando un caracter decimal : "+ caracterDecimal);
		System.out.println(caracterUnicode==caracterDecimal);
		
		System.out.println(Character.BYTES);
		
		
		/*tipo de caracteres especiales que permiten :
		 * tabular 
		 * espacio 
		 * salto de linea
		 * */
		
		char tabular = '\t';
		char saltoDeLinea = '\n';
		char retornoDeCarro = '\r';
		char retroceso = '\b';
		char espacio = ' ';
		System.out.println("\n\n");
		System.out.println("probando el tabular:" + tabular+"jesus" );
		System.out.println("probando el salto de linea:" + saltoDeLinea+"jhanpoll" );
		System.out.println("probando el retorno de carro:" + retornoDeCarro+"chero" );
		System.out.println("probando el retroceso:" + retroceso+"arge" );
		System.out.println("probando el espacio:" + espacio+"roberto" );
		
		
	}

}
