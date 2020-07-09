public class Strings_Ejercicio7 {
  public static void main(String[] args) {
    Empleado empleado1 = obtenerEmpleado("  Diego | Alejandro |  Cruz | Ramirez ");
    System.out.println(empleado1);
  }
  //Hay un bug, no esta guardando el segundo apellido
	public static Empleado obtenerEmpleado(String registro) { //Recibe un String que es el registro a procesar
    String cadenaLimpia = borrarEspacios(registro) + "|"; //Limpiar la cadena de espacios **aqui agrega un pipe al final
		String temporal = ""; // Cadena para ir almacenando cada uno de los nombres del registro
		int pipesContador = 0; //Contador para ir contando los pipes que aparecen en el registro
		Empleado empleado = new Empleado(); //Inicializo el objeto Empleado y se asigna a una variable de referencia llamada empleado
		for (int i = 0; i < cadenaLimpia.length(); i++) { //Se define un for para iterar sobre la cadena con un indice en una variable llamada i
			if (cadenaLimpia.charAt(i) == '|') {  // Verifica si el caracter leido es un pipe
				pipesContador++; // Si lo es, aumenta el contador de pipes en 1
        /*
         el bug es que cuando encuentra un pipe no hace nada mas que incrementar el contador pipes
         así que el switch se ejecuta o ejecutaría en el primer caracter *después* del pipe.
         en el caso del último, el for termina antes de entrar al switch por última vez.
         ademas de agregar el último pipe al guardar la cadenaLimpia
         la solución fue ejecutar aquí el switch y resetear temporal
         en el else acumular la cadena nueva
        */
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
			} else { // SE asigna el caracter que no es un pipe al string temporal
			     temporal += cadenaLimpia.charAt(i); // se concatena el caracter leido (que no es pipe) al temporal
			}
		}
    return empleado;
	}

  public static String borrarEspacios(String cadena) {
    return cadena.replace(" ", "");
  }
}

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
