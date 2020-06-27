public class Fecha{
    

    public static void main(String... args){
    FechaNueva fechaNueva = new FechaNueva();

    fechaNueva.setAnio(2020);
    fechaNueva.setMes(03); 
    fechaNueva.setDia(26);
    System.out.println(fechaNueva.getFecha());
    }

} 

  class FechaNueva{
    private int dia;
    private int mes;
    private int anio;

    public String getFecha() {
    return this.dia + "/" + this.mes + "/" + this.anio;
    }

    public boolean setFecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;

        //aqui...

        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia <=31){
            System.out.println("Este mes tiene 31 dias");
            this.anio = anio;
            this.mes = mes;
            this.dia= dia;
            return true;
        }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia <= 30){
            if(dia<=30){
                System.out.println("Este mes tiene 30");
                this.anio = anio;
                this.mes = mes;
                this.dia= dia;
                return true;
            }
            System.out.println("Fecha no valida");
            //return false;
        }


return false;

    }//hasta esta llave, no borrar esta llave

    public int getDia(){
        return this.dia;
    }

    public boolean setDia(int dia) {
    if (dia > 31 || dia < 1) {
        System.out.println("Dia no valido");
        return false;
    }
    this.dia = dia;
    return true;
}

    public int getMes(){
        return this.mes;
    }
    public boolean setMes(int mes){
        if (mes > 12 || mes < 1) {
        System.out.println("Mes invalido");
            return false;  
       }
          this.mes = mes;
          return true;  
    }

    public int getAnio(){
        return this.anio;
    }

    public boolean setAnio(int anio){
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
        System.out.println("El anio es bisiesto");
        this.anio = anio;
        return true;
        //return true;
    }
    else {
    System.out.println("El anio no es bisiesto");
        this.anio = anio;
        return false;
    }

  }
    

}

