/**
 * Clase que representa a un cocinero, que es un tipo de trabajador con atributos y comportamientos específicos.
 */
public class Cocinero extends Trabajador {
    private static final int MAX_HORAS_TURNO = 5;
    private static final double PORCENTAJE_HORA_EXTRA = 0.3;
    
    /**
     * Constructor de la clase Cocinero.
     *
     * @param rut               El RUT del cocinero.
     * @param nombre            El nombre del cocinero.
     * @param direccion         La dirección del cocinero.
     * @param telefono          El número de teléfono del cocinero.
     * @param valorHora         El valor por hora trabajada del cocinero.
     * @param horasExtras       Las horas extras trabajadas por el cocinero.
     * @param asignacionTrabajo La asignación de trabajo del cocinero.
     */
    public Cocinero(String rut, String nombre, String direccion, String telefono, double valorHora, int horasExtras, String asignacionTrabajo) {
        super(rut, nombre, direccion, telefono, valorHora, horasExtras, asignacionTrabajo);
    }
    
    /**
     * Calcula el sueldo semanal del cocinero.
     * Si el cocinero trabaja hasta el máximo de horas por turno, se le paga el valor por hora multiplicado por el máximo de horas por turno.
     * Si el cocinero trabaja más horas de las permitidas, se le paga el valor por hora multiplicado por el porcentaje de hora extra, por cada hora extra trabajada.
     *
     * @return El sueldo semanal del cocinero.
     */
    public double calcularSueldoSemanal() {
        double sueldo = getValorHora() * MAX_HORAS_TURNO;
        if (getHorasExtras() > MAX_HORAS_TURNO) {
            double horasExtras = getHorasExtras() - MAX_HORAS_TURNO;
            sueldo += horasExtras * getValorHora() * PORCENTAJE_HORA_EXTRA;
        }
        return sueldo;
    }
}
