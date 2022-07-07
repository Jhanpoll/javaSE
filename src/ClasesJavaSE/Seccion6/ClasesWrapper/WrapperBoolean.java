package ClasesJavaSE.Seccion6.ClasesWrapper;

public class WrapperBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean primitivoBoolean1= false;
		Boolean objetoPrimitivo1 = Boolean.valueOf(primitivoBoolean1); // seria falso
		Boolean objetoPrimivito2 = Boolean.valueOf("false");
		
		/*operaciones*/
		boolean operacion1 = primitivoBoolean1==objetoPrimitivo1;
		boolean operacion2 = primitivoBoolean1==objetoPrimivito2;
		
		/*resultados*/
		System.out.println(primitivoBoolean1);
		System.out.println(objetoPrimitivo1);
		System.out.println(objetoPrimivito2);
		System.out.println(operacion1); /*resultado TRUE porque compara 
										valores masno por objetos como la clases numericas*/
		System.out.println(operacion2);/*resultado TRUE porque compara 
										valores masno por objetos como la clases numericas*/

	}

}
