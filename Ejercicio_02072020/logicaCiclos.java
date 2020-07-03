package Example;

public class logicaCiclos {
	
	int [] arreglo1 = {2,4,6,8,8,9,8,15};
	
	int valor = 0;
	
	public void Incremento(int... operation) {
	
	for(int i = 0; i<arreglo1.length; i++) {
		if(arreglo1[i] == 8) {
			valor++;
		}
	}
	System.out.println("Se repite el 8:" + " " + valor);
		
	}
	
}
