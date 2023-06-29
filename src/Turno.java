import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un turno en un casino, que contiene una lista de trabajadores asignados a ese turno.
 */
public class Turno {
    private List<Trabajador> trabajadores;
    
    /**
     * Constructor de la clase Turno.
     * Inicializa la lista de trabajadores del turno como una lista vacía.
     */
    public Turno() {
        trabajadores = new ArrayList<>();
    }
    
    /**
     * Agrega un trabajador al turno.
     * Si el trabajador no es nulo y no está ya presente en la lista de trabajadores del turno, se agrega a la lista.
     *
     * @param trabajador El trabajador a agregar al turno.
     */
    public void agregarTrabajador(Trabajador trabajador) {
        if (trabajador != null && !trabajadores.contains(trabajador)) {
            trabajadores.add(trabajador);
        }
    }
    
    /**
     * Elimina un trabajador del turno.
     * Si el trabajador no es nulo, se elimina de la lista de trabajadores del turno.
     *
     * @param trabajador El trabajador a eliminar del turno.
     */
    public void eliminarTrabajador(Trabajador trabajador) {
        if (trabajador != null) {
            trabajadores.remove(trabajador);
        }
    }
    
    /**
     * Busca un trabajador por su RUT en el turno.
     * Recorre la lista de trabajadores del turno y compara el RUT de cada trabajador con el RUT proporcionado.
     * Si se encuentra un trabajador con el RUT buscado, se devuelve ese trabajador.
     *
     * @param rut El RUT del trabajador a buscar.
     * @return El trabajador con el RUT buscado, o null si no se encuentra ningún trabajador con ese RUT.
     */
    public Trabajador buscarTrabajadorPorRut(String rut) {
        for (Trabajador trabajador : trabajadores) {
            if (trabajador.getRut().equals(rut)) {
                return trabajador;
            }
        }
        return null;
    }
    
    /**
     * Calcula el sueldo semanal total de todos los trabajadores del turno.
     * Recorre la lista de trabajadores del turno y suma el sueldo semanal de cada trabajador.
     *
     * @return El sueldo semanal total de los trabajadores del turno.
     */
    public double calcularSueldoSemanalTrabajadores() {
        double sueldoTotal = 0;
        for (Trabajador trabajador : trabajadores) {
            sueldoTotal += trabajador.calcularSueldoSemanal();
        }
        return sueldoTotal;
    }
}
