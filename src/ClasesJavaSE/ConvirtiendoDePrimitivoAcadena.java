package ClasesJavaSE;

public class ConvirtiendoDePrimitivoAcadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroEntero = 26;
		System.out.println("el numero entero es : " + numeroEntero);
		
		//CONVIRTIENDO DE INT A STRING -> CON LA CLASE INTEGER
		String numeroString = Integer.toString(numeroEntero);
		System.out.println("el numero en string es : "+ numeroString);
		// CONVIRTIENDO DE INT A STRING -> CON LA CLASE STRING Y su metodo VALUE OF
		String numeroString2 = String.valueOf(numeroEntero);
		System.out.println("usando la clase String : " + numeroString2);
		//CONVIRTIENDO DE DOUBLE A STRING
		double numeroDouble = 123.456d;
		System.out.println("numero double: "+ numeroDouble);
		String numeroString3 = Double.toString(numeroDouble);
		System.out.println("resultado de double a string con la clase Double: "+ numeroString3);
		String numeroString4 = String.valueOf(numeroDouble);
		System.out.println("resultado de double a string con la clase String :"+ numeroString4);
 	}

}
