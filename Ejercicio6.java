public class Ejercicio6{
	
	public static void main(String... args){

		String cadena1 = "  P a r    an  g a r i   c u  t i  r i    m i    c u a r o  ";
		String cadena2;

		cadena2 = cadena1.replaceAll(" ", "");
		System.out.println(cadena2);
	}
}