/**
	CREATED THE DAY 26/06/2020
	@Author: Eduardo Avila Carranza.
	Program: FORMATO FECHA 
*/

public class Datos_de_entrada{

	public static void main(String... args) {

		Fecha fecha = new Fecha();

		fecha.setYear(2020);
		fecha.setMonth(1);
		fecha.setDay(31);
		fecha.setFecha(fecha.getDay(),fecha.getMonth(),fecha.getYear());

		System.out.println("LA FECHA ES: " + fecha.getFecha());
	}
}

