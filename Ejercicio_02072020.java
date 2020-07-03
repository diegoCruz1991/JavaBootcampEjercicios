public class Ejercicio_02072020{
	public static void main(String[] args) {
		Ejercicio_02072020 ciclo = new Ejercicio_02072020();

		int[] arreglo1 = {2,4,8,8,9,8,15};
		int[] arreglo2 = {2,4,8,8,16,32,100};

		ciclo.mismoNumero(arreglo1);
		ciclo.cuantoSeMultiplica(arreglo2);
	}

	public void mismoNumero(int[] arreglo){
		int contador=0;
		for (int i=0; i< arreglo.length; i++){
			if (arreglo[i] == 8) {
				contador++;
			}
		}
		System.out.println("El numero 8 se repite: " + contador + " veces");
	}

	public void cuantoSeMultiplica(int[] arreglo){
		int inicial=arreglo[0]*2;
		int contador=0;
		for (int i=0; i< arreglo.length; i++){
			if (arreglo[i] == inicial){
				contador++;
				inicial = arreglo[i]*2;
			}
		}
	System.out.println("El numero se multiplica: " + contador + " veces");	
	}
}