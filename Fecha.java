/*
Bootcamp Java con Selenium
Mòdilo: Jama
Programa: 4
Cynthia Urbano Romero
*/

import java.util.Scanner;

public class Fecha{

		private int anio;
		private int mes;
		private int dia;
		 boolean bis;

	public static void main (String...args){

	System.out.println("\n******* Valida si la fecha que ingresas es correcta ******");
		
	Fecha fecha = new Fecha();
	Scanner entrada=new Scanner(System.in);

    	System.out.print("\nDigita un a\u00f1o: ");
    	fecha.setAnio(entrada.nextInt());
    	System.out.print("\nDigita un mes: ");
    	fecha.setMes(entrada.nextInt());
    	System.out.print("\nDigita un d\u00eda: ");
    	fecha.setDia(entrada.nextInt());

    
	if (fecha.setFecha(fecha.getAnio(),fecha.getMes(),fecha.getDia())==true){

	System.out.println("\nLa fecha es VALIDA : " + fecha.getFecha());}
    else {
		System.out.println("\nXXXX La Fecha Que Ingresaste Es Invalida XXXX \n" + fecha.getFecha());

	}
	
	}


    //Método Getter Año
	public int getAnio(){
		return this.anio;
	}

     //Método Setter Año
	public boolean setAnio(int anio){
			if (anio > 0){
				if (((anio % 4 ==0)&& (anio % 100 != 0 || anio % 400 ==0))){
					//System.out.println("El anio es bisiesto setAno");
       				this.anio = anio;
       				bis=true;
       				return true;
				}
				else{
					//System.out.println("El anio NO  es bisiesto setAno");
       				this.anio = anio;
       				bis=false;
       				return true;

				}
			}
			//System.out.println("A\u00f1o invalido");
			this.anio = anio;
			return false;

			
		}
	//Método Getter Mes
	public int getMes(){
		return this.mes;
	}
	
	//Método Setter Mes
	public boolean setMes(int mes){

			if (mes <1  || mes >12 ) {
			//System.out.println("Mes no valido");
			this.mes=mes ;
			return false;
		}
		this.mes=mes ;
		return true;
	}

	//Método Getter Día
	public int getDia(){
		return this.dia;
	}
	
	//Método Setter Día
	public boolean setDia(int dia){
		
			if (dia < 1 || dia >31) {
			//System.out.println("Dia no valido");
			this.dia=dia;
			return false;
	}
	    this.dia = dia;
	    return true;
	}
	
		//Método Getter Fecha
	public String getFecha() {
	return this.anio + "/" + this.mes + "/" + this.dia;
	}
	//Metpdp Setter Fecha

	public boolean setFecha(int anio, int mes, int dia){
	
        	if ((mes==1 || mes==3 || mes==5 || mes==7 || mes ==8 || mes==10 || mes==12) &&  (dia >0 && dia<=31)){
			//System.out.println("Mes con 31 dias");
				
				return true;
			}

			else if ((mes==4 || mes==6 || mes==9 || mes==11) &&  (dia >0 && dia<=30)){
			//System.out.println("Mes con 30 dias");
				
				return true;
			}
				
			 if (bis==true && mes==2 &&  dia<=29){
			//System.out.println(anio + "A\u00f1o bisiesto");
				
				return true; 
			}
			else
			{
			//System.out.println("Fecha incorrecta");
			return false; 

			}
			
	}	
}