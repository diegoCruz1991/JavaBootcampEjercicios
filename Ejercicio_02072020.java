public class Ejercicio_02072020{
	
	public static void main(String[] args){
		Ejercicio_02072020 valor = new Ejercicio_02072020();
		valor.contador();
	}
	public void contador(){
		
		int[] arreglo1 = {2 , 4 , 8 , 8 , 9 , 8 , 15};
		
		int contador = 0;
		
		for (int a = 0; a < 7; a++) {
			if(arreglo1[a] == 8){
				contador++;
			}
		}
		System.out.println("El numero se repite  " + contador + " veces.");
	}
}