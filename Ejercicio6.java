public class Ejercicio6{
	public static void main(String[] args) {
		String texto = " H ola   ";

		System.out.println(trimEspecial(texto));
	}

	public static String trimEspecial(String text){
		return text.replace(" ", "");
	}
}