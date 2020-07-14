public class Ejercicio8_arreglos {
  public static void main(String[] args) {
    int matriz[][] = new int[5][5];
    Ejercicio8_arreglos ej = new Ejercicio8_arreglos();
    matriz = ej.llenarArreglo(2, matriz);
    ej.leerArreglo(matriz);
  }

  public int[][] llenarArreglo(int primerValor, int[][] matriz){
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++){
          if (i == 0) {
            if (j == 0) {
              matriz[i][j] = primerValor;
            } else {
              matriz[i][j] = matriz[i][j-1] * 2;
            }
          }
          if (i == j && i > 0) {
            matriz[i][j] = matriz[i-1][j-1] + 4;
          }
      }
    }
    return matriz;
  }

  public void leerArreglo(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++){
        System.out.print("\t|  " + matriz[i][j]);
      }
      System.out.print("\t|\n");
    }
  }
}
