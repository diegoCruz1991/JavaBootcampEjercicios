//Arreglalo para que imprima los 2 mensajes de manera correcta

class Examen1 {

	public static void main(String... args) {
		// crear un objeto de tipo B1 y este a su vez crea la instancia de A1
			B1 b1 = new B1();

	}

}

class A1 {
	//b1 no existe dentro de A1 y hacerlo null no es lo que se busca

	//se eliminan los parámetros en A1 porque no hace nada con ellos
	public A1() {
		System.out.println("Aqui se creo A1");
	}
}

class B1 extends A1 {

	//se eliminan los parámetros en A1 porque no hace nada con ellos
	public B1() {
		System.out.println("Aqui se creo B1");
	}
}
