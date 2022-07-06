package ClasesJavaSE.Seccion3.TipoString;

public class MetodosParaConvertirStringArreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Retroceder Nunca Rendirse Jamas.mp4";
		char[] charArray = frase.toCharArray();
		System.out.println(charArray);

		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}

	}

}
