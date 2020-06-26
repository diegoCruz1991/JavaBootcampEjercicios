public class Fecha {
	
	//Declaramos atributos privados para año, mes y dia
	private int anio;
	private int mes;
	private int dia;

    //Declaramos metodo principal
	public static void main(String args[]){
        
        //Creamos e instanciamos el objeto fecha
		Fecha fecha = new Fecha();

		//Seteamos la fecha en los atributos de la clase Fecha
		int dia = 21;
		int mes = 2;
		int anio = 2020; 

		fecha.setDia(dia);
		fecha.setMes(mes);
		fecha.setAnio(anio);
		
		//fecha.getDia(20);

		//inprimimos en terminal la fecha con el metodo getFecha si la fecha es valida

		if((fecha.setDia(dia) == true) && (fecha.setMes(mes) == true) && (fecha.setAnio(anio) == true)){
			System.out.println("La fecha de cumpleaños es: " + fecha.getFecha());
		}
		

	}
    
	/*public void setAnio(int a){
		this.anio = a;
	}

	/*public void setMes(int b){
		this.mes = b;
	}
    
	/*public void setDia(int c){
		this.dia = c;
	}*/
    

    public boolean setDia(int dia) {
	    if (dia > 31 || dia < 1) {
		     System.out.println("Dia no valido");
		     //this.dia = dia;
		     return false;
		}
	    this.dia = dia;
	    return true;
    }

    public boolean setMes(int mes) {

		//Retorna un aviso de que febrero no tiene mas de 29 dias
		/*if(this.dia > 29 && mes == 2){
			System.out.println("Febrero no puede tener mas de 29 dias");
			//this.mes = mes;
			//return false;
		}*/


    	//Caundo el numero de mez es mayor a 12 o menor a 1
	    if (mes > 12 || mes < 1) {
		     System.out.println("Numero de mes no válido");
		     this.mes = mes;
		     return false;
		}
       
        /* Meses con menos de 31 dias
#    Mes            dias
_________________________
1    enero          31
2    febrero        28/29
3    marzo          31
4    abril          30
5    mayo           31
6    junio          30
7    julio          31
8    agosto         31
9    septiembre     30
10   octubre        31
11   noviembre      30
12   diciembre      13

Cant dias       # de mes
_________________________________
31 dias ------> (1,3,5,7,8,10,12)
30 dias ------> (4,6,9,11)
28/29 dias ---> (2)

Año bisiesto año % 4 = 0
        */

        //Retorna un aviso de que el mes ingresado no tiene 31 dias
		if ((this.dia == 31 && mes == 2) || (this.dia == 31 && mes == 4) || (this.dia == 31 && mes == 6) || (this.dia == 31 && mes == 9) || (this.dia == 31 && mes == 11)){
			System.out.println("El mes ingresado no tiene 31 dias");
			this.mes = mes;
			return false;
		}

		//Retorna un aviso de que el mes ingresado no tiene 30 dias
		if((this.dia == 30 && mes == 1) || (this.dia == 30 && mes == 2) || (this.dia == 30 && mes == 3) || (this.dia == 30 && mes == 5)|| (this.dia == 30 && mes == 7) || (this.dia == 30 && mes == 8)|| (this.dia == 30 && mes == 10) || (this.dia == 30 && mes == 12)){
			System.out.println("El mes ingresado no tiene 30 dias");
			this.mes = mes;
			return false;
		}


	    this.mes = mes;
	    return true;
    }

    //Retorna un aviso de que  la fecha ingresada no existe por 
    public boolean setAnio(int anio){
    	if(anio % 4 == 0 && this.mes == 2  && this.dia > 29){
    		System.out.println("Esta fecha no existe ya que el año ingresado es bisiesto");
    		this.anio = anio;
    		return false;
    	}
        //System.out.println(2022 % 4);
    	this.anio = anio;
	    return true;


    }

	public String getFecha() {

	return this.dia + "/" + this.mes + "/" + this.anio;

    }

}