//Arreglalo para que en el print del main se imprima 100
public class Examen3 {

    public static void main(String... args) {
        int x = 10; //El entero vale 100
		X x2 = new X();  //Se define un objeto x2 de la clase X
		S s = new S();   //Se define un objeto s de la clase S
        x = s.x * x2.metodo() / 1;

        System.out.println(x); //Aqui se imprime el valor de x
    }

}

class S {

    public static int x = 10; //Se define x como entero con valor de 10

    //public class S {   //Esta linea la comenté porque no tenia caso tener repetidas 2 clases de nombre S

    public int metodo() {   //Removi el final para poder cambiar el valor del entero
	return this.x;          //Estoy llamando el retorno del valor x
    }
}

class X extends S {
    public int x = 10; //Se define x como entero con valor de 10

    public int metodo() {  
        return this.x;    //Estoy llamando el retorno del valor x
    }
}

class Y extends S {

    public int metodo() {  
        return this.x;   //Estoy llamando el retorno del valor x
    }
}
