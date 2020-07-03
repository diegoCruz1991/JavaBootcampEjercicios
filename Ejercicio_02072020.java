public class Ejercicio_02072020{
	public static void main(String...args){
		Arreglos arreglo = new Arreglos();
		arreglo.vecesRepetida(8);
		arreglo.multiplicaRepetida();
    }

}

class Arreglos{
	int[] arreglo1 ={2,4,8,8,9,8,15};
	int[] arreglo2 ={2,4,8,8,16,32,100};
	int repeticionNumero=0;
	int repeticionMultiplica=0;
	
	public void vecesRepetida(int x){
		for (int index = 0; index < arreglo1.length; index++){
			if (x == arreglo1[index]){
				repeticionNumero++;
			}
		 
		}
		System.out.println("El numero de veces que se repite el numero " + x + " es : " + repeticionNumero);
	}
	public void multiplicaRepetida(){
		for (int index = 0; index < arreglo1.length - 1; index++){
			if ((arreglo2[index] * 2 ) == arreglo2[index + 1]){
				repeticionMultiplica++;
			}
		 
		}
		System.out.println("El numero de veces que la multiplicacion x2 es : " + repeticionMultiplica);
	}

}

