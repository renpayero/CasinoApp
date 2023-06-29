/**
 * Clase abstracta que representa a un trabajador, que es una persona con atributos y comportamientos específicos relacionados con su trabajo.
 */
public abstract class Trabajador extends Persona {
    private double valorHora;
    private int horasExtras;
    private String asignacionTrabajo;
    
    /**
     * Constructor de la clase Trabajador.
     *
     * @param rut               El RUT del trabajador.
     * @param nombre            El nombre del trabajador.
     * @param direccion         La dirección del trabajador.
     * @param telefono          El número de teléfono del trabajador.
     * @param valorHora         El valor por hora trabajada del trabajador.
     * @param horasExtras       Las horas extras trabajadas por el trabajador.
     * @param asignacionTrabajo La asignación de trabajo del trabajador.
     */
    public Trabajador(String rut, String nombre, String direccion, String telefono, double valorHora, int horasExtras, String asignacionTrabajo) {
        super(rut, nombre, direccion, telefono);
        this.valorHora = valorHora;
        this.horasExtras = horasExtras;
        this.asignacionTrabajo = asignacionTrabajo;
    }
    
    /**
     * Obtiene el valor por hora trabajada del trabajador.
     *
     * @return El valor por hora trabajada del trabajador.
     */
    public double getValorHora() {
        return valorHora;
    }

    /**
     * Establece el valor por hora trabajada del trabajador.
     *
     * @param valorHora El valor por hora trabajada del trabajador.
     */
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * Obtiene las horas extras trabajadas por el trabajador.
     *
     * @return Las horas extras trabajadas por el trabajador.
     */
    public int getHorasExtras() {
        return horasExtras;
    }

    /**
     * Establece las horas extras trabajadas por el trabajador.
     *
     * @param horasExtras Las horas extras trabajadas por el trabajador.
     */
    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    /**
     * Obtiene la asignación de trabajo del trabajador.
     *
     * @return La asignación de trabajo del trabajador.
     */
    public String getAsignacionTrabajo() {
        return asignacionTrabajo;
    }

    /**
     * Establece la asignación de trabajo del trabajador.
     *
     * @param asignacionTrabajo La asignación de trabajo del trabajador.
     */
    public void setAsignacionTrabajo(String asignacionTrabajo) {
        this.asignacionTrabajo = asignacionTrabajo;
    }
    
    /**
     * Calcula el sueldo semanal del trabajador.
     * Este método debe ser implementado por las clases concretas que heredan de Trabajador.
     *
     * @return El sueldo semanal del trabajador.
     */
    public abstract double calcularSueldoSemanal();
}
