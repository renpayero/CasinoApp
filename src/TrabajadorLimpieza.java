/**
 * Clase que representa a un trabajador de limpieza, que es un tipo de trabajador con atributos y comportamientos específicos.
 */
public class TrabajadorLimpieza extends Trabajador {
    private static final int MAX_HORAS_TRABAJO_DIARIO = 5;
    private static final double SUELDO_EXTRA_HORA = 3000;
    
    /**
     * Constructor de la clase TrabajadorLimpieza.
     *
     * @param rut               El RUT del trabajador de limpieza.
     * @param nombre            El nombre del trabajador de limpieza.
     * @param direccion         La dirección del trabajador de limpieza.
     * @param telefono          El número de teléfono del trabajador de limpieza.
     * @param valorHora         El valor por hora trabajada del trabajador de limpieza.
     * @param horasExtras       Las horas extras trabajadas por el trabajador de limpieza.
     * @param asignacionTrabajo La asignación de trabajo del trabajador de limpieza.
     */
    public TrabajadorLimpieza(String rut, String nombre, String direccion, String telefono, double valorHora, int horasExtras, String asignacionTrabajo) {
        super(rut, nombre, direccion, telefono, valorHora, horasExtras, asignacionTrabajo);
    }
    
    /**
     * Calcula el sueldo semanal del trabajador de limpieza.
     * El sueldo semanal del trabajador de limpieza se calcula multiplicando el valor por hora por las horas trabajadas,
     * y se le suma un sueldo extra por cada hora extra trabajada que exceda el límite diario.
     *
     * @return El sueldo semanal del trabajador de limpieza.
     */
    public double calcularSueldoSemanal() {
        double sueldo = getValorHora() * MAX_HORAS_TRABAJO_DIARIO;
        if (getHorasExtras() > MAX_HORAS_TRABAJO_DIARIO) {
            double horasExtras = getHorasExtras() - MAX_HORAS_TRABAJO_DIARIO;
            sueldo += horasExtras * SUELDO_EXTRA_HORA;
        }
        return sueldo;
    }
}
