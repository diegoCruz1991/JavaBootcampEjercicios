public class Fecha {

    public static void main (String [] args) {

        Fecha fecha = new  Fecha();
        
		fecha.setAnio(2015);
		
		fecha.setMes(12);
		
		fecha.setDia(25);
		
        System.out.println("La fecha es " + fecha.getFecha());
    }

    private int dia;
    private int mes;
    private int anio;

    public String getFecha() {
        return this.dia + "/" + this.mes + "/" + this.anio;
    }

    public int getDia() {
        return this.dia;
    }

    public boolean setDia(int dia) {
		this.dia = dia;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
		if (dia <= 31 && dia >= 1) {
                return true;
            }
        }

        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia <= 30 && dia >= 1) {
                return true;
            }
        }
        if (mes == 2) {
            int bisiesto = anio % 4;
            if (bisiesto == 0) {
				System.out.println("Anio bisiesto");
                if (dia <= 29 && dia >= 1) {
                   
                    return true;
                }
            }
            else {
            if (dia <= 28 && dia >= 1) {
                    
                    return true;

                }
            }
        }
		System.out.println("Fecha inválida");
        return false;

    }

    public int getMes() {
        return this.mes;
    }

    public boolean setMes(int mes) {
		this.mes = mes;
        if (mes > 12 || mes < 1) {

            System.out.println("Mes inválido");
            return false;
        }

        return true;
    }

    public int getAnio() {
        return this.anio;
        
    }
    public boolean setAnio(int anio) {
		if (anio >= 0) {
        this.anio = anio;
		return true; 
		}
		else {
		System.out.println("Anio Invalido");
		return false;
		}
	}   
	
        
}