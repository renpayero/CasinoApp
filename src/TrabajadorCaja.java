/**
 * Clase que representa a un trabajador de caja, que es un tipo de trabajador con atributos y comportamientos específicos.
 */
public class TrabajadorCaja extends Trabajador {
    private double sueldoFijo;
    private double ventas;

    /**
     * Constructor de la clase TrabajadorCaja.
     *
     * @param rut               El RUT del trabajador de caja.
     * @param nombre            El nombre del trabajador de caja.
     * @param direccion         La dirección del trabajador de caja.
     * @param telefono          El número de teléfono del trabajador de caja.
     * @param valorHora         El valor por hora trabajada del trabajador de caja.
     * @param horasExtras       Las horas extras trabajadas por el trabajador de caja.
     * @param asignacionTrabajo La asignación de trabajo del trabajador de caja.
     * @param sueldoFijo        El sueldo fijo del trabajador de caja.
     * @param ventas            Las ventas del trabajador de caja.
     */
    public TrabajadorCaja(String rut, String nombre, String direccion, String telefono, double valorHora, int horasExtras, String asignacionTrabajo, double sueldoFijo, double ventas) {
        super(rut, nombre, direccion, telefono, valorHora, horasExtras, asignacionTrabajo);
        this.sueldoFijo = sueldoFijo;
        this.ventas = ventas;
    }

    /**
     * Obtiene el sueldo fijo del trabajador de caja.
     *
     * @return El sueldo fijo del trabajador de caja.
     */
    public double getSueldoFijo() {
        return sueldoFijo;
    }

    /**
     * Establece el sueldo fijo del trabajador de caja.
     *
     * @param sueldoFijo El sueldo fijo del trabajador de caja.
     */
    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    /**
     * Obtiene las ventas del trabajador de caja.
     *
     * @return Las ventas del trabajador de caja.
     */
    public double getVentas() {
        return ventas;
    }

    /**
     * Establece las ventas del trabajador de caja.
     *
     * @param ventas Las ventas del trabajador de caja.
     */
    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    /**
     * Calcula el sueldo semanal del trabajador de caja.
     * El sueldo semanal del trabajador de caja es la suma del sueldo fijo y las ventas.
     *
     * @return El sueldo semanal del trabajador de caja.
     */
    public double calcularSueldoSemanal() {
        return sueldoFijo + ventas;
    }
}
