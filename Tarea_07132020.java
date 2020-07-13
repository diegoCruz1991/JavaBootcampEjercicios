public class Tarea_07132020 {

    /*[1][2][4][8][16] //arreglo[posicion + 1] = arreglo[posicion] * 2 - PRIMERA FILA
      [0][5][0][0][0]
      [0][0][9][0][0]
      [0][0][0][13][0]
      [0][0][0][0][17] //+4, PARA LA DIAGONAL ESQUINA SUPERIOR IZQUIERDA A ESQUINA INFERIOR DERECHA NUMERO_SIGUIENTE = NUMERO + 4

    /*NO SE PUEDE HACER
    - INICIALIZAR MANUALMENTE
       MATRIZ[0][0] = 1

    TIPS
    - USAR 2 FORS
    - USAR IFs PARA LAS CONDICIONES*/

    public static void main(String... args) {

        int[][] matriz = new int[6][6];

        for(int i = 0; i < matriz.length-1; i++) {
            System.out.println("-----------------------------");
            for(int j = 0; j < matriz.length-1; j++) {
                if(i == 0 && j==0) {
                    matriz[i][j] = 1;
                }
                if(i == 0){
                    matriz[i][j+1] = matriz[i][j] * 2;
                }
                if(i > 0) {
                    matriz[i][j+1] = matriz[i-1][j] + 4;
                }
                System.out.println(matriz[i][j]);
            }
        }
    }
}