class Ciclos{
	public static void main(String... args){
		int Numberlooked = 8;
		int count = 0;
		int[] arreglo1 = {2, 4, 8, 8, 9, 8, 15};
		for(int i=0; i<arreglo1.length; i++){
			if(Numberlooked==arreglo1[i]){
				count++;
			}
		}
		System.out.println(Numberlooked + " se repite: " + count);
		
		count=0;
		int[] arreglo2 = {2,4,8,8,16,32,100};
		int mult = arreglo2[0];
		for(int i=1; i<arreglo2.length; i++){
			if(mult*2==arreglo2[i]){
				count++;
			}
			mult=arreglo2[i];
		}
		System.out.println("Ocasiones en las que se encuentra el doble del numero : " + count);
	}
}