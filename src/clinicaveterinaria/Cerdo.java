/**
 * Clase Cerdo.
 * @author Nacho
 * @author Maria
 * @version 1.0
 */
package clinicaveterinaria;

public class Cerdo extends Mascota{

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }
    //ATRIBUTOS
    private float peso;
    
    //CONSTRUCTOR
    public Cerdo(String nombre, int edad, String raza, Persona duenyo, float peso) {
        super(nombre, edad, raza, duenyo);
        this.peso = peso;
    }

}
