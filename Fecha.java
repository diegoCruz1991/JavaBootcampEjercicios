public class Fecha{
	private int day;
	private int month;
	private int year;

	public int getDay(){
		return this.day;
	}
	public boolean setDay(int day){
		//System.out.println("dia");
		if (day > 31 || day < 1) {
			System.out.println("Dia no valido");
			return false;
		}
		this.day = day;
		return true;
	}

	public int getMonth(){
		return this.month;
	}
	public boolean setMonth(int month){
		//System.out.println("mes");
		if (month > 12 || month < 1) {
			System.out.println("Mes no valido");
			return false;
		}
		this.month = month;
		return true;
	}

	public int getYear(){
		return this.year;
	}
	public boolean setYear(int year){
		//System.out.println("anio");
		if (year > 2020 || year < 1900) {
			System.out.println("Anio no valido");
			return false;
		}
		this.year = year;
		return true;
	}

	public String getFecha() {
		//System.out.println("get fecha");
		if(this.day == 0){
			System.out.println("Ingrese otra fecha valida");
			return "-";
		}
		return this.day + "/" + this.month + "/" + this.year;
	}
	public boolean setFecha(int day, int month, int year) {
		//System.out.println("set fecha");
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 && day <=31){
			System.out.println("mes de 31");
			this.year = year;
			this.month = month;
			this.day= day;
			return true;
		}else if(month == 4 || month == 6 || month == 9 || month == 11 && day <= 30){
			if(day<=30){
				System.out.println("mes de 30");
				this.year = year;
				this.month = month;
				this.day= day;
				return true;
			}
			System.out.println("Fecha no valida");
			return false;
		}else if(month == 2 && (day <= 29) && (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
			System.out.println("Anio bisiesto");
			System.out.println("mes 2");
			this.year = year;
			this.month = month;
			this.day= day;
			return true;
		}else if(month == 2 && (day <= 28) && (year % 4 != 0)){
			System.out.println("Anio no bisisto");
			System.out.println("mes 2");
			this.year = year;
			this.month = month;
			this.day= day;
			return true;
		}
			this.year = 0;
			this.month = 0;
			this.day = 0;
			System.out.println("Fecha no valida");
			return false;
	}
}