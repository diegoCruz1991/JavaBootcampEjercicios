
public class Ejercicio5 {
	
	int[] arreglo1 = {2,4,8,8,9,8,15};
	int[] arreglo2 = {2,4,8,8,16,32,10};
	
	int lengArreglo1 = arreglo1.length;
	int lengArreglo2 = arreglo2.length; 
	
    int contador = 0;
    int contador1 = 0;
    
    public void validaArreglo1 () {
    	for(int i=0; i<lengArreglo1; i++) {
        	if(arreglo1[i] == 8)
        	{
             contador ++;
        	}
       	
        }
        System.out.println("Cuantas veces se repite el numero 8: "+ contador +" veces");
    }
    
    public void validaArreglo2() {
    	for (int i=0; i<lengArreglo2-1; i++){
    	
    		if(arreglo2[i]* 2 == arreglo2[i+1]){
    		contador1 ++;	
    		}    			
    	}
    	System.out.println("Cuantas veces un numero se multiplica x2: "+ contador1 +" veces");
    }

	public static void main(String[] args) {
        
		Ejercicio5 validaArreglo = new Ejercicio5();
		validaArreglo.validaArreglo1();
		validaArreglo.validaArreglo2();
        
	}

}
