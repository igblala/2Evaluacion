package clinicaveterinaria;

public class Persona {

    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;

    //CONSTRUCTOR
    public Persona(String nombre, String apellidos, String dni, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    }

    //MÉTODOS SETTER & GETTER    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //MÉTODOS GENÉRICOS
    /**
     * dameAnyoNacimiento dándole el año actual (int anyoactual) devuelve el año
     * de nacimiento
     *
     * @param anyoactual
     * @return anyo de nacimiento
     */
    public int dameAnyoNacimiento(int anyoactual) {
        return (anyoactual - this.getEdad());
    }
    
    /**
     * @return un String con los campos de la persona
     */
    @Override
    public String toString() {
        return("Nombre: " + nombre + " Apellidos: " + apellidos + " DNI: " + dni + " Edad: " + edad);        
    }
    
}