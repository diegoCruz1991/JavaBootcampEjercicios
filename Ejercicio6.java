
public class Ejercicio6 {
	
	String texto="H ola   ";
	char cadenaSnEspacio;
	
	public void quitarEspacios() {		
		for (int i=0; i<texto.length(); i++)
		{
		  if(texto.charAt(i) != ' ') {
			   cadenaSnEspacio = texto.charAt(i);
			   System.out.print(cadenaSnEspacio);
		  }
			  
		}
		
	}
	
	public void quitarEspacio() {
		System.out.println("\n"+texto.replace(" ", ""));
		
	}
	public static void main(String[] args) {
			
		Ejercicio6 ejercicio6 = new Ejercicio6();
		
		ejercicio6.quitarEspacios();
		ejercicio6.quitarEspacio();
		
	}

}
