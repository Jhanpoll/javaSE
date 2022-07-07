package ClasesJavaSE.Seccion6.ClasesWrapper;

public class WrapperInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// la linea 9 esta obseleto apartir de java 7
		//CLASE INTEGER
		//Integer integer = new Integer(1234);
		int maxValue = Integer.MAX_VALUE;
		System.out.println("maxValue de entero es: "+ maxValue);
		/*UTILIZANDO METODOS */
		// linea 12: declarando y asignado valor de manera explicita
		Integer objetoInteger = Integer.valueOf(32767); Integer objetoInteger2 = 1234; // de manera implicita
		int num1 = objetoInteger.intValue(); //convirtiendo de objeto integer a tipo primitivo int de forma explicita
		int num2 = objetoInteger;//convirtiendo de objeto integer a tipo primitivo int de forma implicita
		String objetoString = Integer.toString(objetoInteger); //convirtiendo de objeto integer a tipo string 
		long long1 = objetoInteger.longValue();
		long long2 = objetoInteger2;
		float float1 = objetoInteger.floatValue();
		float float2 = objetoInteger;
		double double1 = objetoInteger.doubleValue();
		short short1 = objetoInteger.shortValue();
		
		System.out.println("el num1 es : "+num1);
		System.out.println("el num2 es: "+num2);
		System.out.println("objetoString en string es: "+objetoString);
		System.out.println("long1 es : "+long1);
		System.out.println("long2 es: "+long2);
		System.out.println("floa1 es: "+ float1);
		System.out.println("double1 es: "+double1);
		System.out.println("short1 es: "+short1);
		System.out.println("\n\n");
		
		/* CLASE String*/
		String objetoString2 = "1996"; /*si coloco un nombre como "jhanpoll"  
											me va devolver error porque justamente es un nombre ,
											 y si yo quiero convertirlo a entero va ser imposible
											 porque es un nombre , pero si fuera un numero lo que
											 tiene como valor va a convertirlo a entero
		 										*/
		Integer valueOf =Integer.valueOf(objetoString2);
		System.out.println("el valueof es : "+valueOf);
		
	
		
	
		

	}

}
