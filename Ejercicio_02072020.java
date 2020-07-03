public class Ejercicio_02072020 {

	public static void main(String... args) {

		int[] arreglo1 = {2, 4, 8, 8, 9, 8, 15};

		int x = 8;
		int total = 0;

		for(int i = 0; i < arreglo1.length; i++) {
			if(arreglo1[i] == x) {
				total += 1;
			}
		}
		System.out.println(total);


		int[] arreglo2 = {2, 4, 8, 8, 16, 32, 100};
		int inc = 0;

		for(int n = 0; n < arreglo2.length-1; n++) { 
				if(arreglo2[n] * 2 == arreglo2[n+1]) {
					inc += 1;
				}
		}
		System.out.println(inc);
	}

}


	//int[] arreglo2 = {2, 4, 8, 8, 16, 32, 100};