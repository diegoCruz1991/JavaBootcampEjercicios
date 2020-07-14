public class Problema1 {
	
	public static void main(String... args) {

		Empleado[] soloEmpleados = new Empleado[10]; //Van aumentar a 10

		QAAutomation qa1 = new QAAutomation();
		Programmer pro = new Programmer();
		Manager man = new Manager();
		Becario becarioPro = new Becario();

		soloEmpleados[0] = new Programmer();

		soloEmpleados[1] = new Manager();

		soloEmpleados[2] = new QAAutomation();

		soloEmpleados[3] = new Programmer();

		soloEmpleados[4] = new Manager();

		soloEmpleados[5] = new QAAutomation();

		soloEmpleados[6] = new Programmer();

		soloEmpleados[7] = new Manager();

		soloEmpleados[8] = new QAAutomation();

		soloEmpleados[9] = new Programmer();

		for (Empleado empleado : soloEmpleados ) {
			if (empleado instanceof Programmer) {
				System.out.println("Me estoy entrenando para ser un " + empleado);
				becarioPro.recibirTraining(empleado);
			}else if (empleado instanceof Manager) {
				System.out.println("Me estoy entrenando para ser un " + empleado);
				becarioPro.recibirTraining(empleado);
			}else if (empleado instanceof QAAutomation) {
				System.out.println("Me estoy entrenando para ser un " + empleado);
				becarioPro.recibirTraining(empleado);
			}
		}

		
		/*Becario becarioMan = new Manager();
		Becario becarioQAA = new QAAutomation();*/


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

	Empleado recibirTraining(Empleado empleado);// Hacer que reciba un parametro de tipo Empleado
}

interface Ingeniero {

}

class Programmer extends Empleado implements Entrenable, Ingeniero {
	public String[] programmingLanguages;

	public void writecode() {
		
	}

	@Override
	public Programmer recibirTraining(Empleado empleado) {
		//System.out.println("Recibir training como Programmer");
		return this;
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
	public Manager recibirTraining(Empleado empleado) {
		System.out.println("Recibir training como manager");
		return this;
	}

	@Override
	public void recibirBono() {
		System.out.println("Recibir bono como manager");
	}
}

class Becario extends Externo implements Entrenable {

	@Override
	public Empleado recibirTraining(Empleado empleado) {
			System.out.println(empleado);
		if(empleado instanceof Programmer){
			System.out.println("Recibir training como Becario Programador");
			return new Programmer();
		}else if (empleado instanceof Manager) {
			System.out.println("Recibir training como Becario Manager");
			return new Manager();	
		}else if (empleado instanceof QAAutomation) {
			System.out.println("Recibir training como Becario Automatizador");
			return new QAAutomation();
		}
		return new QAAutomation();
	}

	/*
		- Dependiendo del tipo que llegue como parametro, van a poner mensaje de esta manera
			System.out.println("Me estoy entrenando para ser un " + tipo de objecto);
		- y dependiendo del tipo van a regresar un nuevo objeto de ese tipo, por ejemplo
			si es Programmer -> return new Programmer()
	*/
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

class QAAutomation extends Programmer {

	@Override
	public QAAutomation recibirTraining(Empleado empleado) {
		System.out.println("Recibir training como QAAutomation");
		return this;
	}
}

interface Constantes {

	double PI = 3.14159;

	double HORAS_POR_DIA = 24;
}