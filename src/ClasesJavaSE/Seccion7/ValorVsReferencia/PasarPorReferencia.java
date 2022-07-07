package ClasesJavaSE.Seccion7.ValorVsReferencia;
public class PasarPorReferencia {
	public static void main(String[] args) {
		/*el ejemplo va a ser con un arreglo de edades*/
		/*
		 * int[] edades = {10,20,30}; System.out.println(edades); for (int i : edades) {
		 * System.out.printf("edades [%s]\n",i); }
		 * System.out.println("llamando al metodo test"); test(edades);
		 * System.out.println("iniciando el metodo test"); for (int i : edades) {
		 * System.out.printf("edades [%s]\n",i); }
		 * System.out.println("terminando el metodo test");
		 */
		
		/*EJMPLO 2 : CON PERSONA*/
		Persona persona = new Persona();
		persona.modificarNombre("jesus");
		System.out.println(persona.getNombre());
		System.out.println("llamando al metodo personaTest...");
		personaTest(persona);
		
		System.out.println("terminando el metodo personaTest..");
		System.out.println(persona.getNombre());
	}
	
	/*
	 * public static void test(int[] edadesArreglo) {
	 * System.out.println("iniciando test de arreglos"); for (int i = 0; i <
	 * edadesArreglo.length; i++) { edadesArreglo[i] = edadesArreglo[i]+20; }
	 * System.out.println("terminando test de arreglos"); }
	 */
	
	public static void personaTest(Persona persona) {
		persona.modificarNombre("chero");
	}
	
	

}
