package ClasesJavaSE.Seccion2.Variables;

public class ConversionentreTiposPrimitivos {
	
	public static void main(String[] args) {
		int numeroEntero = 123456;
		
		
		long numeroLong = numeroEntero;
		System.out.println("de int a long no hay que forzar casteo : "+ numeroLong);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		short numeroShort = (short)numeroEntero;
		System.out.println("de int a short si es necesario el forzar casteo: "+numeroShort);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
	}

}
