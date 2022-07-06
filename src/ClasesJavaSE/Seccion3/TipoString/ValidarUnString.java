package ClasesJavaSE.Seccion3.TipoString;

public class ValidarUnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = null;
		String apellido = "chero";
		
		System.out.println("imprimiendo nombre : "+nombre);
		//System.out.println("concanternar nombre y apellido: "+nombre+apellido);
		boolean esNulo = true;
		boolean esVacio= true;
		
		if(!esNulo) {
			nombre = " ";
			System.out.println(nombre+apellido);
		}
		
		System.out.println(esNulo);
		System.out.println(esVacio);


	}

}
