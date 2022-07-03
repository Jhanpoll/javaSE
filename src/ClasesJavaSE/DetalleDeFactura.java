package ClasesJavaSE;

import java.util.Scanner;

public class DetalleDeFactura {

	public static void main(String[] args) {
		String descripcion;
		double precio1;
		double precio2;
		double impuesto = 0.19;
		double sumaTotalBruto;
		double precioImpuesto;
		double precioTotalNeto;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("la descripcion es ");
		descripcion = sc.nextLine();
		System.out.println("precio 1 : ");
		precio1 = sc.nextDouble();
		System.out.println("precio 2 : ");
		precio2 = sc.nextDouble();
		sumaTotalBruto = precio1 + precio2;
		precioImpuesto = sumaTotalBruto * impuesto;
		precioTotalNeto = precioImpuesto + sumaTotalBruto;
		System.out.println("------------------------------------------------------");
		String mensaje = "la descripcion es : " + descripcion + "\nel total bruto es: "+
		sumaTotalBruto + "\ncon un impuesto de "+ precioImpuesto + "\ny el monto total "
				+ "neto es : " + precioTotalNeto;
		System.out.println(mensaje);
		sc.close();
	}
}
