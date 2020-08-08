public class Ciclos {


	public static void main(String... args) {
		Ciclos ciclo = new Ciclos();

		int[] a1 = {2,4,8,8,9,8,15};
		int[] a2 = {2,4,8,8,16,32,100};

		ciclo.repeatNum(a1);
		ciclo.MultNum(a2);
	}

	public void repeatNum(int[] array){
		int contador=0;
		for (int i=0; i< array.length; i++){
			if (array[i] == 8) {
				contador++;
			}
		}
		System.out.println("Number 8 appears: " + contador + " times");
	}

	public void MultNum(int[] array){
		int inicial=array[0]*2;
		int contador=0;
		for (int i=0; i< array.length; i++){
			if (array[i] == inicial){
				contador++;
				inicial = array[i]*2;
			}
		}
	System.out.println("This number mutiplies: " + contador + " times");	
	}
}

