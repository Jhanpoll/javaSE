package ClasesJavaSE;

import javax.swing.JOptionPane;

public class ConvirtiendoDeCadenaPrimitivo {
	public static void main(String[] args) {
		
		
		String cadenaEdad = JOptionPane.showInputDialog("ingrese edad de tipo string: ");
		int edad = Integer.parseInt(cadenaEdad);
		String mensaje = "la cadena edad parseada a entera es : " +edad;
		JOptionPane.showMessageDialog(null,mensaje);
		
		System.out.println("cadena Edad parseada a entera: "+ edad);
		String cadenaMoneda = "769.80";
		double moneda = Double.parseDouble(cadenaMoneda);
		System.out.println("cadena Moneda parseada a double es : "+ moneda);
		String cadenaLogica = "true";
		boolean logica = Boolean.parseBoolean(cadenaLogica);
		System.out.println("la cadena logica parseada a boolean es: "+logica);
		System.out.println("\nFINISH THE PROGRAM");
	}

}
