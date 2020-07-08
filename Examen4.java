//Hacer que imprima Hola como estas? 10 veces

public class Examen4 {
	//cambiar variable a static
	public static int x = 0;

	public static void main(String... args) {
		// que el for vaya de 0 a 100 para muchas condiciones
		for (int i = 0; i <= 100; i++) {
		//borrar este if porque siempre será true
		//acceder a x por medio de la clase
			if (Examen4.x == 6){
				System.out.println("Hola");
				System.out.println("como");
			} else {
					System.out.println("?");
			}
			if(10 * 20 == Examen4.x * 10 + 100) {
					System.out.println("estas ?");
					//reiniciar x para que se cumpla otras veces
					Examen4.x = 0;
			}
			// incrementar x para llegar a las condiciones
			Examen4.x++;
		}
	}
	// en general agregar y coincidir las llaves de los bloques
}
