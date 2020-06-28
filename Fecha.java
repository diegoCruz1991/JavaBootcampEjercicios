public class Fecha {

	private int anio;
	private int mes;
	private int dia;
	
	public static void main (String... args){

		Fecha fecha = new Fecha();
		fecha.setAnio(2020);
		fecha.setMes(08);
		fecha.setDia(20);
		fecha.getFecha();
	}

public int getAnio (){									
	return this.anio;
}

public boolean setAnio(int anio){
	if(anio %4 == 0) && (anio %100 !=0); {
		System.out.println("Anio no valido");
		return false;
	}
}

public int getMes(){
	return this.mes;
}

public boolean setMes(int mes){
	if (mes>0 && mes <= 12); {
		System.out.println("Mes no valido");
		return false;
	}
}

public int getDia(){
		return this.dia;
	}

public boolean setDia(int dia){
	if (dia >0 && dia <= 31); {
		Sytem.out.pritnln("Dia no valido");
		return false;
	}
}

public String getFecha(int dia, int anio, int mes){

	return this.dia + "/" + this.mes  +"/"+ this.anio;
}


}
