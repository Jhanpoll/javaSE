package ClasesJavaSE.Seccion6.ClasesWrapper;

public class AutoboxingInteger {

	public static void main(String[] args) {
		/*el objetivo es sumar el arreglo de numeros de pares*/
		Integer[] numeros = {Integer.valueOf(1),2,3,4,5,6,7,8,9,10};
		int suma = 0;
		for (Integer i : numeros) {
			if(i%2==0) {
				suma +=i;
			}
		}
		suma = 0;
		
		for (Integer i : numeros) {
			if(i.intValue()%2==0) {
				suma+=i.intValue();
			}
		}
		
		System.out.println("la suma del arreglo de enteros "
				+ "pares usando un foreach implicito es: "+suma);
		System.out.println("la suma del arreglo de enteros "
				+ "pares usando un foreach explicito es: "+suma);
	}

}
