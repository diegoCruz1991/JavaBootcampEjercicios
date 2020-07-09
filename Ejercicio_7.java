public class Ejercicio_7 {

	public static void main(String args[]){

		Ejercicio_7 cad_Empleado = new Ejercicio_7();

		//System.out.println("test" + cad_Empleado.empleado1);

		//System.out.println(cad_Empleado.borrarEspacios("nvnvfunvuev   rv fe v  v e jfv    "));

		//System.out.println(cad_Empleado.borrarEspacios(cad_Empleado.empleado1).length());

		System.out.println(cad_Empleado.obtenerEmpleado(cad_Empleado.empleado1));

		System.out.println(cad_Empleado.nombre);
		System.out.println(cad_Empleado.segundoNombre);
		System.out.println(cad_Empleado.primerApellido);
		System.out.println(cad_Empleado.segundoApellido);


	}

    //Strings de almacenaran cada elemento del nombre del empleado
	public String nombre; // aqui se guarda el nombre 
	public String segundoNombre; //aqui se gurada el segundomnombre 
	public String primerApellido; //aqui se guarda el apellido
	public String segundoApellido; //aqui se guarda el segundo apellido

    //Alberto|Daniel|Picasso|Gonzalez
    //--------------------------------------------------------------------   Cadena a modificar para ser analizada    -----------------------------------------------------
	String empleado1 = " Alberto |Dan    iel   | Pi   cas    so | Gon   zal   ez ";

    // Metodo que sirve para borrar espacios 
	public static String borrarEspacios(String cadena) {
		return cadena.replace(" ", "");
	}

	public String obtenerEmpleado(String registro){        //metodo para obtener la cadena en los 4 atributos 
		String cadenaLimpia = borrarEspacios(registro);
		int pipesContador = 0;
		int cadenaRegistro = 0;
		String temporal = "";
        
        //Ciclo para contar elmnumero de pipes
		for(int i = 0; i < cadenaLimpia.length(); i++){
			if(cadenaLimpia.charAt(i) == '|'){
				pipesContador++;
			}
		}
		//System.out.println(pipesContador);
		//pipesContador = 0; //Reseteamos pipecontador

		if(pipesContador == 2){
			pipesContador = 0;
			System.out.println("La cadena solo tiene un nombre");
		    for(int i = 0; i < cadenaLimpia.length(); i++){

   			    switch (pipesContador) {
				    case 0:
			            if(cadenaLimpia.charAt(i) == '|'){
				            pipesContador = 1;
				            this.nombre = cadenaLimpia.substring(0, i);
				            cadenaRegistro = i;
			            }
                        break;
				    case 1:
			            if(cadenaLimpia.charAt(i) == '|') {
				            pipesContador = 2;
				            this.primerApellido = cadenaLimpia.substring(cadenaRegistro + 1, i);
				            cadenaRegistro = i;
			            }
				        break;
				    case 2:
			            //if(cadenaLimpia.charAt(i) == '|') {
				            //pipesContador = 3;
				            this.segundoApellido = cadenaLimpia.substring(cadenaRegistro +1 , i +1);
				            //cadenaRegistro = i;
			            //}
				        break;
			    }
            }
            temporal = this.nombre + " " + this.primerApellido + " " + this.segundoApellido;
            this.segundoNombre = "";
		}


        

        if(pipesContador == 3){
        	pipesContador = 0;
        	System.out.println("La cadena tiene dos nombres");
		    for(int i = 0; i < cadenaLimpia.length(); i++){

   			    switch (pipesContador) {
				    case 0:
			            if(cadenaLimpia.charAt(i) == '|'){
				            pipesContador = 1;
				            this.nombre = cadenaLimpia.substring(0, i);
				            cadenaRegistro = i;
			            }
                        break;
				    case 1:
			            if(cadenaLimpia.charAt(i) == '|') {
				            pipesContador = 2;
				            this.segundoNombre = cadenaLimpia.substring(cadenaRegistro + 1, i);
				            cadenaRegistro = i;
			            }
				        break;
				    case 2:
			            if(cadenaLimpia.charAt(i) == '|') {
				            pipesContador = 3;
				            this.primerApellido = cadenaLimpia.substring(cadenaRegistro +1 , i);
				            cadenaRegistro = i;
			            }
				        break;
				    case 3:
			            //if(cadenaLimpia.charAt(i) == '|') {
				            //pipesContador = 2;
				            this.segundoApellido = cadenaLimpia.substring(cadenaRegistro + 1, i +1);
				            //cadenaRegistro = i;
			            //}
				        break;
			    }
            }
            temporal = this.nombre + " " + this.segundoNombre + " " + this.primerApellido + " " + this.segundoApellido;
        }
			//System.out.println(cadenaLimpia.charAt(i) + " " + i);
			
			/*if(cadenaLimpia.charAt(i) == '|' && pipesContador == 0){
				pipesContador = 1;
				this.nombre = cadenaLimpia.substring(0, i);
				cadenaRegistro = i;
			}

			if(cadenaLimpia.charAt(i) == '|' && pipesContador == 1) {
				pipesContador = 2;
				this.segundoNombre = cadenaLimpia.substring(cadenaRegistro, i);
				cadenaRegistro = i;
			}

			if(cadenaLimpia.charAt(i) == '|' && pipesContador == 2) {
				pipesContador = 2;
				this.primerApellido = cadenaLimpia.substring(cadenaRegistro, i);
				cadenaRegistro = i;
			}*/
		//return this.nombre + " " + this.segundoNombre + " " + this.primerApellido + " " + this.segundoApellido;
		return temporal;
	}
}