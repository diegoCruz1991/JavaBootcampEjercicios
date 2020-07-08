//Arreglalo para que en el print del main se imprima 100

public class Examen3 {
	//corregir parametros de main
	public static void main(String... args) {
	    int x = 0;
			// crear instancia de X
			X objetoX = new X();
			// llamar el método por medio de la instancia
			x = S.x * objetoX.metodo() / 1;
			System.out.println(x);
	}

}

class S {
	// variable de tipo int
	public static int x = 10;

	//paréntesis en el contructor
	public S () {

	}

	// borrar final del metodo para sobreescribirlo
	//hacerlo int y regresar x
	public int metodo() {
			return this.x;
	}
}

class X extends S {
	//variable private para regresar en el método de tipo int
	private int x = 10;

	// sobreescribir método y regresar un int
	@Override
	public int metodo() {
		return this.x;
	}
}

class Y extends S {
	//variable private para regresar en el método de tipo int
	private int x;

	public int metodo() {
		return this.x;
	}
}
