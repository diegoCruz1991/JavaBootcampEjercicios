public class TablaAnidada{

	public static void main(String[] args) {
		TablaAnidada tabla = new TablaAnidada();
		tabla.crearTabla();
	}

	public void crearTabla(){
		int[][] array1 = new int[5][5];
		for (int row=0; row<array1.length; row++){
			for (int col=0; col<array1[row].length; col++){
				if (row == 0 && col == 0){
					array1[row][col] = 1;
				}
				if (row == 0 && col > 0){
					array1[row][col] = array1[row][col-1] *2;
				}
				if (row == col && row > 0 && col > 0){
					array1[row][col] = array1[row-1][col-1] +4;	
				}
				System.out.print(array1[row][col] + " ");
			}
			System.out.println("");
		}
	}
}