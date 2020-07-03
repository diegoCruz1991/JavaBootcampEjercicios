public class Ejercicio_02072020{

	public int repeticiones(int[] arreglo, int numeroBuscado){
		
		int resultado = 0;
		
		for(int i=0; i<arreglo.length; i++){
			if (arreglo[i] == numeroBuscado)
				++resultado;
		}
		return resultado;
	}
	
	
	public int duplicados(int[] arreglo){
		
		int resultado = 0;
		
		for(int i=0; i<arreglo.length-1; i++){
			if ((arreglo[i] * 2) == arreglo[i+1])
				++resultado;
		}
		return resultado;
	}

	public static void main(String[] args){
			
		int[] arreglo1 = {2,4,8,8,9,8,15};

		int[] arreglo2 = {2,4,8,8,16,32,100};
	
		Ejercicio_02072020 arr1 = new Ejercicio_02072020();
		
		System.out.println("El numero 8 se repite "+arr1.repeticiones(arreglo1, 8)+" veces.");
		
		System.out.println(arr1.duplicados(arreglo2)+" veces, un numero se duplica en su numero inmediato siguiente.");
	}
}