package com.qaminds;

public class App{

	private int anio;
	private int dia;
	private int mes;
	private String fecha;

	public int getAnio(){
		return this.anio;
	}
	public void setAnio(int anio){
		this.anio = anio;

		System.out.println( " 'Anio' ingresado" + " " + anio);
	}

	public int getDia(){
		return this.dia;
	}
	public boolean  setDia(int dia){
		if (dia > 31 ||  dia < 1) {
			
			System.out.println("Dia Invalido . . ." + dia);
			return false;
		}else{
			
			
			this.dia = dia;
			System.out.println("Dia valido" + " " + dia);
			return true;			
		}	
	}
	public int getMes(){
		return this.mes;
	}
	public void setMes(int mes){
		if(mes >12 || mes  <1){
			System.out.println("Mes Invalido . . .");
		}else{

			System.out.println("Mes Valido" + " " + mes );
		 	this.mes = mes;
		}
	}

	/*public int getFecha(){
		return this.dia; 
		return this.mes;
		return this.anio;

	}*/
	public String getFecha() {
		return this.dia + "/" + this.mes + "/" + this.anio;
	}

	/*public void setFecha( int dia, int mes, int anio){
		this.dia = dia;
		this.mes = mes;
		this.anio= anio;
		System.out.println("La fecha ingresada es: " + dia + "/" +  mes + "/" + anio);
	}*/

}

