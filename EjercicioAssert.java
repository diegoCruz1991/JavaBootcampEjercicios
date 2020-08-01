import java.util.Scanner;

public class EjercicioAssert {
	
		public EjercicioAssert(String cadena){
			this.eliminarEspacios(cadena);
			this.cortarCadena(cadena);
			this.cadenaInversa(cadena);
			this.numeroVocales(cadena);
		}
		
		public String eliminarEspacios (String cadena) {
		assert eliminarEspacios (" ").equals("");
		return cadena.replace(" ", "");

		}
		
		public void cortarCadena (String cadena) {
			
			String cadenaLimpia = eliminarEspacios(cadena);
			int len = cadenaLimpia.length();  
		    int n = 2;  
		    int temp = 0; 
		    int chars = len/n;
		    
		    String[] equalStr = new String [n];  
		    
	 
		    for(int i = 0; i < len-1; i = i+chars) {  
		        String part = cadenaLimpia.substring(i, i+chars);
		        equalStr[temp] = part;  
		        temp++;  
		    }  
		    System.out.println("La Cadena Partida es: ");  
		    for(int i = 0; i < equalStr.length; i++) {  
		     System.out.println(equalStr[i]); 
		        }  
		   
		}

		public void cadenaInversa (String cadena) {
			String reverse = "";
			
			for(int i = cadena.length() - 1; i >= 0; i--)
			{
				reverse = reverse + cadena.charAt(i);
			}
			
			System.out.println("Reversed Cadena es:"+ reverse);
		}
		
		
		public int numeroVocales (String cadena) {
			int count = 0;
	        for (int i = 0; i < cadena.length(); i++)
	        {
	            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i'
	                    || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u')
	            {
	                count++;
	            }
	        }
	        System.out.print("Numero de Vocales en la cadena: " + count +"\n");
	        return count;
		}
		

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
    System.out.print("Ingrese una Cadena:\n");

    EjercicioAssert metodos = new EjercicioAssert(scanner.nextLine());

    
	}

}

