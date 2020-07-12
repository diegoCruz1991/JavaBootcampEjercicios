public class Borrador{
	public static void main(String[] args){
		Obtener ob = new Obtener();
	 	//ob.obtenerEmpleado("Diego | Armando | Peluza | Maradona | valor ");

	 	Empleado empleado1 = ob.obtenerEmpleado("  Cristian | Alejandro |  Cruz | Charlie");
	 	System.out.println(empleado1);
	}
}

class Obtener{

	public static String borrarEspacios(String cadena) {
		return cadena.replace(" ", "");
	}

	//Diego|Alejandro|Cruz|Ramirez

	//Hay un bug, no esta guardando el segundo apellido
	public static Empleado obtenerEmpleado(String registro) { //Recibe un String que es el registro a procesar
		String cadenaLimpia = borrarEspacios(registro); //Limpiar la cadena de espacios

		String temporal = ""; // Cadena para ir almacenando cada uno de los nombres del registro
		int pipesContador = 0; //Contador para ir contando los pipes que aparecen en el registro
		Empleado empleado = new Empleado(); //Inicializo el objeto Empleado y se asigna a una variable de referencia llamada empleado 
		boolean encontrePipe = false; // Se agrego esta bandera para definir si se encontro un pipe o no
		for (int i = 0; i < cadenaLimpia.length(); i++) { //Se define un for para iterar sobre la cadena con un indice en una variable llamada i
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
								if ( empleado.segundoNombre == " ") {	
									temporal = "Sin segundo apellido";
								}
								break;
							case 3:
								empleado.primerApellido = temporal; 
								break;
								
							}
					temporal = "";// se resetea el valor de temporal
					encontrePipe = false;// se vuelve asignar a false para que no ejecute el switch si no es necesario
				}else{
						empleado.segundoApellido = temporal;
						System.out.println(temporal);
				}
				temporal += cadenaLimpia.charAt(i); // se concatena el caracter leido (que no es pipe) al temporal
			}
		}

		return empleado;
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


class Empleado {
	public String nombre;
	public String segundoNombre;
	public String primerApellido;
	public String segundoApellido;

	@Override
	public String toString() {
		return "Nombre Completo: " + this.nombre + " " + this.segundoNombre + " " + this.primerApellido + " " + this.segundoApellido;
	}

	/*
		empleado1:
			Nombre Completo: Diego Alejandro Cruz Ramirez
		empleado2 AKA otroEmpleado:
			Nombre Completo: Diego Alejandro Cruz Ramirez
	*/

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