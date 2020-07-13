public class Ejercicio_10_07_2020{

    public void arreglos(){
    	int[][] array1 = new int[5][5];

    	array1[0][0] = 1;
   
        //System.out.println(array1[0][0] = 1);

    	for(int i = 0; i < array1[0].length; i++){
    		//System.out.println(i);
    		if(i == 4){
    			//array1[0][i] = array1[0][i] *2;
    			System.out.println(array1[0][i]);
    			continue;
    		}
    		System.out.print(array1[0][i] + " ");
    		array1[0][i + 1] = array1[0][i] * 2;
    		//System.out.println(array1[0][i + 1]);
    	} 

        for(int i = 0; i<array1[0].length; i++){
            if(i == 4){
                System.out.println(array1[i][i]);
                continue;
            }

            System.out.println(array1[i][i]);
            array1[i + 1][i + 1] =  array1[i][i] + 4;
        }

    }
   /*   1  2  3   4   5
    1[1][2][4][8 ][16]
    2[ ][5][ ][  ][  ]
    3[ ][ ][9][  ][  ]
    4[ ][ ][ ][13][  ]
    5[ ][ ][ ][  ][17]*/
	public static void main(String args[]){
		Ejercicio_10_07_2020 arreglos = new Ejercicio_10_07_2020();
		arreglos.arreglos();
	}
	
}