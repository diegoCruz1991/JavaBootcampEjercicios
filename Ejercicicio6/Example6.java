/**
	@Author: Eduardo Avila Carranza
	Created the day: 5/July/2020.
	Program: Eliminar espacios.
*/
public class Example6{


		  public static void main(String[] args) {
		  	EliminarEspacios example = new EliminarEspacios();
		    System.out.println(example.trimEspecial("  ELIMINAR  ESPA CI OS   "));

		}

		  public String trimEspecial(String S){
		    return S.replace(" ","");
	  }
}

