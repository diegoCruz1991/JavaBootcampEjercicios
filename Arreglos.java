public class Arreglos{
	public static void main(String... args){
		int [] [] matriz = new int [5] [5];
		for (int row = 0; row<5; row++){
			for (int column = 0; column<5; column++){
				if(row==0){
					if(column==0){
						matriz[row][column]=row+1;
					}
					else{
						matriz[row][column]=matriz[row][column-1]*2;
					}
				}
				if(row==1||row==2||row==3){
					if(column==0){
						matriz[row][column]=row+1;
					}
					else{
						matriz[row][column]=matriz[row][column-1]+3;
					}
				}
				if(row==4){
					if(column==0){
						matriz[row][column]=row+1;
					}
					else{
						matriz[row][column]=matriz[row-1][column-1]+4;
					}
				}
			}
		}
		
		for (int row = 0; row<5; row++){
			System.out.print("\n");
			for (int column = 0; column<5; column++){
				System.out.print(matriz[row][column] + "\t");			
		
			}	
		}		
	}
}


