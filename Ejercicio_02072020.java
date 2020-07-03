public class Ejercicio_02072020{

	int[] arreglo1 = {2, 4, 8, 8, 9, 8, 15};

	int contOcho = 0;

	public void repeticiones(){
		for(int i=0; i < 7; i++){
			if(arreglo1[i] == 8) {
				contOcho = contOcho + 1;
			}
		}

		System.out.println(contOcho);
	}

	public static void main(String args[]){

		Ejercicio_02072020 numeros = new Ejercicio_02072020();
		//System.out.println("Test" + numeros.arreglo1[0]);

		numeros.repeticiones();


	}

}