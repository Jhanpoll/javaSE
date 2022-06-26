package ClasesJavaSE;

public class PrimitivoFloatAndDouble {
	
	// si declaro una variable primitiva por defecto tiene asignado 0
	static float varFlotante;
	static int varInt;
	
	public static void main(String[] args) {
		
		float realFloatPositivo = 112e3f;
		float realFloatNegativo= 112e-3f;
		System.out.println("con esta notacion cientifica\n"
				+ " lo que esta haciendo es\n "
				+ "112 x 10 eleveado a la 3\n "
				+ "y la coma se mueve a la derecha:\n\n "+
				realFloatPositivo);
		
		System.out.println("\n\ncon esta notacion cientifica\n"
				+ " lo que esta haciendo es\n "
				+ "112 x 10 eleveado a la 3\n "
				+ "y la coma se mueve a la izquierda:\n\n "+
				realFloatNegativo);
		
		System.out.println("el float en byte es : "+Float.BYTES);
		System.out.println("el float en tamaño en bits es es : "+Float.SIZE);
		System.out.println("el float en su tope es es es : "+Float.MAX_VALUE);
		
		/* tipo primitvo DOUBLE
		 * 
		 */
		// en double si se quiere saber se le ponde la D o d al final.
		double numeroDouble = 19.96d;
		System.out.println("el double es :" + numeroDouble);
		
		
		
		System.out.println("el valor por defecto de una variable FLOAT fuera de main: "+
		varFlotante);
		System.out.println("el valor por defecto de una variable INT fuera de main: "+
		varInt);
	}

}
