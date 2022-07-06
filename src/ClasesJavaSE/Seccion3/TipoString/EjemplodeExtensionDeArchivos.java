package ClasesJavaSE.Seccion3.TipoString;

import java.util.Scanner;

public class EjemplodeExtensionDeArchivos {
	public static void main(String[] args) {
		
		//String archivo ="imagen.jesus.pdf";
		System.out.print("ingrese el nombre del archivo con su extension: ");
		Scanner sc = new Scanner(System.in);
		String archivo = sc.nextLine();
		/*es mejor el lastIndexOf debido a que puede existir varios puntos 
		 * y lo que queremos es tomar el ultimo punto*/
		int ultimoPunto = archivo.lastIndexOf(".");
		System.out.println("la extension del archivo es: "+archivo.substring(ultimoPunto));
		sc.close();
	}
}
