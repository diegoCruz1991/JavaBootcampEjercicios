package com.qamindslab;

import java.util.Scanner;

public class Matriz {

		/*[1][2][4][8][16] //arreglo[posicion + 1] = arreglo[posicion] * 2 - PRIMERA FILA
		[][5][][][]
		[][][9][][]
		[][][][13][]
		[][][][][17] //+4, PARA LA DIAGONAL ESQUINA SUPERIOR IZQUIERDA A ESQUINA INFERIOR DERECHA NUMERO_SIGUIENTE = NUMERO + 4

		/*NO SE PUEDE HACER
		- INICIALIZAR MANUALMENTE
		   MATRIZ[0][0] = 1

		TIPS
		- USAR 2 FORS
		- USAR IFs PARA LAS CONDICIONES*/

    public static void main(String[] args) {

        // Se lee el tamaño de la matriz nXn

        System.out.println("Introduce el tamaño de la matriz");
        Scanner scanner = new Scanner(System.in);
        int tamano = scanner.nextInt();

        // Se declara la matriz del tamaño leído
        int[][] matriz = new int[tamano][tamano];

        // se inicializa la matriz con 0s
        for (int i=0; i<tamano; i++){
            for (int j=0; j<tamano; j++){
                matriz[i][j] = 0;
            }
        }

        // Se procesa la primera fila de la matriz
        for (int j=0; j<tamano; j++){
            if (j==0)
                matriz[0][j] = j+1;
            else
                matriz[0][j] = matriz[0][j-1]*2;
        }

        // Se procesa la diagonal de la matriz
        for (int i=0; i<tamano-1; i++){
            matriz[i+1][i+1] = matriz[i][i]+4;
        }

        // se imprime la matriz ya procesada
        System.out.println("Los elementos de la matriz");
        for (int i=0; i<tamano; i++){
            for (int j=0; j<tamano; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}

