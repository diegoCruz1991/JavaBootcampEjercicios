public class Ciclos{
  int[] arreglo1 = {2, 4, 8, 8, 9, 8, 15};
  int[] arreglo2 = {2, 4, 8, 8, 16, 32, 100};

  public static void main(String[] args) {
    Ciclos c = new Ciclos();
    c.numeroRepetido(8);
    c.numeroMultiplicado();
  }

  public void numeroRepetido(int numero){
    int veces = 0;
      for (int i : this.arreglo1){
        if (i == numero){
            veces++;
        }
      }
      System.out.println("El número " + numero + " se repite " + veces + " veces");
  }

  public void numeroMultiplicado() {
    int veces = 0;
      for (int i = 1; i < this.arreglo2.length - 1; i++){
        if (arreglo2[i] == (arreglo2[i-1] * 2)){
            veces++;
        }
      }
      System.out.println("La condición se cumple " + veces + " veces");
  }
}
