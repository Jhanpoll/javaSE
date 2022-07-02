package ClasesJavaSE;

import javax.swing.JOptionPane;

public class SistemaNumericoConJoptionPane {
	public static void main(String[] args) {
		
		
		/* APRENDI QUE LOS METODO  
		 * 
		 * JOptionPane.showInputDialog() RETORNA UN STRING
		 * Integer.toBinaryString() RETORNA UN STRING
		 * Y SE PARSEA PARA QUE PUEDA SEGUIR UTILIZANDO EL LAS CONVERSIONES
		 * */
		//String numeroString = JOptionPane.showInputDialog(null,"ingrese un numero entero");
		//int numero = 0;
		String numeroString = JOptionPane.showInputDialog(null,"ingrese un numero entero");
		//String numeroString = JOptionPane.showInputDialog(null,"ingrese un numero entero");
		int numero=0 ;
		try {
			 //numero = Integer.parseInt(numeroString);
			/*
			 * si lo dejo lo que quiere tratar de ejecutar en este bloque sale error
			 * PORQUE su scope quedaria solo en el try {} , por esa razon para solucionarlo
			 * tenemos que aumentar su scope y por eso tendria que estar fuera del try 
			 * las variables con su tipo de dato.
			 * */
			//
			//int numero = Integer.parseInt(numeroString);
			numero = Integer.parseInt(numeroString);
			
			
		} catch (NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "ERROR INGRESE POR FAVOR UN NUMERO DECIMAL");
			main(args);
			System.exit(0);
			
		}
		
		// PARSEO O PARA ENTENDERLO SI CAMBIA A ENTERO 
		
		
		
		//System.out.println("el numero entero es : "+numero);
		String mensaje = "el numero en binario es :" + Integer.toBinaryString(numero)+"\n";
		mensaje += "el numero en octal es : " + Integer.toOctalString(numero)+"\n";
		mensaje += "el numero en hexadecimal es : "+Integer.toHexString(numero)+"n";
		
		JOptionPane.showMessageDialog(null, mensaje);
		
		
		// RESULTADOS POR CONSOLA DE LOS SISTEMAS NUMERICOS 
		
		
		
		System.out.println("el numero en binario es :" + Integer.toBinaryString(numero)+"\n");
		//BINARIO
		// con el comienzo de 0b le estoy diciendo al compilador de java que es un binario
		int numeroBinario = 0b10000;
		
		System.out.println("confirmando si  0b10000 en binario a entero es :" + numeroBinario);
		
		
		// OCTAL
		System.out.println("el numero en octal es : "+ Integer.toOctalString(numero));
		// para decirle al compilador que es un numero octal tiene que ir primero el numero 0
		int numeroOctal =  020;
		
		System.out.println("confirmando si 020 en octal es 16 en entero : "+numeroOctal);
		
		// HEXADECIMAL
		
		System.out.println("el numero 16 en exadecimal es : "+ Integer.toHexString(numero));
		// PARA QUE EL COMPILADOR LO TOME COMO HEXADECIMAL TIENE QUE COMENZAR CON 0x
		int numeroHexadecimal = 0x10;
		System.out.println("confirmando si 0x10 en hexadecimal es 16 en entero : "+numeroHexadecimal);
	}

}
