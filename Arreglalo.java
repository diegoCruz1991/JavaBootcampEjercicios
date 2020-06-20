public class Arreglalo {

	public void Iniciar(){
		System.out.println("Iniciando programa. . .");
	}
	
	public static void main(String[] args) {
		
		Cuadrado cuadrado = new Cuadrado();

		cuadrado.Iniciar();
		cuadrado.Rodar();
	}
}

class Cuadrado extends Arreglalo{
	
	public void Rodar(){
		System.out.println("Estoy 'rodando' como un cuadrado");
	}
}



	

