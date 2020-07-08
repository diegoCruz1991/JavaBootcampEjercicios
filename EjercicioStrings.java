public class EjercicioStrings {

	public static void main(String... args) {

	    Empleado empleado1 = obtenerEmpleado("  Diego | Alejandro |  Cruz | Ramirez ");

	    Empleado empleado2 = obtenerEmpleado("  Eder | Montano | Ramos ");

	    System.out.println(empleado1);

	    System.out.println(empleado2);	

	}


	public static String borrarEspacios(String cadena) {
		return cadena.replace(" ", "");
	}

	public static Empleado obtenerEmpleado(String registro) { //Recibe un String que es el registro a procesar
		String cadenaLimpia = borrarEspacios(registro); //Limpiar la cadena de espacios
		cadenaLimpia = cadenaLimpia + "|"; //Agregando un Pipe al final de la cadena
		int totalPipes = 0; //Guarda el total de Pipes en una cadena
		for (int i = 0; i < cadenaLimpia.length(); i++){ 
			if(cadenaLimpia.charAt(i) == '|'){
				totalPipes++;
			}
		}
		String temporal = ""; // Cadena para ir almacenando cada uno de los nombres del registro
		int pipesContador = 0; //Contador para ir contando los pipes que aparecen en el registro
		Empleado empleado = new Empleado(); //Inicializo el objeto Empleado y se asigna a una variable de referencia llamada empleado 
		for (int i = 0; i < cadenaLimpia.length(); i++) { //Se define un for para iterar sobre la cadena con un indice en una variable llamada i
			if (cadenaLimpia.charAt(i) == '|') {  // Verifica si el caracter leido es un pipe
				pipesContador++; // Si lo es, aumenta el contador de pipes en 1
				if(totalPipes==4){ // Si totalPipes es igual a 4 contiene dos nombres
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
				}else{ //Si no solo contiene 1 solo nombre
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
				}
				temporal = "";// se resetea el valor de temporal
			} else { // SE asigna el caracter que no es un pipe al string temporal
				temporal += cadenaLimpia.charAt(i); // se concatena el caracter leido (que no es pipe) al temporal
			}
		}

		return empleado;
	}
	
}

//Tarea para el miercoles

/*
	- Solucionar el bug del metodo obtenerEmpleado, el bug es que no esta guardando el segundo apellido 
		**SOLUCION: Cambie la logica del programa, pues anteriormente el guardado de la variable 
		no lo ejecutaba hasta que volvia a encontrar otro caracter diferente a pipe. Razon por la cual cambie el bloque switch a donde aumentaba el contador de Pipes. 
		Ademas borre la bandera encontrePipe**
	- Hacer que el metodo obtenerEmpleado pueda recibir registros con un solo nombre, el formato seria
		primerNombre- obligatorio
		segundoNombre - opcional
		primerApellido - obligatorio
		segundoApellido - obligatorio

		Diego Cruz Ramirez || Diego Alejandro Cruz Ramirez
		**SOLUCION: Cree una variable llamada totalPipes, y por medio de un ciclo FOR conte los pipes de la cadena despues de haber limpiado la cadena de espacios y haber agregado
			el pipe al final de la cadena. Despues antes de entrar al bloque switch coloque un IF para saber si teniamos tres o cuatro pipes y asi proceder al guardado de 
			variables. Para terminar modifique el metodo toString: para no imprimir el segundoNombre

*/


class Empleado {
	public String nombre;
	public String segundoNombre;
	public String primerApellido;
	public String segundoApellido;

	public String toString() {
		if(this.segundoNombre==null){
			return "Nombre Completo: " + this.nombre + " " + this.primerApellido + " " + this.segundoApellido;
		}
		return "Nombre Completo: " + this.nombre + " " + this.segundoNombre + " " + this.primerApellido + " " + this.segundoApellido;
	}
}