public class Ejercicio6{
	public static void main(String[] args){
		LocalizarEspacio objeto = new LocalizarEspacio();
		objeto.localizaEspacio();	
	}		
}

class LocalizarEspacio{
String cadena = "asf  asjhfñokak  easd     ";
char espacio = ' ';
	
	public void localizaEspacio(){
		String cadena1 = "";
		String cadena2 = ""; 
		int index = cadena.indexOf(espacio);
		int extension = cadena.length();
		while(cadena.indexOf(espacio)!=-1){
			cadena1 = cadena.substring(0, index);
			cadena2 = cadena.substring(index+1, extension);
			cadena = cadena1 + cadena2; 
			index = cadena.indexOf(espacio);
			extension = cadena.length();
		}
		System.out.println(cadena);		
	}
}