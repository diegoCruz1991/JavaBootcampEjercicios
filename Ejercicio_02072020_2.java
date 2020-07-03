public class Ejercicio_02072020_2 {
	int[] arreglo2 = {2, 4, 8, 8, 16, 32, 100};
	int cont = 0;

	public void ContNum(){
		for(int i = 0; i < arreglo2.length -1; i++){
			//System.out.println(i + " " + arreglo2[i + 1]);
			if(arreglo2[i] * 2 == arreglo2[i + 1]){
				cont = cont + 1;
			}
		}
		
		System.out.println("La regla de la multiplicaciòn se cumple " + cont + " veces");
	}

	public static void main(String args[]){
		Ejercicio_02072020_2 numeros = new Ejercicio_02072020_2();
		numeros.ContNum();
	}
}