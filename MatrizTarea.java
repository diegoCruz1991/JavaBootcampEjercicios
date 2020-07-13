public class MatrizTarea{
   public static void main(String[] args) {
    int matriz [][] = new int[5][5];
    int aux = 1;
    int aux2 = 1;
    for (int i=0;i< matriz.length ;i++ ) {
     for (int j=0;j<matriz.length ;j++ ) {
      if (i==0) {
       matriz[i][j] = aux*2;
                   aux=aux*2;
                   System.out.print("\t"+matriz[i][j]);
      }else if (i == j) {
       matriz[i][j] = aux2 + 5;
       aux2=aux2+5;
                   System.out.print("\t"+matriz[i][j]);
      }else
       System.out.print("\t"+matriz[i][j]);
     }
     System.out.println();
    }
   }
}