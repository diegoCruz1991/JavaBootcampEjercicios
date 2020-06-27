import java.time.*;

public class Fecha {
	private int anio;
	private int mes;
	private int dia;
	private String fecha;

	public static void main(String[] args) {
		Fecha fecha = new Fecha();
		fecha.setAnio(2020);
		fecha.setMes(8);
		fecha.setDia(20);
		System.out.println(fecha.getFecha()); //returns string
	}

	public int getAnio(){
		return this.anio;
	}
	public boolean setAnio(int anio){
		if (anio >= 1 && anio <= 9999){
			this.anio=anio;
			return true;
		}
		return false;
	}

	public int getMes(){
		return this.mes;
	}
	public boolean setMes(int mes){
		if (mes >= 1 && mes <= 12){
			this.mes=mes;
			return true;
		}
		return false;
	}

	public int getDia(){
		return this.dia;
	}
	public boolean setDia(int dia){
		LocalDate date = null;
		try {
			date = LocalDate.of(getAnio(), getMes(), 1);	
		} catch(Exception e){
			if (getMes() == 0){
				System.out.println("El mes no es valido");
			} else {
				System.out.println("El año no es valido");
			}	
		} 
		if (dia <= date.lengthOfMonth()){
			this.dia=dia;
			return true;
		}
		return false;
		
	}

	public String getFecha(){
		this.fecha = getDia() + "/" + getMes() + "/" + getAnio();
		return this.fecha;
	}
}

