import java.util.Scanner;

public class Ejercicio4 {
    private int anio;
	private int mes;
	private int dia;
    boolean biciesto = false;
	
	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public String getFecha() {
		return "La Fecha ingresada fue: "+getDia()+"/"+getMes()+"/"+getAnio();
	}
	
	
	public boolean setDia1(int dia, int mes) {
		if (dia > 31 || dia < 1) {
			System.out.println("\n El Dia "+ dia +" no es valido");
			return false;
		}
		else if (mes==2 && dia >28)
		{
			System.out.println("\n El Dia "+ dia +" no es valido");
			return false;
		}

		System.out.println("\n El Dia: "+ dia +" es valido");
		this.dia = dia;
		return true;
	}
	
	public boolean setMes1 (int mes){
		if(mes > 12 || mes < 1)
		{
			System.out.println("\n El Mes "+ mes +" no es valido");
			return false;
		}
		System.out.println("\n El Mes "+ mes +" es valido");
		this.mes = mes;
		return true;

		
	}
	
	public boolean setAnioB(int anio){
		if (anio % 4 == 0){
			if(anio % 100 == 0) {
				if ( anio % 400 == 0){
                    biciesto = true;
				}
				else {
					biciesto= false;
					}		
			}
			  else
	                biciesto = true;
			
		}
		else
		   biciesto = false;
		
		System.out.println("\n El anio "+anio+" es Biciesto: "+ (biciesto ? " Si":" No"));
		this.anio = anio;
		return biciesto;

			
    }
    
    public static void main (String [] args) {
		Ejercicio4 fecha = new Ejercicio4();
		Scanner scanner = new Scanner (System.in);

		System.out.println("Proporciona el Dia:\n");
		int varDia = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Proporciona el Mes:\n");
		int varMes = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Proporciona el Anio:\n");
		int varAnio = Integer.parseInt(scanner.nextLine());
		
		
		fecha.setAnio(varAnio);
		fecha.setMes(varMes);
		fecha.setDia(varDia);
		
		System.out.print(fecha.getFecha());
		fecha.setDia1(varDia, varMes);
		fecha.setMes1(varMes);
		fecha.setAnioB(varAnio);
		
	}
    
}