/**
 * Clase que representa a una persona con atributos básicos como el RUT, nombre, dirección y número de teléfono.
 */
public class Persona {
    private String rut;
    private String nombre;
    private String direccion;
    private String telefono;
    
    /**
     * Constructor de la clase Persona.
     *
     * @param rut       El RUT de la persona.
     * @param nombre    El nombre de la persona.
     * @param direccion La dirección de la persona.
     * @param telefono  El número de teléfono de la persona.
     */
    public Persona(String rut, String nombre, String direccion, String telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    /**
     * Obtiene el RUT de la persona.
     *
     * @return El RUT de la persona.
     */
    public String getRut() {
        return rut;
    }

    /**
     * Establece el RUT de la persona.
     *
     * @param rut El RUT de la persona.
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre El nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección de la persona.
     *
     * @return La dirección de la persona.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección de la persona.
     *
     * @param direccion La dirección de la persona.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el número de teléfono de la persona.
     *
     * @return El número de teléfono de la persona.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono de la persona.
     *
     * @param telefono El número de teléfono de la persona.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
