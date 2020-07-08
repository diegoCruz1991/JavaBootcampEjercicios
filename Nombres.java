public class Nombres{

	public int atributo = 10;

	public static void main(String... args) {

	    Empleado empleado1 = obtenerEmpleado("  Carlos |  Vela | Soto ");

	    empleado1.segundoApellido = "Ramirez";

	    if (empleado1.segundoNombre == null) {
	    	System.out.println("Nombre: "+empleado1.nombre);
		    System.out.println("primerApellido: "+empleado1.primerApellido);
		    System.out.println("segundoApellido: "+empleado1.segundoApellido);
	    }else{
		    System.out.println("Nombre: "+empleado1.nombre);
		    System.out.println("segundoNombre: "+empleado1.segundoNombre);
		    System.out.println("primerApellido: "+empleado1.primerApellido);
		    System.out.println("segundoApellido: "+empleado1.segundoApellido);
		}
	}

	public static int numeroDePalabras(String cadena, String palabra) {   
		int cont = 0;    
		int index = 0;    
		index = cadena.indexOf(palabra); // 0   
		while (index >= 0) {  //Index = 0      
			cont++; // 1                   7     
			cadena = cadena.substring( index + palabra.length()  );   
			index = cadena.indexOf(palabra);    
		}   
		return cont;  
	}

	public static String borrarEspacios(String cadena) {
		return cadena.replace(" ", "");
	}

	public static int contarCaracteres(String texto, char caracter){
		int posicion, contador = 0;
		posicion = texto.indexOf(caracter);
		while(posicion != -1){
			contador++;
			posicion = texto.indexOf(caracter, posicion +1);
		}
		return contador;
	}

	public static Empleado obtenerEmpleado(String registro) { //Recibe un String que es el registro a procesar
		String cadenaLimpia = borrarEspacios(registro); //Limpiar la cadena de espacios

		String temporal = ""; // Cadena para ir almacenando cada uno de los nombres del registro
		int pipesContador = 0; //Contador para ir contando los pipes que aparecen en el registro
		Empleado empleado = new Empleado(); //Inicializo el objeto Empleado y se asigna a una variable de referencia llamada empleado 
		boolean encontrePipe = false; // Se agrego esta bandera para definir si se encontro un pipe o no
		for (int i = 0; i < cadenaLimpia.length(); i++) { //Se define un for para iterar sobre la cadena con un indice en una variable llamada i
			if (contarCaracteres(registro,'|') == 3) {
				if (cadenaLimpia.charAt(i) == '|') {  // Verifica si el caracter leido es un pipe
					pipesContador++; // Si lo es, aumenta el contador de pipes en 1
					encontrePipe = true; // y Pone en true la bandera de econtrePipe
					} else { // SE asigna el caracter que no es un pipe al string temporal
						if (encontrePipe) { // Verifica si se encontro un pipe SOLO en la iteracion anterior
							switch(pipesContador) { // Se procesa el contador de pipes y dependiendo del numero, se asigna a los diferentes atributos
								case 1:
									empleado.nombre = temporal; 
									break;
								case 2:
									empleado.segundoNombre = temporal; 
									break;
								case 3:
									empleado.primerApellido = temporal;
									break;
								case 4:
									empleado.segundoApellido = temporal;
									break;	
							}
							temporal = "";// se resetea el valor de temporal
							encontrePipe = false;// se vuelve asignar a false para que no ejecute el switch si no es necesario
						}
						temporal += cadenaLimpia.charAt(i); // se concatena el caracter leido (que no es pipe) al temporal
					}
				}else{
					if (cadenaLimpia.charAt(i) == '|') {  // Verifica si el caracter leido es un pipe
					pipesContador++; // Si lo es, aumenta el contador de pipes en 1
					encontrePipe = true; // y Pone en true la bandera de econtrePipe
					} else { // SE asigna el caracter que no es un pipe al string temporal
						if (encontrePipe) { // Verifica si se encontro un pipe SOLO en la iteracion anterior
							switch(pipesContador) { // Se procesa el contador de pipes y dependiendo del numero, se asigna a los diferentes atributos
								case 1:
									empleado.nombre = temporal; 
									break;
								case 2:
									empleado.primerApellido = temporal;
									break;
								case 3:
									empleado.segundoApellido = temporal;
									break;	
							}
							temporal = "";// se resetea el valor de temporal
							encontrePipe = false;// se vuelve asignar a false para que no ejecute el switch si no es necesario
						}
						temporal += cadenaLimpia.charAt(i); // se concatena el caracter leido (que no es pipe) al temporal
					}
				}
			
		}

		return empleado;
	}
	
}

class Empleado {
	public String nombre;
	public String segundoNombre;
	public String primerApellido;
	public String segundoApellido;

	@Override
	public String toString() {
		if (this.nombre == null) {
			this.nombre = this.segundoNombre;
			this.segundoNombre = this.primerApellido;
			this.primerApellido = segundoApellido;
			return "Nombre Completo: " + this.nombre + " " + this.primerApellido + " " + this.segundoApellido;
		}else{
			return "Nombre Completo: " + this.nombre + " " + this.segundoNombre + " " + this.primerApellido + " " + this.segundoApellido;
		}
	}

	@Override
	public boolean equals(Object anObject) {
		if (this == anObject) { // this es el objeto que llama el metodo, o sea si mismo, o sea basado en el ejemplo, empleado1
			return true;
		}
		if (anObject instanceof Empleado) {
			Empleado otroEmpleado = (Empleado)anObject;

			return this.toString().equals(otroEmpleado.toString()); //empleado1 se va a formatear con el metodo toString() para que sea como lo dice el metodo toString() de arriba
		}
		return false;
	}
}

//Tarea para el miercoles

/*
	- Solucionar el bug del metodo obtenerEmpleado, el bug es que no esta guardando el segundo apellido
	- Hacer que el metodo obtenerEmpleado pueda recibir registros con un solo nombre, el formato seria
		primerNombre- obligatorio
		segundoNombre - opcional
		primerApellido - obligatorio
		segundoApellido - obligatorio

		Diego Cruz Ramirez || Diego Alejandro Cruz Ramirez

*/