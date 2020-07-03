/**
	CREATED THE DAY 26/06/2020
	@Author: Eduardo Avila Carranza.
	Program: FORMATO FECHA. 
*/

public class Fecha{

	private int day;
	private int month;
	private int year;

	public int getDay(){
		return this.day;
	}
	public boolean setDay(int day){

		if (day > 31 || day < 1) {
			System.out.println("DIA NO VALIDO");
			return false;
		}
		this.day = day;
		return true;
	}

	public int getMonth(){
		return this.month;
	}
	public boolean setMonth(int month){

		if (month > 12 || month < 1) {
			System.out.println("MES NO VALIDO");
			return false;
		}
		this.month = month;
		return true;
	}

	public int getYear(){
		return this.year;
	}
	public boolean setYear(int year){

		if (year > 2020 || year < 1980) {
			System.out.println("AÑO NO VALIDO");
			return false;
		}
		this.year = year;
		return true;
	}

	public String getFecha() {

		return this.day + "/" + this.month + "/" + this.year;
	}

	public boolean setFecha(int day, int month, int year) {
		if (month >= 31);
			return  true;
		}

	}




