public class Contar{

	public static void main(String... args) {
	
	int cont;
	cont=numeroDePAlabras("esto es hola para saber donde esta hola hola", "hola");
	System.out.println("La cadena se repite: " + cont + " veces");

	
	} 

	public static int numeroDePAlabras(String cadena, String palabraaBuscar){ //Como es estatico se puede llamar sin declarar objetos

		int position=0; //para ver la posición en donde esta la palabra a buscar
		int contador=0; //Para contar las veces que se repite
		position=cadena.indexOf(palabraaBuscar); //utilizo indexOf nos devuelve la posición en la cadena si no existe la cadena devuelve -1

		while (position != -1){
			contador++;
			position=cadena.indexOf(palabraaBuscar,position+1); //IndexOf sobrecargado

		}
		return contador;
	}

	
}