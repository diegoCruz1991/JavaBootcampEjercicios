package com.qamindslab;

import java.util.*;

public class Registro {

    private static final int MAX_PERSONAS_CONFERENCIA = 50;
    private static final int MAX_PERSONAS_ESPERANDO = 48;
    private static final int EDAD_SELECCIONADA = 25;
    private static final int MULTIPLO_SELECCIONADO = 5;


    public Map<Integer, String> nombres = new HashMap<>();
    public Map<Integer, String> apellidos = new HashMap<>();
    public Map<Integer, String> telefonos = new HashMap<>();
    public Map<Integer, String> correos = new HashMap<>();
    public Map<Integer, String> domicilios = new HashMap<>();
    public Map<Integer, Asistente> registro = new HashMap<>();

    public Queue<Persona> cola = new LinkedList<>();

    public int id = 0;

    public void personasFormadasEnCola(){
        directorioNombres();
        directorioApellidos();
        directorioTelefonos();
        directorioCorreos();
        directorioDomicilios();

        Persona persona;
        for (int i=1; i<=MAX_PERSONAS_ESPERANDO; ++i) {
            int edad = (int) (Math.random() * 70) + 15;
            String nombreCompleto = regresaNombre()+" "+regresaApellido()+" "+regresaApellido();
            persona = new Persona(nombreCompleto, edad, regresaTelefono(), regresaCorreo(), regresaDomicilio());
            cola.add(persona);
        }
 //       System.out.println("Recorriendo la cola que se formó.");
 //       recorrerCola();
    }

    public void registroDePersonas(){
        Asistente asistente;
        Persona persona;
        while (!cola.isEmpty()) {
            persona = cola.poll();
            ++id;
            asistente = new Asistente(id, persona.getNombreCompleto(), persona.getEdad(), persona.getTelefono(), persona.getCorreo(), persona.getDomicilio());
            registro.put(id, asistente);
        }
 //       System.out.println("Recorriendo el mapa del registro por id");
 //       recorrerRegistroId();
 //       System.out.println("Recorriendo el mapa del registro por persona");
 //       recorrerRegistroPersona();
    }

    public void personasLLegando(){
        Scanner scanner = new Scanner(System.in);
        int capacidad = MAX_PERSONAS_ESPERANDO;
        Asistente asistente;
        System.out.print("¿Hay alguien más para registrarse (si/no)? : ");
        String opcion = scanner.nextLine();
        while (!opcion.equals("no") && capacidad < MAX_PERSONAS_CONFERENCIA){
            System.out.print("Nombre completo : ");
            String nombre = scanner.nextLine();
            System.out.print("Edad : ");
            int edad = scanner.nextInt();
            System.out.print("Teléfono : ");
            String telefono = scanner.nextLine();
            System.out.print("Correo electrónico : ");
            String email = scanner.nextLine();
            System.out.print("Domicilio particular : ");
            String domicilio = scanner.nextLine();
            capacidad++;
            ++id;
            asistente = new Asistente(id, nombre, edad, telefono, email, domicilio);
            registro.put(id, asistente);

            System.out.print("¿Hay alguien más para registrarse (si/no)? : ");
            opcion = scanner.nextLine();
        }
        if (capacidad == MAX_PERSONAS_CONFERENCIA)
            System.out.println("!!!!!! Lo sentimos, por la pandemia sólo se pueden registrar "+MAX_PERSONAS_CONFERENCIA+" personas !!!!!!!.");

//        System.out.println("Recorriendo el mapa del registro por id");
//        recorrerRegistroId();
//        System.out.println("Recorriendo el mapa del registro por persona");
//        recorrerRegistroPersona();
    }

    public  List<Integer> personasIdMultiplo(){
        List<Integer> listaMultiplo = new ArrayList<>();

        for (Integer llave : registro.keySet()){
            if((llave % MULTIPLO_SELECCIONADO) == 0) {
                listaMultiplo.add(llave);
//                System.out.println("Llave múltiplo: "+llave);
            }
        }
        return listaMultiplo;
    }

    public List<Integer> personasMenores(){
        List<Integer> listaMenor = new ArrayList<>();

        for (Asistente valor : registro.values()){
            if (valor.getEdad() < EDAD_SELECCIONADA) {
                listaMenor.add(valor.getId());
//                System.out.println("Id del asistente: "+valor.getId()+" con la edad: "+valor.getEdad());
            }
        }
        return listaMenor;
    }

    public List<Asistente> personasGanadorasPremio(){
        List<Integer> listaMenor = new ArrayList<>();
        List<Integer> listaMultiplo = new ArrayList<>();
        List<Asistente> ambasListas = new ArrayList<>();

        listaMultiplo = personasIdMultiplo();
        listaMenor = personasMenores();

        for(int i=0; i<listaMultiplo.size(); i++) {
            for (int j=0; j<listaMenor.size(); j++) {
                if (listaMultiplo.get(i) == listaMenor.get(j)) {
                    ambasListas.add(registro.get(listaMultiplo.get(i)));
                }
            }

        }

        return ambasListas;
    }

    public void recorrerCola(){
        for (Persona persona : cola) {
            System.out.println(persona);
        }
    }

    public void recorrerRegistroId(){
        for (Integer llave : registro.keySet()){
            System.out.println(llave);
        }
    }

    public void recorrerRegistroPersona(){
        for (Asistente valor : registro.values()){
            System.out.println(valor);
        }
    }

    public String regresaNombre(){
        int ind = (int) (Math.random() * 10) + 1;
        return nombres.get(ind);
    }

    public String regresaApellido(){
        int ind = (int) (Math.random() * 10) + 1;
        return apellidos.get(ind);
    }

    public String regresaTelefono(){
        int ind = (int) (Math.random() * 10) + 1;
        return telefonos.get(ind);
    }

    public String regresaCorreo(){
        int ind = (int) (Math.random() * 10) + 1;
        return correos.get(ind);
    }

    public String regresaDomicilio(){
        int ind = (int) (Math.random() * 10) + 1;
        return domicilios.get(ind);
    }

    public void directorioNombres(){
        nombres.put(1, "Dulce");
        nombres.put(2, "Pedro Antonio");
        nombres.put(3, "Rosa María");
        nombres.put(4, "Luis");
        nombres.put(5, "Carlos");
        nombres.put(6, "Héctor");
        nombres.put(7, "Arantza");
        nombres.put(8, "Roberto");
        nombres.put(9, "Samuel");
        nombres.put(10, "Jesús Antonio");
    }

    public void directorioApellidos(){
        apellidos.put(1, "López");
        apellidos.put(2, "Hernández");
        apellidos.put(3, "Gómez");
        apellidos.put(4, "Ayala");
        apellidos.put(5, "Zárate");
        apellidos.put(6, "Rodríguez");
        apellidos.put(7, "San Román");
        apellidos.put(8, "Acosta");
        apellidos.put(9, "Martínez");
        apellidos.put(10, "De la Vega");
    }

    public void directorioTelefonos(){
        telefonos.put(1, "5530739877");
        telefonos.put(2, "2288154042");
        telefonos.put(3, "2291830840");
        telefonos.put(4, "5510203040");
        telefonos.put(5, "5503822949");
        telefonos.put(6, "5593429684");
        telefonos.put(7, "5533958058");
        telefonos.put(8, "5590284850");
        telefonos.put(9, "2288184610");
        telefonos.put(10, "2298189492");
    }

    public void directorioCorreos(){
        correos.put(1, "buzon@gmail.com");
        correos.put(2, "correo@hotmail.com");
        correos.put(3, "email@outlook.com");
        correos.put(4, "correspondencia@yahoo.com");
        correos.put(5, "avisos@hotmail.com");
        correos.put(6, "patito@gmail.com");
        correos.put(7, "alarmas123@outlook.com");
        correos.put(8, "ahernandez78@yahoo.com.mx");
        correos.put(9, "jilguero123@yahoo.com");
        correos.put(10, "taxi911@gmail.com");
    }

    public void directorioDomicilios(){
        domicilios.put(1, "Av. Ávila Camacho 89");
        domicilios.put(2, "Ruíz Cortínes 1000");
        domicilios.put(3, "Pípila 100");
        domicilios.put(4, "Miguel Alemán 3878");
        domicilios.put(5, "Calzada de Tlalpan 302");
        domicilios.put(6, "Río de los Remedios 837");
        domicilios.put(7, "Misterios 3");
        domicilios.put(8, "Paricutín 23");
        domicilios.put(9, "Río Gudalquivir 8 int. 3");
        domicilios.put(10, "Álvaro Obregón 32");
    }
}
