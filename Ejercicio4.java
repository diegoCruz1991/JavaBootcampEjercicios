public class Ejercicio4{

	public static void main (String... args){
		
	Ejercicio4 ejercicio = new Ejercicio4();
	
	Fecha fecha = new Fecha();

	fecha.setAnio(2020);
	fecha.setMes(8);
	fecha.setDia(20);
	
	System.out.println(fecha.getFecha());
	
	}
}
	
	class Fecha{

		private int anio;
		private int mes;
		private int dia;

		public boolean setAnio(int anio) {
			this.anio = anio;
			return true;
		}
		
		public boolean setMes(int mes) {
			if (mes > 12 || mes < 1) {
				System.out.println("Mes no valido" + this.mes);
				return false;
			}
			
			this.mes = mes;
			return true;
		}

		public boolean setDia(int dia) {
			if (dia > 31 || dia < 1) {
				System.out.println("Dia no valido. Dia " + dia);
				return false;
			}
			
			if (dia == 29 && this.mes == 2) {
				if ((this.anio % 4) != 0) { 
					System.out.println("Dia 29 no valido,  para el mes de febrero, el anio no es bisiesto " + this.anio);
					return false;
				}
			}
			
			if (dia == 31 && (this.mes == 2 || this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)) {
				System.out.println("Dia no valido, para el mes ingresado. Dia: " + dia + " mes: " + this.mes);
				return false;
			}

			this.dia = dia;
			return true;
		}
		
		public String getFecha() {
			return this.dia + "/" + this.mes + "/" + this.anio;
		}	
		
	}

