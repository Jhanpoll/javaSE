package ClasesJavaSE.Seccion3.TipoString;


public class StringInmutabilidad {
	public static void main(String[] args) {
		
		String nombre = "jesus jhanpoll ";
		String apellido = new String("chero arge");
		String sb_concatenar=nombre;
		
		nombre.concat(apellido);
		/* al imprimir nombre solo traera mi nombre y no la concatenacion porque 
		cada objeto string mantiene su valor.*/
		System.out.println(nombre);
		// en este caso al reemplazar tengo que crear un nuevo objeto para que me muestre resultad
		String replace = nombre.replace("j", "J");
		System.out.println(replace);
		
		String upperCase = nombre.toUpperCase();
		System.out.println(upperCase);
		
		nombre += apellido;
		System.out.println(nombre);
		
		
	}

}
