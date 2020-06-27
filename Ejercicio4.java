import java.util.Scanner; //libreria para hacer entradas desde el teclado
public class Ejercicio4{
	public static void main(String... args){
		boolean flagAnio=false; //Cree estas banderas para
		boolean flagMes=false; // Interrumpir la ejecucion
		boolean flagDia=false; // En caso que algun dato fuese erroneo
		Fecha fecha = new Fecha(); // Creacion de objeto fecha guardandolo en la variable de referencia fecha
		Scanner teclado = new Scanner(System.in); //Creacion de objeto teclado para leer los datos que se introduzcan
		System.out.println("Inserte el Anio: ");
		int year = teclado.nextInt(); // Guardando en una variable year lo introducido por el usuario
		flagAnio = fecha.setAnio(year); //llamando el metodo setAnio, enviando como argumento lo introducido por el usuario y guardando un flag para saber si el año fue introducido correctamente
		
		if(flagAnio==true){ //Si el dato anio fue introducido correctamente ejecutara el siguiente bloque
			System.out.println("Inserte el Mes: ");
			int month = teclado.nextInt(); // Guardando en una variable month lo introducido por el usuario
			flagMes=fecha.setMes(month); //llamando el metodo setMes, enviando como argumento lo introducido por el usuario y guardando un flag para saber si el año fue introducido correctamente
		}
		if(flagMes==true){ //Si el dato mes fue introducido correctamente ejecutara el siguiente bloque
			System.out.println("Inserte el Dia: ");
			int day = teclado.nextInt(); // Guardando en una variable month lo introducido por el usuario
			flagDia=fecha.setDia(day); //llamando el metodo setDia, enviando como argumento lo introducido por el usuario y guardando un flag para saber si el año fue introducido correctamente
		}
		if (flagDia==true){ //Si el dato dia fue introducido correctamente ejecutara el siguiente bloque
			System.out.println("La fecha ingresada es: " + fecha.getFecha()); //Imprime la fecha ingresada a traves del metodo getFecha
		}
	}
}

class Fecha{
private int anio;
private int mes;
private int dia;
boolean bisiesto; //Añadi la variable bisiesto para validar que funcionara el dia 29 en febrero
int MaxDay; //Añadi la variable MaxDay para validar que se estan entrando los dias correctos dependiendo del mes

	public boolean setAnio(int x){ //Metodo para guardar el año y determinar si es bisiesto o no
		if(x>0) //Valida que el año sea mayor a 0
		{
			this.anio = x; //Guarda el año en la variable privada anio
			if(x%4==0){ //Validacion de si es bisiesto o no, mediante la verificacion del residuo de la division entre 4 del año introducido
				this.bisiesto = true; // Si es igual a 0, guarda true en la variable bisiesto
			}
			else{
				this.bisiesto = false; //Si no lo es, guarda falso en la variable bisiesto	
			}
			return true; //devuelve true, reconociendo que es un dato valido
		}
		else{
			System.out.println("Anio invalido");
			return false; //devuelve false, reconociendo que es un dato invalido
		}
	}

	public boolean setMes(int y){ //Metodo para guardar el mes y determinar cuando dias en total tiene el mes
		if(y <= 12 && y > 0){ //Valida que mes sea menor que 12 y mayor que 0
			this.mes = y; //Guarda el valor del mes en la variable privada
			if(y==4 || y==6 || y==9 || y==11 || y==2){ //Si es el mes de Abril, Junio, Septiembre, Noviembre o Febrero
				if(y==2){ //Y si es Febrero
					if(this.bisiesto==true){ //Y ademas es bisiesto
						this.MaxDay=29; //Guarda el MaxDay como 29
					}
					else{
						this.MaxDay=28; //Si no es bisiesto, guarda MaxDay como 28
					}
				}
				else{
					this.MaxDay=30; //Si no es Febero pero si Abril, Junio, Septiembre o Noviembre, guarda MaxDay como 30
				}
			}
			else{
				this.MaxDay=31; //Si no es ninguno de los ya mencionados, guarda MaxDay como 31
			}
			return true; //Regresa bandera true pues si es un dato valido	
		}
		else{
			System.out.println("Mes no valido");
			return false; //Si no es menor o igual a 12 y mayor a 0, entonces es un dato erroneo y regresa false
		}
	}

	public boolean setDia(int z){ //Metodo para guardar el mes verificando que cumpla con ser un dia posible de acuerdo al mes seleccionado
		if(z <= this.MaxDay && z > 0){
			this.dia = z;
			return true;
		}
		else{
			System.out.println("Dia no valido");
			return false;
		}		
	}

	public String getFecha(){
		return this.dia + "/" + this.mes + "/" + this.anio;
	}

}
