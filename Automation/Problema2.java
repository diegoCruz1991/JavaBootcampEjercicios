public class Problema2 {
	
	public static void main(String... args) {

		Manager manager1 = new Manager();

		Empleado qa = new QAAutomation();

		Programmer programmer = new Programmer();

		QAAutomation qa1 = new QAAutomation();

		qa1.recibirTraining();

		//Programmer programmer1 = (QAAutomation)programmer; // Esto va a fallar en tiempo de ejecucion con un ClassCastException


		((Empleado)manager1).recibirBono();

		System.out.println(manager1.teamsize);

		Persona persona1 = new Manager();

		Manager manager2 = (Manager)persona1; // Casteo explicito, porque Manager esta en un nivel mas abajo que Persona

		System.out.println(((Manager)persona1).teamsize);

		((Empleado)persona1).recibirBono();

		((Entrevistador)persona1).entrevistar();

		Empleado manager3 = new Manager();

		Persona persona3 = manager3; // Casteo implicito, porque Persona esta en un nivel mas arriba que Empleado

		/*System.out.println(persona1.name);

		Empleado empleado1 = new Manager();

		//empleado1 = new Programmer();

		System.out.println(empleado1.address);

		empleado1.recibirBono();

		Entrevistador entrevistador1 = new Manager();

		System.out.println(entrevistador1.entrevistar());

		Entrenable entrenable1 = new Manager();

		System.out.println(entrenable1.recibirTraining());


		Empleado[] soloEmpleados = new Empleado[3]; //Van aumentar a 10

		soloEmpleados[0] = new Programmer();

		soloEmpleados[1] = new Manager();

		soloEmpleados[2] = new Reclutador();

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
		//
		
		System.out.println("");
		System.out.println("---> Aqui inicia la tarea <---");
		Becario becario = new Becario();
		Reclutador nuevo = (Reclutador)becario.recibirTraining(new Reclutador());
		Programmer nuevo2 = (Programmer) becario.recibirTraining(new Programmer());
		Manager nuevo3 = (Manager) becario.recibirTraining(new Manager());
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

	Empleado recibirTraining();// Hacer que reciba un parametro de tipo Empleado
	Empleado recibirTraining(Empleado nuevoTipoEmp);// Hacer que reciba un parametro de tipo Empleado
}

interface Ingeniero {

}

class Programmer extends Empleado implements Entrenable, Ingeniero {
	public String[] programmingLanguages;

	public void writecode() {
		
	}

	@Override
	public Programmer recibirTraining() {
		System.out.println("Recibir training como Programmer");
		return this;
	}

	@Override
	public void recibirBono() {
		System.out.println("Recibir bono como Programmer");
	}

	@Override
	public Empleado recibirTraining(Empleado nuevoTipoEmp) {
		// TODO Auto-generated method stub
		return null;
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
	public Manager recibirTraining() {
		System.out.println("Recibir training como manager");
		return this;
	}

	@Override
	public void recibirBono() {
		System.out.println("Recibir bono como manager");
	}

	@Override
	public Empleado recibirTraining(Empleado nuevoTipoEmp) {
		// TODO Auto-generated method stub
		return null;
	}
}

class Becario extends Externo implements Entrenable {

	@Override
	public Empleado recibirTraining(Empleado nuevoEmpleado) {
		System.out.println("Recibir training como Becario");
		if (nuevoEmpleado instanceof Programmer){
			System.out.println("Ahora eres un programador");
			return new Programmer();	
		}
		if (nuevoEmpleado instanceof Reclutador){
			System.out.println("Ahora eres un Reclutador");
			return new Reclutador();	
		}
		if (nuevoEmpleado instanceof Manager){
			System.out.println("Ahora eres un Manager");
			return new Manager();	
		}
		return nuevoEmpleado;
		
	}

	@Override
	public Empleado recibirTraining() {
		// TODO Auto-generated method stub
		return null;
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
	public QAAutomation recibirTraining() {
		super.recibirTraining(); // Va a llamar al metodo recibir training de la clase Programmer
		//this.recibirTraining(); // Esto va a ocasionar recursion infinita
		System.out.println("Recibir training como QAAutomation");
		return this;
	}
}

interface Constantes {

	double PI = 3.14159;

	double HORAS_POR_DIA = 24;
}