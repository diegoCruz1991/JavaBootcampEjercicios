//trim a  todos los espacios

public class Ejercicio6 {
  public static void main(String[] args) {
    Ejercicio6 ej6 = new Ejercicio6();
    System.out.println(ej6.trimEspecial("  quitar  e   spa ci os   "));
  }

  public String trimEspecial(String s){
    return s.replace(" ","");
  }
}
