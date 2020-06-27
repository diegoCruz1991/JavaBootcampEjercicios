public class Fecha{
	private int dia;
	private int	mes;
private int	annio;
public static void main(String... args){
	Fecha fecha= new Fecha();
	boolean a=fecha.setDia(28);
	boolean b=fecha.setMes(02);
	boolean c= fecha.setAnnio(-1);
	if(a&&b&&c){
	String n=fecha.getFecha();
	System.out.println(n);}
}


	public boolean setDia(int dia){
		if(dia<1 || dia>31){
			System.out.println("El dia ingresado no es valido");
			return false;
		}
			this.dia=dia;
			return true;
	}
	
	public boolean setMes(int mes){
		if(mes<1 || mes>12){
			System.out.println("El mes ingresado es invalido");
			return false;
		}
		this.mes=mes;
		return true;
	}
	public boolean setAnnio(int annio){
		if(annio<=0){
			System.out.println("No se pueden ingresar años negativos");
			return false;
		}
		this.annio=annio;
		return true;
	}
	
	public String getFecha(){

		if((annio%4!=0) && (mes==2) && (dia==29)){
			return "Ese año no es Bisiesto";
		} else if(dia>30 && (mes==4 || mes==6|| mes==9 || mes==11)){
			return "La fecha ingresada es incorrecta, no existe";
		}else if (dia>29 && mes==2){
			return "Ese día no existe";
		}
		return this.dia+"/"+this.mes+"/"+this.annio;
	}
	
	
}