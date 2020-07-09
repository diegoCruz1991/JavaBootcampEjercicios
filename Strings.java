public class Strings {
    
    public static void main(String[] args) {

        Empleado empleado1 = obtenerEmpleado("  Diego | Alejandro |  Cruz | Ramirez ");
        Empleado empleado2 = obtenerEmpleado("  Diego ||  Cruz | Ramirez ");
    
        }
        
    
    
    public static Empleado obtenerEmpleado(String registro) { //Recibe un String que es el registro a procesar
    
        return  new Empleado(registro);
            
    }
    }
    
    class Empleado {
        private String nombre;
        private String segundoNombre;
        private String primerApellido;
        private String segundoApellido;
        
        Empleado(String registro){ 
            String [] datos = registro.replace(" ","").split("\\|");
            this.nombre = datos[0];
            this.segundoNombre = datos[1];
            this.primerApellido = datos[2];
            this.segundoApellido = datos[3];
            
            System.out.println(this);
        }
        
    
        @Override
        public String toString() {
            return "Empleado [nombre=" + nombre + ", segundoNombre=" + segundoNombre + ", primerApellido=" + primerApellido
                    + ", segundoApellido=" + segundoApellido + "]";
        }
    }
    