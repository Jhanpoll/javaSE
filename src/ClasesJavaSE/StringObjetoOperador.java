package ClasesJavaSE;


public class StringObjetoOperador {
	public static void main(String[] args) {
		
		String titulo = "hola \"mundo\"";
		System.out.println(titulo);
		
		String nombre1 = new String("jhanpoll");

		//diferencia de equals y == 
		// EL == compara si son el mismo objeto con el caso de literal vs operador new
		String nombre2 = "jhanpoll";
		System.out.println("son el mismo objeto: "+(nombre1 == nombre2));
		/* EL == cuando ambos objetos strings son literales, y el resultado es verdadero
		   porque el compilador ahorra crear muchos objetos que tienen el mismo valor*/
		String nombre3 = "jhanpoll";
		System.out.println("los objetos nombre 1 y nombre3 son iguales: "+ (nombre2==nombre3));
		
		// EL EQUALS compara si tienen el mismo valor
		System.out.println("tienen el mismo valor: "+nombre1.equals(nombre2));
		
		String nombre4 = "JHANPOLL";
		// aplicando el equalsIgnoreCase que lo que hace es que ignora si es Mayuscula o minuscula
		System.out.println("tiene el mismo valor : "+ nombre1.equalsIgnoreCase(nombre4));
	}

}
