package ClasesJavaSE.Seccion2.Variables;

import java.util.InputMismatchException;
import java.util.Scanner;



public class SistemaNumericoConScanner {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("INGRESE UN NUMERO ENTERO: ");
		
		int numero=0 ;
		try {
			numero = sc.nextInt();
			System.out.println("");
			
		} catch (InputMismatchException e) {
			System.out.println("ERROR INGRESE POR FAVOR UN NUMERO DECIMAL");
			main(args);
			System.exit(0);
		}
		// PARSEO significa cambiar a Entero,Float,etc 
		String mensaje = "el numero en binario es :" + Integer.toBinaryString(numero)+"\n";
		mensaje += "el numero en octal es : " + Integer.toOctalString(numero)+"\n";
		mensaje += "el numero en hexadecimal es : "+Integer.toHexString(numero)+"n";
		System.out.println(mensaje);
		System.out.println("\nfinalizo Programa");
		sc.close();
	}
}
