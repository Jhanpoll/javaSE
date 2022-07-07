package ClasesJavaSE.Seccion6.ClasesWrapper;



public class EjemploDeMetodoGetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*la Clase String*/
		System.out.println("LA CLASE STRING");
		String texto ="welcome";
		Class class1 = texto.getClass();
		
		System.out.println(class1);
		System.out.println(class1.getSuperclass());
		
		for (java.lang.reflect.Method metodo : class1.getMethods()) {
			System.out.println(metodo.getName());
		}
		
		/*la clase Integer*/
		System.out.println("\nLA CLASE INTEGER");
		Integer numero = 1996;
		Class num1 = numero.getClass();
		System.out.println(num1);
		System.out.println(num1.getSuperclass());
		
		for (java.lang.reflect.Method metodo2 : num1.getMethods()) {
			System.out.println(metodo2.getName());
		}
	}

}
