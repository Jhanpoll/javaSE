package ClasesJavaSE;

import java.util.Scanner;

public class StringTestConcatenar {
	public static void main(String[] args) {
		
		String a = "a";
		String b = "b";
		String c = a;
		
		StringBuilder sb = new StringBuilder(a);
		System.out.println("ingrese un numero : " );
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		long inicio = System.currentTimeMillis();
		for (int i = 0; i < numero; i++) {
			c+=a+b+"\n";  // 2000 = 5ms
			//sb.append(b).append(a).append("\n"); // 2000 = 1ms
			//c= c.concat(a).concat(b).concat("\n"); //2000 = 5ms
		}
		long termina = System.currentTimeMillis();
		long resultado = termina-inicio;
		System.out.println("el resultado en milisegundos es: "+resultado);
		System.out.println(sb.toString());
		System.out.println(c);
		sc.close();
		System.out.println("close");
		
		
		String nombre = "roberto ";
		String apellido = "chero silva";
		StringBuilder sb2 = new StringBuilder();
		sb2.append(nombre).append(apellido);
		System.out.println(sb2);

	}
}
