public class Problema1 {

	public static void main(String... args) {

		Manager manager1 = new Manager();

		System.out.println(manager1.teamsize);

		Persona persona1 = new Manager();

		System.out.println(persona1.name);

		Empleado empleado1 = new Manager();

		System.out.println(empleado1.address);

		empleado1.recibirBono();

		Entrevistador entrevistador1 = new Manager();

		System.out.println(entrevistador1.entrevistar());

		Entrenable entrenable1 = new Manager();

		System.out.println(entrenable1.recibirTraining());


		Empleado[] soloEmpleados = new Empleado[10]; //Van aumentar a 10

		soloEmpleados[0] = new Programmer();
		soloEmpleados[1] = new Programmer();
		soloEmpleados[2] = new Manager();
		soloEmpleados[3] = new Reclutador();
		soloEmpleados[4] = new Manager();
		soloEmpleados[5] = new Programmer();
		soloEmpleados[6] = new Reclutador();
		soloEmpleados[7] = new Programmer();
		soloEmpleados[8] = new Manager();
		soloEmpleados[9] = new Reclutador();

		for (Empleado empleado : soloEmpleados) {
			if (empleado instanceof Programmer){
				System.out.println("Tu eres el mejor");
			}
			if (empleado instanceof Entrevistador){
					System.out.println("Tienes entrevista proximamente");
			}
			if (empleado instanceof Entrenable){
					System.out.println("Tienes entrenamiento en 10 minutos");
			}
		}

		/*for (int i = 0; i < soloEmpleados.length; i++) {
			empleado[i].recibirBono();
		}

		for (Empleado empleado : soloEmpleados) {
			empleado.recibirBono();
		}*/

		//instanceof  if (objeto instanceof Tipo de objeto) si es de ese tipo, regresa true, si no, regresa false


		//Agregar un filtro, si es Entrevistador, imprimir mensaje "Tienes entrevista proximamente"

		//Agregar un filtro, si es Entrenable, imprimir mensaje "Tienes entrenamiento en 10 minutos"

		//Agregar un filtro, si es Programmer, imprimir mensaje "Tu eres el mejor"

	}
}


abstract class Persona {
	protected String name;
	protected String address;
	protected String phoneNumber;
	protected int experience;
}

abstract class Empleado extends Persona {
	public abstract void recibirBono();
}

abstract class Externo extends Persona {
	public int tiempoDeContrato = 3;
}

interface Entrevistador {

	int X = 0; //No se permiten atributos, por naturaleza este atributos public static final int x = 0;

	double entrevistar();

}

interface Entrenable {

	double recibirTraining();
}

interface Ingeniero {

}

class Programmer extends Empleado implements Entrenable, Ingeniero {
	public String[] programmingLanguages;

	public void writecode() {

	}

	@Override
	public double recibirTraining() {
		System.out.println("Recibir training como Programmer");
		return 0.0;
	}

	@Override
	public void recibirBono() {
		System.out.println("Recibir bono como Programmer");
	}
}

class Manager extends Empleado implements Entrenable, Entrevistador {
	public int teamsize = 10;

	public void reportProjectStatus() {

	}

	@Override
	public double entrevistar() {
		System.out.println("Entrevistar como manager");
		return 0.0;
	}

	@Override
	public double recibirTraining() {
		System.out.println("Recibir training como manager");
		return 0.0;
	}

	@Override
	public void recibirBono() {
		System.out.println("Recibir bono como manager");
	}
}

class Becario extends Externo implements Entrenable {

	@Override
	public double recibirTraining() {
		System.out.println("Recibir training como Becario");
		return 0.0;
	}
}

class Reclutador extends Empleado implements Entrevistador {

	@Override
	public double entrevistar() {
		System.out.println("Entrevistar como Reclutador");
		return 0.0;
	}

	@Override
	public void recibirBono() {
		System.out.println("Recibir bono como Reclutador");
	}
}


interface Constantes {

	double PI = 3.14159;

	double HORAS_POR_DIA = 24;
}
