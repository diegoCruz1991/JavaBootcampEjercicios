public class Ejercicio6{

	String sout = "";
	public String Palabra_rec(String cadena){

		for(int i=0; i < cadena.length(); i++){
			if(!cadena.substring(i,i+1).equals(" ")){
				this.sout = this.sout + cadena.substring(i,i+1);

			}
		}

		return this.sout;

	}

	public static void main(String args[]){

		String a ="test ";
		//String sout;
		Ejercicio6 palabras = new Ejercicio6();

		System.out.println(palabras.Palabra_rec("    Ho la fnjfnre  fnrfu    "));
	}
}