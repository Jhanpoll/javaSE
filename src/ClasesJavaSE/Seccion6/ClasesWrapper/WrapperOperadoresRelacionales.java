package ClasesJavaSE.Seccion6.ClasesWrapper;

public class WrapperOperadoresRelacionales {
	public static void main(String[] args) {
		 Integer num1 = 1000;
		 Integer num2 = num1;
		
		 
		 System.out.println(num1==num2);
		 
		 num2 = 1000;
		 System.out.println(num1==num2); // resultado falso porque compara objetos
		 System.out.println(num1.equals(num2)); //resultado verdadero porque compara valor del objeto
		 num2=2000;
		 System.out.println(num1.equals(num2)); // resultado falso porque num2 es mayor a num1
		 
		 System.out.println("\n\n");
		 
		 /*cuando tiene valor hasta 127 , java compara en automatico solo valores*/
		 Integer num3 = 127;
		 Integer num4 = num3;
		
		 
		 System.out.println(num3==num4);
		 
		 num4 = 127;
		 System.out.println(num3==num4); // resultado TRUE porque compara valores por la razon explicada al inicio.
		 System.out.println(num3.equals(num4)); //resultado verdadero porque compara valor del objeto
		 num4=128;
		 System.out.println(num3<num4); // resultado falso porque num4 es mayor a num1
	}

}
