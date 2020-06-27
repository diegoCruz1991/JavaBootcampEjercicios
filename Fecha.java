public class Fecha {

	public static void main(String args[]) {
	Fecha fecha = new Fecha();

	fecha.setYear(2020);
	fecha.setMonth(8);
	fecha.setDay(20);

	System.out.println(fecha.getFecha());

	}

	private int year;
	private int month;
	private int day;
	private int x;

	public boolean setYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0 || year == 400)) {
			System.out.println("leap-year");
			this.year = year;
			x = 1;
			return false;
		}
		this.year = year;
		return true;
	}

	public boolean setMonth(int month) {
		if (month > 12 || month < 1) {
			System.out.println("Mes no valido");
			return false;
		}
		this.month = month;
		return true;
	}

	public boolean setDay(int day) {

		if ((day > 1) && (this.month == 2) && x == 1 && day < 30){ // Condicion para Febrero en año bisiesto
		} else
		if ((day > 1) && (this.month == 2) && x != 1 && day < 29) { // Condicion para Febrero en año no bisiesto
		} else 
		if ((day > 1) && (this.month == 8) && day <= 31) { // Condicion para la excepcion de Agosto con 31 dias.
		} else
		if ((day > 1) && this.month != 2 && this.month % 2 == 0 && day < 31) { // Condicion para meses con 30 dias.
		} else
		if ((day > 1) && this.month != 2 && this.month % 2 != 0 && day <= 31) { // Condicion para meses con 31 dias.
		} else {
			System.out.println("Fecha no valida");
			return false;
		}
	this.day = day;
	return true;
	}

	public String getFecha() {
		return day + "/" + month + "/" + year;
	}
}




