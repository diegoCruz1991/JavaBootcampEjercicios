public class Ciclos{

	public static void main(String... args) {

		Ciclos ciclo1=new Ciclos();

		ciclo1.repetir(); //Llamada al método repetir

		ciclo1.multiplicar(); //Lamada al método múltiplicar

	}

	public void repetir (){ //cuantas veces se repite un número 

		int rep= 2;
		int cont=0;

		int[] arreglo1={2,4,8,8,9,8,15};

			for (int i=0; i<arreglo1.length; i++){

				if(arreglo1[i]==rep){
				cont++;
				} 
			}
			System.out.println(cont);

	}

	public void multiplicar () {

		int cont=0;

		int[] arreglo2={2,4,8,8,16,32,64,100};//Cuántas veces se multiplica un X2 y el siguiente es el resultado de multiplicar ese número

		int mult=arreglo2[0]*2; //La posición 0 la multiplica por 2 y lo asigna a una variable

			for (int i=0; i<arreglo2.length; i++){
					
				if((arreglo2[i]==mult)){ //La posició i se iguala con mult
					cont++; //Si son igual se aumenta el contador
					mult=arreglo2[i]*2; //y la variable mult ahora tiene el nuevo valor de la posición 1 *2
				}
			
			//System.out.println(mult);
			}

			System.out.println(cont);
	}
}