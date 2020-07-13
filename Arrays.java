public class Arrays {

    public static void main(String... args) {

        int[][] arreglo = new int[5][5];

        arreglo[0][0] = 1;           //Le doy valor de 1
        arreglo[0][1] = arreglo[0][0]*2;  //Intento multiplicar el valor de la posicion por 2 para darle el nuevo valor
        arreglo[0][2] = arreglo[0][1]*2;  //Intento multiplicar el valor de la posicion por 2 para darle el nuevo valor
        arreglo[0][3] = arreglo[0][2]*2;  //Intento multiplicar el valor de la posicion por 2 para darle el nuevo valor
        arreglo[0][4] = arreglo[0][3]*2;  //Intento multiplicar el valor de la posicion por 2 para darle el nuevo valor
        arreglo[1][1] = arreglo[0][0]+4;  //Intento sumar el valor de la posicion mas 4 para darle el nuevo valor
        arreglo[2][2] = arreglo[1][1]+4;  //Intento sumar el valor de la posicion mas 4 para darle el nuevo valor
        arreglo[3][3] = arreglo[2][2]+4;  //Intento sumar el valor de la posicion mas 4 para darle el nuevo valor
        arreglo[4][4] = arreglo[3][3]+4;  //Intento sumar el valor de la posicion mas 4 para darle el nuevo valor
        System.out.println(arreglo);
    }
}

/*
              0    1    2    3    4
         0    1    2    4    8    16
         1    0    5    0    0    0
         2    0    0    9    0    0
         3    0    0    0    13   0
         4    0    0    0    0    17
 */