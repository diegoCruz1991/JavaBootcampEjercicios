public class Arreglo{
 public static void main(String[] args) {
  
  int conteo = 0;
  int[] arreglo1 = {2,4,8,8,9,8,15,8};

  for(int i = 0;i<arreglo1.length;i++){
   if(arreglo1[i] == 8){
    conteo++;
   }
   //System.out.println(arreglo1[i]); 
  }
  System.out.println("El número 8 se repite: " +conteo);

  int conteo2=0;
  int[] arreglo2 = {2,4,8,8,16,32,100};
  for(int i=0; i<arreglo2.length-1; i++) {
   if((arreglo2[i] * 2) == arreglo2[i+1]);
   conteo2++;
  }

  System.out.println("El número se multiplica x2 las veces: " + conteo2);
 }
 
}
