public class FechaCompleta{
	public static void main(String[] args) {
		Fecha fecha = new Fecha();

		fecha.setYear(2019);
		fecha.setMonth(2);
		fecha.setDay(29);
		fecha.setFecha(fecha.getDay(),fecha.getMonth(),fecha.getYear());

		System.out.println("La fecha es: " + fecha.getFecha());
	}
}