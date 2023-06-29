public class CasinoApp {
    public static void main(String[] args) {
        // Creamos algunos trabajadores
        TrabajadorLimpieza trabajador1 = new TrabajadorLimpieza("12345678-9", "Juan", "Calle A", "123456789", 5000, 6, "Limpieza");
        Cocinero trabajador2 = new Cocinero("98765432-1", "María", "Calle B", "987654321", 6000, 4, "Cocina");
        Garzon trabajador3 = new Garzon("45678901-2", "Pedro", "Calle C", "456789012", 7000, 0, "Garzón", 10000, 3000);

        // Creamos un turno y agregamos a los trabajadores
        Turno turno1 = new Turno();
        turno1.agregarTrabajador(trabajador1);
        turno1.agregarTrabajador(trabajador2);
        turno1.agregarTrabajador(trabajador3);

        // Calculamos el sueldo semanal de los trabajadores en el turno
        double sueldoSemanal = turno1.calcularSueldoSemanalTrabajadores();
        System.out.println("Sueldo semanal de los trabajadores en el turno: " + sueldoSemanal);

        // Buscar un trabajador por su RUT
        String rutBusqueda = "98765432-1";
        Trabajador trabajadorEncontrado = turno1.buscarTrabajadorPorRut(rutBusqueda);
        if (trabajadorEncontrado != null) {
            System.out.println("Trabajador encontrado: " + trabajadorEncontrado.getNombre());
            System.out.println("Asignación de trabajo: " + trabajadorEncontrado.getAsignacionTrabajo());
        } else {
            System.out.println("No se encontró ningún trabajador con el RUT: " + rutBusqueda);
        }

        // Eliminamos un trabajador del turno
        turno1.eliminarTrabajador(trabajador3);
        System.out.println("Trabajador eliminado del turno");

        // Calculamos el sueldo semanal de los trabajadores restantes en el turno
        sueldoSemanal = turno1.calcularSueldoSemanalTrabajadores();
        System.out.println("Sueldo semanal de los trabajadores restantes en el turno: " + sueldoSemanal);
    }
}
