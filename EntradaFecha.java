
public class EntradaFecha{

	public static void main(String...args){
		Fecha fecha1 = new Fecha();
		fecha1.setAnio(2020);
		fecha1.setMes(02);
		fecha1.setDia(29);
		System.out.println(fecha1.getFecha());

		Fecha fecha2 = new Fecha();
		fecha2.setAnio(2019);
		fecha2.setMes(02);
		fecha2.setDia(29);
		System.out.println(fecha2.getFecha());

		Fecha fecha3 = new Fecha();
		fecha3.setAnio(2020);
		fecha3.setMes(02);
		fecha3.setDia(30);
		System.out.println(fecha3.getFecha());

		Fecha fecha4 = new Fecha();
		fecha4.setAnio(2016);
		fecha4.setMes(02);
		fecha4.setDia(29);
		System.out.println(fecha4.getFecha());

		Fecha fecha5 = new Fecha();
		fecha5.setAnio(1998);
		fecha5.setMes(04);
		fecha5.setDia(31);
		System.out.println(fecha5.getFecha());

		Fecha fecha6 = new Fecha();
		fecha6.setAnio(2020);
		fecha6.setMes(12);
		fecha6.setDia(32);
		System.out.println(fecha6.getFecha());	

		Fecha fecha7 = new Fecha();
		fecha7.setAnio(2020);
		fecha7.setMes(13);
		fecha7.setDia(06);
		System.out.println(fecha7.getFecha());

		Fecha fecha8 = new Fecha();
		fecha8.setAnio(2020);
		fecha8.setMes(12);
		fecha8.setDia(-15);
		System.out.println(fecha8.getFecha());
	}
}

class Fecha{
	private int anio;
	private int mes;
	private int dia;

	public int getAnio(){
		return this.anio;
	}

	public void setAnio(int anio){
		this.anio = anio;
	}

	public int  getMes(){
		return this.mes;
	}

	public void setMes(int mes){
		this.mes = mes;
	}

	public int getDia(){
		return this.dia;
	}

	public void setDia(int dia){
		this.dia = dia;
	}

	public String getFecha() {
		if (isFechaValida() == true){
			return this.dia + "/" + this.mes + "/" + this.anio + " ES valido";
		}else{
			//System.out.println("FechaInvalida");
			return this.dia + "/" + this.mes + "/" + this.anio + " NO es valido";
		}

	}

	public boolean isFechaValida(){

		if (this.isDiaValido(this.dia) == true){
			if (this.isMesValido(this.mes) == true){
				if (this.isDiaValidoparaMes() == true){
					if (this.mes == 2 ){
						if (this.isAnioBisiesto(this.anio) == true){							   
								if (this.dia < 30){
									return true;
								}else{
									//System.out.println("No es un dia valido para año bisiesto");
									return false;
								}
						}else { 
							    
								if (this.dia < 29){
									
									return true;
								}else{
									//System.out.println("No es un dia valido para");
									return false;
							    }
					    }
					}else 
					 return true;
				}else
				return false;
			}else
			return false;
		}else
		return false;
	}

	public boolean isDiaValido(int dia){
		if (this.dia > 31 || this.dia < 1){
			//System.out.println("Dia no valido");
			return false;
		}else 
		return true;
	}

	public boolean isDiaValidoparaMes(){
		if (this.dia == 31 && this.mes == 1 ){
			return true;
		}else if (this.dia == 31 && this.mes == 3){
			return true;
		}else if (this.dia == 31 && this.mes == 5){
			return true;
		}else if (this.dia == 31 && this.mes == 7){
			return true;
		}else if (this.dia == 31 && this.mes == 8){
			return true;
		}else if (this.dia == 31 && this.mes == 10 ){
			return true;
		}else if (this.dia == 31 && this.mes == 12){
			return true;
		}else if (this.dia == 31 && this.mes == 4){
			return false;
		}else if (this.dia == 31 && this.mes == 6){
			return false;
		}else if (this.dia == 31 && this.mes == 9){
			return false;
		}else if (this.dia == 31 && this.mes == 11){
			return false;
		}else if (this.dia == 31 && this.mes == 2){
			return false;
		}else
			return true;
	}

	public boolean isMesValido(int mes){
		if (this.mes > 12 || this.mes < 1){
			//System.out.println("Mes no valido");
			return false;
		}else 
		return true;
	}

	public boolean isAnioBisiesto(int anio){

		if (this.anio % 4 == 0 && this.anio % 100 == 0){
			if (this.anio % 400 == 0){
				return true;
			}else
			return false;			
	    }else if(this.anio % 4 == 0){
	    		return true;
	    }else
	    return false;
	}
    
}

