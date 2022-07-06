package ClasesJavaSE.Seccion3.TipoString;

public class StringMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = "jesus jhanpoll chero arge";
		String curso = "    programacion";
		String trabalenguas = "trabalenguas";
		System.out.println(nombre.toUpperCase());
		System.out.println(nombre.charAt(0));
		System.out.println(nombre.charAt(1));
		System.out.println(nombre.equals("jesus"));
		System.out.println(nombre.length());
		System.out.println(nombre.substring(2));
		System.out.println(nombre.substring(2,4));
		System.out.println(nombre.substring(nombre.length()-1));
		
		System.out.println(curso);
		System.out.println(curso.trim());
		System.out.println(trabalenguas.replace("a", "A"));
		System.out.println(trabalenguas.endsWith("lenguas"));
		System.out.println(trabalenguas.startsWith("tra"));
		System.out.println(trabalenguas.indexOf("a"));
		System.out.println(trabalenguas.lastIndexOf("a"));
		
		

	}

}
