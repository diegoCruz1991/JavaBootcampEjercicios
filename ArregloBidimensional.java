public class ArregloBidimensional{
	public static void main(String...args){
		int[][] matriz = new int[5][5];
		int contador = 1;
		int contador2 = 1;
		for (int i=0; i < matriz.length; i++){			
			for(int j=0; j< matriz[i].length; j++){
				if (i ==0){
					matriz[i][j] = contador;
				}else if (i == j){
					contador2 +=4;
					matriz[i][j] = contador2;
				}else{
					matriz[i][j] = 0;
				}
				contador *= 2;

			}
		}
		
		for (int i=0; i < matriz.length; i++){			
			for(int j=0; j< matriz[i].length; j++){
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println("");
		}
	
	}
}