/**
 * Clase Persona.
 * @author Nacho
 * @author Maria
 * @version 1.0
 */
package clinicaveterinaria;


public class Mascota {

    //ATRIBUTOS
    private String nombre;
    private int edad;
    private String raza;
    private Persona duenyo;

    //CONSTRUCTOR
    /**
     * Constructor de la clase Mascota
     *
     * @param nombre
     * @param edad
     * @param raza
     * @param duenyo
     */
    public Mascota(String nombre, int edad, String raza, Persona duenyo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.duenyo = duenyo;
    }

    //MÉTODOS SETTER & GETTER
    /**
     * @return el nombre de la mascota
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre el nuevo nombre de la mascota
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return la edad, que es un entero con los años
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad la nueva edad para poner
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return la raza de la mascota
     */
    public String getRaza() {
        return raza;
    }


    public void setRaza(String raza) {
        this.raza = raza;
    }


    public Persona getDuenyo() {
        return duenyo;
    }


    public void setDuenyo(Persona duenyo) {
        this.duenyo = duenyo;
    }

    //MÉTODOS GENÉRICOS

    @Override
    public String toString() {
        return ("Nombre: " + nombre + " Edad: " + edad + " Raza: " + raza + " Dueño: " + duenyo.toString());
    }
}