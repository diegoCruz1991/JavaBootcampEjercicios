public class Ejercicio6{
	
	public static void main(String...args){
		Ejercicio6 ejercicio6 = new Ejercicio6();
		ejercicio6.trimEspecial("   m  y tes de t ri     m   ");
	}
	
	public void trimEspecial(String palabra){
		String newPalabra = "";
		for(int indice = 0; indice < palabra.length(); indice++){		
			if (palabra.charAt(indice) != ' '){
				newPalabra+= palabra.charAt(indice);
				
			}
		}
		System.out.println("La palabra sin espacios es: " + newPalabra);
	}

}