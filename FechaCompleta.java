public class FechaCompleta{
	public static void main(String[] args) {
		Fecha fecha = new Fecha();

		fecha.setYear(2020);
		fecha.setMonth(1);
		fecha.setDay(31);
		fecha.setFecha(fecha.getDay(),fecha.getMonth(),fecha.getYear());

		System.out.println("La fecha es: " + fecha.getFecha());
	}
}