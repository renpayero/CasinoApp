/**
 * Clase que representa a un garzón, que es un tipo de trabajador con atributos y comportamientos específicos.
 */
public class Garzon extends Trabajador {
    private double sueldoFijo;
    private double propinas;
    
    /**
     * Obtiene el sueldo fijo del garzón.
     *
     * @return El sueldo fijo del garzón.
     */
    public double getSueldoFijo() {
        return sueldoFijo;
    }

    /**
     * Establece el sueldo fijo del garzón.
     *
     * @param sueldoFijo El sueldo fijo del garzón.
     */
    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    /**
     * Obtiene las propinas del garzón.
     *
     * @return Las propinas del garzón.
     */
    public double getPropinas() {
        return propinas;
    }

    /**
     * Establece las propinas del garzón.
     *
     * @param propinas Las propinas del garzón.
     */
    public void setPropinas(double propinas) {
        this.propinas = propinas;
    }

    /**
     * Constructor de la clase Garzon.
     *
     * @param rut               El RUT del garzón.
     * @param nombre            El nombre del garzón.
     * @param direccion         La dirección del garzón.
     * @param telefono          El número de teléfono del garzón.
     * @param valorHora         El valor por hora trabajada del garzón.
     * @param horasExtras       Las horas extras trabajadas por el garzón.
     * @param asignacionTrabajo La asignación de trabajo del garzón.
     * @param sueldoFijo        El sueldo fijo del garzón.
     * @param propinas          Las propinas del garzón.
     */
    public Garzon(String rut, String nombre, String direccion, String telefono, double valorHora, int horasExtras, String asignacionTrabajo, double sueldoFijo, double propinas) {
        super(rut, nombre, direccion, telefono, valorHora, horasExtras, asignacionTrabajo);
        this.sueldoFijo = sueldoFijo;
        this.propinas = propinas;
    }
    
    /**
     * Calcula el sueldo semanal del garzón.
     * El sueldo semanal del garzón es la suma del sueldo fijo y las propinas.
     *
     * @return El sueldo semanal del garzón.
     */
    public double calcularSueldoSemanal() {
        return getSueldoFijo() + getPropinas();
    }
}
