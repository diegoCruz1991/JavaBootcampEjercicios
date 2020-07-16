public class Strings {
	
/*
	- Solucionar el bug del metodo obtenerEmpleado, el bug es que no esta guardando el segundo apellido
	- Hacer que el metodo obtenerEmpleado pueda recibir registros con un solo nombre, el formato seria
		primerNombre- obligatorio
		segundoNombre - opcional
		primerApellido - obligatorio
		segundoApellido - obligatorio

		Diego Cruz Ramirez || Diego Alejandro Cruz Ramirez
*/

	public static void main(String... args) {

		Empleado empleado1 = obtenerEmpleado("  Diego |   Alejandro |     Cruz |    Ramirez ");

		System.out.println(empleado1);
		
		Empleado empleado2 = obtenerEmpleado("  Diego |   |     Cruz |    Ramirez ");

		System.out.println(empleado2);
	}

	// borra espacios de una cadena de caracteres
	public static String borrarEspacios(String cadena) {
		return cadena.replace(" ", "");
	}

	//Obtiene el nombre del empleado en formato completo
	public static Empleado obtenerEmpleado(String registro) {
		String cadenaLimpia = borrarEspacios(registro);
		cadenaLimpia = cadenaLimpia+"|";
		Empleado empleado = new Empleado();
		String temporal="";
		int pipesContador = 1;
		int i=0;
		while (pipesContador <= 4) {
			switch(pipesContador) {
			case 1:
				empleado.nombre = "";
				while (cadenaLimpia.charAt(i) != '|') {
					empleado.nombre += cadenaLimpia.charAt(i);
					++i;
				}
				if (cadenaLimpia.charAt(i) == '|' && cadenaLimpia.charAt(i+1) == '|')
					{pipesContador++; ++i; ++i;}
				else
					{++i;
					empleado.segundoNombre="";}
				break;
			case 2:
				while (cadenaLimpia.charAt(i) != '|') {
					empleado.segundoNombre += cadenaLimpia.charAt(i);
					++i;
				}
				++i;
				break;
			case 3:
				empleado.primerApellido="";
				while (cadenaLimpia.charAt(i) != '|') {
					empleado.primerApellido += cadenaLimpia.charAt(i);
					++i;
				}
				++i;
				break;
			case 4:
				empleado.segundoApellido="";
				while (cadenaLimpia.charAt(i) != '|') {
					empleado.segundoApellido += cadenaLimpia.charAt(i);
					++i;
				}
				break;	
			}
			pipesContador++;
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
		if (this.segundoNombre == null)
			return "Nombre Sencillo: " + this.nombre + " " + this.primerApellido + " " + this.segundoApellido;
		else
			return "Nombre Completo: " + this.nombre + " " + this.segundoNombre + " " + this.primerApellido + " " + this.segundoApellido;
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