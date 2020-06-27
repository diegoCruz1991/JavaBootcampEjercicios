public class Fecha {
	
public static void main (String [] args) {
	
	Fecha fecha = new  Fecha();
	
	System.out.println("La fecha es" + fecha.getFecha)
}

private int dia = 20;	
private int mes = 08;
private int año = 2020;

public String getFecha() {
	return this.dia + "/" + this.mes + "/" + this.año;
}

	public void getDia() {
		return this.dia;
	}
	
	public boolean setDia(int dia) {
	if (dia > 31 || dia < 1) {
		System.out.println("Dia inválido");
		return false;
	}

	return true;
	}

public void getMes() {
		return this.mes;
	}
	
	public boolean setMes(int mes) {
	if (mes > 12 || mes < 1) {
		
		System.out.println("Mes inválido");
		return false;
	}

	return true;
}

	public String getAño() {
		return this.año;
	}
	public boolean setDia(int dia) {
	if (año > 2020 || año < 1) {
		System.out.println("Año inválido");
		return false;

	}

	return true;
	
	if ((mes =2) 
}	
}
