public class Arreglalo {
	public static void main() {
		Figura cuadrado = new Figura();
		
		cuadrado.iniciar("cuadrado");
	}
}


	/*class Cuadrado {		
			public void Cuadrado() {
			iniciar();
		}
	}*/

	class Figura {
		String nombre;

		public void iniciar(String cuadrado) {
			this.nombre = cuadrado;
		}
	}