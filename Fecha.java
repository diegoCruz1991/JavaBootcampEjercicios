public class Fecha {
  private int dia;
  private int mes;
  private int anio;
  private boolean esBisiesto = false;

  public static void main(String[] args) {
    Fecha fecha = new Fecha();
    if (fecha.setDia(31) && fecha.setMes(12) && fecha.setAnio(2020))
      System.out.println(fecha.getFecha());
    else
      System.out.println("Fecha no valida");
  }

  public boolean setDia(int dia) {
    if (dia < 1 || dia > 31){
      System.out.println("Dia no valido");
      return false;
    }
    this.dia = dia;
    return true;
  }

  public boolean setMes(int mes) {
    if (mes < 1 || mes > 12){
      System.out.println("Mes no valido");
      return false;
    }
    this.mes = mes;
    return true;
  }

  public boolean setAnio(int anio) {
    if (anio < 1){
      System.out.println("Anio no valido");
      return false;
    }
    if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
      this.esBisiesto = true;
    }
    this.anio = anio;
    return true;
  }

  public String getFecha() {
    if ((this.mes == 2 && this.esBisiesto && this.dia > 29) ||
      (this.mes == 2 && this.dia > 28 && !this.esBisiesto) ||
      ((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) && this.dia > 30))
      return "Fecha no valida";
    else
  	 return this.dia + "/" + this.mes + "/" + this.anio;
  }

}
