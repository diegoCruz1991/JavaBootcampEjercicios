public class Persona {
	String nombre1 = "Alberto";
	String nombre2 = "Jesus";
	String nombre3 = "Rocio";
	String nombre4 = "Ana";
	String edad1 = "30";
	String edad2 = "29";
	String edad3 = "28";
	String edad4 = "27";


	public static void main(String args[]){
		
		Persona persona = new Persona();
		Hombre hombre = new Hombre();
		Mujer mujer = new Mujer();
		Profesion profesion = new Profesion();
		Ingeniero ingeniero = new Ingeniero();
		IngenieroCivil ingeniero_civil = new IngenieroCivil();
		IngenieroEnComputacion ingeniero_computacion = new IngenieroEnComputacion();
		Medico medico = new Medico();
		MedicoGeneral medico_general = new MedicoGeneral();
		MedicoNeurologo medico_neurologo = new MedicoNeurologo();

        //imprimir en pantalla llamando atributos de cada clase
        System.out.println(persona.nombre1 + " tiene como pasatiempo " + hombre.Pasatiempos + " y es " + profesion.ProfA + " en " + ingeniero.TipoA + " y trabaja como " + ingeniero_computacion.OcupacionB);
        System.out.println(persona.nombre2 + " tiene como pasatiempo " + hombre.Pasatiempos + " y es " + profesion.ProfA + " en " +  ingeniero.TipoB + " y trabaja como " + ingeniero_civil.OcupacionA);
        System.out.println(persona.nombre3 + " tiene como pasatiempo " + mujer.Pasatiempos + " y es " + profesion.ProfB + " en " + medico.TipoA + " y trabaja como " + medico_general.OcupacionC);
        System.out.println(persona.nombre4 + " tiene como pasatiempo " + mujer.Pasatiempos + " y es " + profesion.ProfB + " en " + medico.TipoB + " y trabaja como " + medico_neurologo.OcupacionD);
        //System.out.println();

	}
}

class Hombre {
	String Pasatiempos = "jugar golf";

}

class Mujer {
	String Pasatiempos = "maquillarse";

}

class Profesion {
	String ProfA = "Ingeniero";
	String ProfB = "Medico";

}

//Rama ingeniero

class Ingeniero {
	String TipoA = "Computacion";
	String TipoB = "Civil";
}

class IngenieroCivil {
	String OcupacionA = "Contatista";

}

class IngenieroEnComputacion {
	String OcupacionB = "Lider de equipo de desarrollo";
}

//Rama medico

class Medico {
    String TipoA = "General";
	String TipoB = "Neurologo";
}

class MedicoGeneral {
	String OcupacionC = "Consultorio independiente";
}

class MedicoNeurologo {
	String OcupacionD = "Consulta en hospital privado";
}