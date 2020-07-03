package Example;

public class LogicaSumatoria {
	
	int [ ] arreglo2 = {2,4,8,8,16,32,100};
	
	int sumatoria = 0;
	
	public void Validacion(int... operation) {
		for(int i=0; i<arreglo2.length-1; i++) {
			if((arreglo2[i] * 2) == arreglo2[i+1]);
			sumatoria = sumatoria +1;
		}
		
		System.out.println("El valor total es:"+ " " + sumatoria);
	}
}
