/*
	- Solucionar el bug del metodo obtenerEmpleado, el bug es que no esta guardando el segundo apellido
	- Hacer que el metodo obtenerEmpleado pueda recibir registros con un solo nombre, el formato seria
		primerNombre- obligatorio
		segundoNombre - opcional
		primerApellido - obligatorio
		segundoApellido - obligatorio

		Diego Cruz Ramirez || Diego Alejandro Cruz Ramirez

*/

public class Ejercicio7 {
  public static void main(String[] args) {
    Empleado empleado1 = obtenerEmpleado("  Diego | Alejandro |  Cruz | Ramirez ");
    System.out.println(empleado1);
    Empleado empleado2 = obtenerEmpleado("  Diego | Cruz | Ramirez ");
    System.out.println(empleado2);
  }

	public static Empleado obtenerEmpleado(String registro) { //Recibe un String que es el registro a procesar
    // vamos a asumir que lleva segundoNombre hasta determinar lo contrario
    boolean haySegundoNombre = true;
    //guardaremos los campos usando substrings en un arreglo de strings
    String[] campoEmpleado = new String[4];
    // usamos el pipeindex para crear los substrings
    int inicioCampo = 0;
	  String cadenaLimpia = borrarEspacios(registro) + "|"; //Limpiar la cadena de espacios
    //**aqui agrega un pipe al final
    // cuenta el número de pipes que tiene la cadena y guarda los substrigs en el arreglo
    int numPipes = 0;
    for (int i = 0; i < cadenaLimpia.length(); i++) {
      if (cadenaLimpia.charAt(i) == '|') {
        //corta la cadena desde el inicioCampo hasta el indice actual
        campoEmpleado[numPipes] = cadenaLimpia.substring(inicioCampo,i);
        // el inicioCampo será ahora el siguiente indice para ignorar el pipe
        inicioCampo = i+1;
        //se cuenta el pipe en el contador
        numPipes++;
      }
    }
    Empleado empleado = new Empleado();
    //guardo los substrigs de los apellidos en el objeto de acuerdo a los indices
    //el numero de pipes determina el indice de los apellidos
    empleado.segundoApellido = campoEmpleado[numPipes-1];
    empleado.primerApellido = campoEmpleado[numPipes-2];
    // si el número de pipes es 4 entonces el segundo nombre fue ingresado
    if (numPipes == 4) {
      empleado.segundoNombre = campoEmpleado[1];
    } else { // si no, está vacío
      empleado.segundoNombre = "\b"; //el backspace es para borrar el espacio en el toString
    }
    //el campo de nombre es siempre el primero del arreglo
    empleado.nombre = campoEmpleado[0];

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
