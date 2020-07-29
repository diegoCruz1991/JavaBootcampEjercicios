public class Arreglos {

	public static void main(String... args) {
		//Un arreglo es un grupo de elementos ordenados en posicion, que son del mismo tipo

		int[] miArreglo = new int[10];

		miArreglo[5] = 250; //Para asignar un valor a una posicion del arreglo

		System.out.println(miArreglo[5]); //Para obtener un valor del arreglo

		int[] arreglo2 = new int[miArreglo.length];

		System.out.println(arreglo2[9]);

		System.out.println("FOR");
		for (int index = 0; index < miArreglo.length; index++) {
			System.out.println(miArreglo[index]);
		}

		System.out.println("FOR MEJORADO");
		for (int elemento : miArreglo) {
			System.out.println(elemento);
		}

		System.out.println("WHILE");
		int index = 0;
		while (index < miArreglo.length) {
			System.out.println(miArreglo[index]);
			index++;
		}

		System.out.println("DO WHILE"); //NUNCA USAR UN DO WHILE PARA ITERAR ARREGLOS
		index = 0;
		do {
			System.out.println(miArreglo[index]);
			index++;
		} while(index < miArreglo.length);


		System.out.println("------ARREGLOS DE ARREGLOS------");

		/*4x6
		3,4

		0[ [0][1][2][3] ]1[ [0][1][2] ]2[ [] ]3[ [0][1] ] //Arreglo de arreglos

		  0  1  2  3  4  5	
		0[1][2][3][4][5][6] //Tables, y esto NO EXISTE EN JAVA
		1[7][8][9][0][1][2]
		2[3][4][5][6][7][8]
		3[9][0][1][2][3][4]*/

		//[null][null][null][null][][][][][][]

		//[ [][][][][] ][][][][]


		int[][] matriz = new int[5][];

		matriz[0] = new int[5];
		matriz[1] = new int[10];
		matriz[2] = new int[3]; //2,2 == 0
		matriz[3] = new int[12];
		matriz[4] = new int[8];

		matriz[2][2] = 1000;

		for (int index1 = 0; index1 < matriz[0].length; index1++) {
			matriz[0][index1] = index1 + 10;
		}

		for (int index1 = 0; index1 < matriz[1].length; index1++) {
			matriz[1][index1] = index1 + 20;
		}

		for (int index1 = 0; index1 < matriz[2].length; index1++) {
			matriz[2][index1] = index1 + 30;
		}

		for (int principal = 0; principal < matriz.length; principal++) { //principal = 1
			for (int secundario = 0; secundario < matriz[principal].length; secundario++) { // principal = 1, secundario = 0,1,2,3,4
				System.out.println(matriz[principal][secundario]);
			}
		}


		/*[1][2][4][8][16] //arreglo[posicion + 1] = arreglo[posicion] * 2 - PRIMERA FILA
		[][5][][][]
		[][][9][][]
		[][][][13][]
		[][][][][17] //+4, PARA LA DIAGONAL ESQUINA SUPERIOR IZQUIERDA A ESQUINA INFERIOR DERECHA NUMERO_SIGUIENTE = NUMERO + 4

		/*NO SE PUEDE HACER
		- INICIALIZAR MANUALMENTE
		   MATRIZ[0][0] = 1

		TIPS
		- USAR 2 FORS
		- USAR IFs PARA LAS CONDICIONES*/
	}
}