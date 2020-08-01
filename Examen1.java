//Arreglalo para que imprima los 2 mensajes de manera correcta
class Examen1 {
    public static void main(String... args) {

        A1 a1 = new A1(); //Se crea el objeto a1 dentro de la clase A1
        a1.printMessage("Aqui se creo B1");

    }
}


class A1 {

    private B1 b1 = null; // se agrego el tipo de variable y private como modificador de acceso

    public A1() { //se creo el constructor por default por que no existe

    }

    public void printMessage(String a) {  //se creo el metodo printmessage con un objeto tipo String
        b1 = new B1(a); // Se paso el mismo valor para llamar al constructor que tiene el mensaje en B1
        System.out.println("Aqui se creo B1");
    }
}

class B1 extends A1 {

    public B1(String a) {
        System.out.println("Aqui se creo A1");
    }
}
