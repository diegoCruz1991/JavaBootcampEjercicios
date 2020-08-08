public class Arreglito{
	public static void main(String... args){
		int [] [] matriz = new int [5] [5];

		for (int x = 0; x<5; x++){
			for (int y = 0; y<5; y++){
				if(x==0){
					if(y==0){
						matriz[x][y]=x+1;
					}
					else{
						matriz[x][y]=matriz[x][y-1]*2;
					}
				}
				if(x==1||x==2||x==3){
					if(y==0){
						matriz[x][y]=x+1;
					}
					else{
						matriz[x][y]=matriz[x][y-1]+3;
					}
				}
				if(x==4){
					if(y==0){
						matriz[x][y]=x+1;
					}
					else{
						matriz[x][y]=matriz[x-1][y-1]+4;
					}
				}
			}
		}
		
		for (int x = 0; x<5; x++){
			System.out.print("\n");
			for (int y = 0; y<5; y++){
				System.out.print(matriz[x][y] + "\t");			
		
			}	
		}		
	}
}


//Expected:

/*1 [1][2][4][8][16]
2 [][5][][][]
3 [][][9][][]
4 [][][][13][]
5 [][][][][17]*/


