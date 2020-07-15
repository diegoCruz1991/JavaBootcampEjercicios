import java.util.*;
import java.util.regex.Pattern;

public class Conferencia {

    private Queue<Persona> filaDePersonas = new LinkedList<>();
    private Map<String, Asistente> registroDeAsistentes = new HashMap<>();
    private Map<String, Asistente> multiplosIds = new HashMap<>();
    private Map<String, Asistente> menores = new HashMap<>();
    private Map<String, Asistente> ganadores = new HashMap<>();

    public void formarPersona() {
        Persona persona = new Persona();
        Scanner in = new Scanner(System.in);
        System.out.println("Nombre de la persona");
        String nombre = in.nextLine();
        persona.setNombre(nombre);
        System.out.println("Apellido de la persona");
        String apellido = in.nextLine();
        persona.setApellido(apellido);
        filaDePersonas.offer(persona);
        System.out.println("El siguiente es: " + filaDePersonas.peek().getNombre() + " " + filaDePersonas.peek().getApellido());
    }

    public void registrarAsistente() {
        if (filaDePersonas.isEmpty()) {
            System.out.println("No hay nadie formado");
        } else {
            Asistente asistente = new Asistente();
            Scanner in = new Scanner(System.in);
            asistente.setNombre(filaDePersonas.peek().getNombre());
            asistente.setApellido(filaDePersonas.peek().getApellido());
            String nombreCompleto = filaDePersonas.peek().getNombre() + " " + filaDePersonas.peek().getApellido();
            filaDePersonas.poll();
            System.out.println("Edad de " + nombreCompleto);
            asistente.setEdad(leerEdad());
            System.out.println("Domicilio de " + nombreCompleto);
            String domicilio = in.nextLine();
            asistente.setDomicilio(domicilio);
            System.out.println("Telefono de " + nombreCompleto);
            String telefono = in.nextLine();
            asistente.setTelefono(Integer.valueOf(telefono));
            System.out.println("Correo de " + nombreCompleto);
            String correo = in.nextLine();
            asistente.setCorreo(correo);

            asistente.setAsistenteId(crearId());

            System.out.println("Se registró con el ID: " + asistente.getAsistenteId());
            this.registroDeAsistentes.put(Integer.toString(asistente.getAsistenteId()), asistente);
        }
    }

    private int leerEdad() {
        Scanner input = new Scanner(System.in);
        String edadCadena = input.nextLine();
        while (Pattern.matches("[a-zA-Z]+", edadCadena)) {
            System.out.println("ERROR - Ingresa solo la edad en años");
            edadCadena = input.nextLine();
        }
        return Integer.parseInt(edadCadena);
    }

    private int crearId() {
        Random rand = new Random();
        int asistenteId = rand.nextInt(999);
        if (registroDeAsistentes.containsKey(Integer.toString(asistenteId))) {
            asistenteId = crearId();
        }
        return asistenteId;
    }

    public void encontrarIds(int multiplo) {
        System.out.println("IDs múltiplos de " + multiplo + ":");
        for (String ids : this.registroDeAsistentes.keySet()) {
            if (Integer.parseInt(ids) % multiplo == 0) {
                System.out.println(registroDeAsistentes.get(ids).getNombre() + registroDeAsistentes.get(ids).getApellido());
                System.out.println("ID: " + registroDeAsistentes.get(ids).getAsistenteId());
                multiplosIds.put(ids, registroDeAsistentes.get(ids));
            }
        }
    }

    public void encontrarMenores(int edad) {
        System.out.println("Asistentes menores de " + edad + " años:");
        for (String ids : this.registroDeAsistentes.keySet()) {
            if (registroDeAsistentes.get(ids).getEdad() < edad) {
                System.out.println(registroDeAsistentes.get(ids).getNombre() + registroDeAsistentes.get(ids).getApellido());
                System.out.println("Edad: " + registroDeAsistentes.get(ids).getEdad() + " años");
                menores.put(ids, registroDeAsistentes.get(ids));
            }
        }
    }

    public void encontrarGanadores() {
        System.out.println("Estos son los gandores redobles drrrrmrrmrmrmrmr: ");
        for (String ids : this.multiplosIds.keySet()) {
            if (multiplosIds.containsKey(ids)) {
                ganadores.put(ids, registroDeAsistentes.get(ids));
            }
        }
    }

    public boolean vinoGente() {
        return !this.registroDeAsistentes.isEmpty();
    }

    public boolean estaLleno() {
        return !(registroDeAsistentes.size() <= 50);
    }
}
