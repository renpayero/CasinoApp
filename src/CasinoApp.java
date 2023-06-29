import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CasinoApp {
    private static List<Trabajador> trabajadores = new ArrayList<>();
    private static Turno turno = new Turno();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    agregarTrabajador(scanner);
                    break;
                case 2:
                    modificarTrabajador(scanner);
                    break;
                case 3:
                    eliminarTrabajador(scanner);
                    break;
                case 4:
                    agregarTrabajadorTurno(scanner);
                    break;
                case 5:
                    eliminarTrabajadorTurno(scanner);
                    break;
                case 6:
                    buscarTrabajadorPorRut(scanner);
                    break;
                case 7:
                    calcularSueldoSemanalTrabajadores();
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
                    break;
            }
        } while (opcion != 8);
    }

    private static void mostrarMenu() {
        System.out.println("---- Menú ----");
        System.out.println("1. Agregar trabajador");
        System.out.println("2. Modificar trabajador");
        System.out.println("3. Eliminar trabajador");
        System.out.println("4. Agregar trabajador a un turno");
        System.out.println("5. Eliminar trabajador de un turno");
        System.out.println("6. Buscar trabajador por RUT");
        System.out.println("7. Calcular sueldo semanal de los trabajadores");
        System.out.println("8. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private static void agregarTrabajador(Scanner scanner) {
        System.out.println("---- Agregar Trabajador ----");
        System.out.print("RUT: ");
        String rut = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("Valor Hora: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Horas Extras: ");
        int horasExtras = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea
        System.out.print("Asignación de Trabajo: ");
        String asignacionTrabajo = scanner.nextLine();
        System.out.print("Tipo de trabajador (Cocinero, Garzon, TrabajadorCaja, TrabajadorLimpieza): ");
        String tipoTrabajador = scanner.nextLine();

        Trabajador trabajador = crearTrabajador(rut, nombre, direccion, telefono, valorHora, horasExtras, asignacionTrabajo, tipoTrabajador);
        if (trabajador != null) {
            trabajadores.add(trabajador);
            System.out.println("Trabajador agregado exitosamente.");
        } else {
            System.out.println("Tipo de trabajador inválido.");
        }
    }

    private static void modificarTrabajador(Scanner scanner) {
        System.out.println("---- Modificar Trabajador ----");
        System.out.print("Ingrese el RUT del trabajador: ");
        String rut = scanner.nextLine();
        Trabajador trabajador = buscarTrabajadorPorRut(rut);

        if (trabajador != null) {
            System.out.println("Trabajador encontrado: " + trabajador.toString());
            System.out.println("Seleccione qué desea modificar:");
            System.out.println("1. Valor Hora");
            System.out.println("2. Horas Extras");
            System.out.println("3. Asignación de Trabajo");
            System.out.println("4. Dirección");
            System.out.println("5. Teléfono");
            System.out.println("6. Cancelar");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Nuevo Valor Hora: ");
                    double nuevoValorHora = scanner.nextDouble();
                    trabajador.setValorHora(nuevoValorHora);
                    System.out.println("Valor Hora modificado exitosamente.");
                    break;
                case 2:
                    System.out.print("Nuevas Horas Extras: ");
                    int nuevasHorasExtras = scanner.nextInt();
                    trabajador.setHorasExtras(nuevasHorasExtras);
                    System.out.println("Horas Extras modificadas exitosamente.");
                    break;
                case 3:
                    System.out.print("Nueva Asignación de Trabajo: ");
                    String nuevaAsignacionTrabajo = scanner.nextLine();
                    trabajador.setAsignacionTrabajo(nuevaAsignacionTrabajo);
                    System.out.println("Asignación de Trabajo modificada exitosamente.");
                    break;
                case 4:
                    System.out.print("Nueva Dirección: ");
                    String nuevaDireccion = scanner.nextLine();
                    trabajador.setDireccion(nuevaDireccion);
                    System.out.println("Dirección modificada exitosamente.");
                    break;
                case 5:
                    System.out.print("Nuevo Teléfono: ");
                    String nuevoTelefono = scanner.nextLine();
                    trabajador.setTelefono(nuevoTelefono);
                    System.out.println("Teléfono modificado exitosamente.");
                    break;
                case 6:
                    System.out.println("Cancelando modificación...");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } else {
            System.out.println("Trabajador no encontrado.");
        }
    }

    private static void eliminarTrabajador(Scanner scanner) {
        System.out.println("---- Eliminar Trabajador ----");
        System.out.print("Ingrese el RUT del trabajador: ");
        String rut = scanner.nextLine();
        Trabajador trabajador = buscarTrabajadorPorRut(rut);

        if (trabajador != null) {
            trabajadores.remove(trabajador);
            System.out.println("Trabajador eliminado exitosamente.");
        } else {
            System.out.println("Trabajador no encontrado.");
        }
    }

    private static void agregarTrabajadorTurno(Scanner scanner) {
        System.out.println("---- Agregar Trabajador a un Turno ----");
        System.out.print("Ingrese el RUT del trabajador: ");
        String rut = scanner.nextLine();
        Trabajador trabajador = buscarTrabajadorPorRut(rut);

        if (trabajador != null) {
            turno.agregarTrabajador(trabajador);
            System.out.println("Trabajador agregado al turno exitosamente.");
        } else {
            System.out.println("Trabajador no encontrado.");
        }
    }

    private static void eliminarTrabajadorTurno(Scanner scanner) {
        System.out.println("---- Eliminar Trabajador de un Turno ----");
        System.out.print("Ingrese el RUT del trabajador: ");
        String rut = scanner.nextLine();
        Trabajador trabajador = buscarTrabajadorPorRut(rut);

        if (trabajador != null) {
            turno.eliminarTrabajador(trabajador);
            System.out.println("Trabajador eliminado del turno exitosamente.");
        } else {
            System.out.println("Trabajador no encontrado.");
        }
    }

    private static void buscarTrabajadorPorRut(Scanner scanner) {
        System.out.println("---- Buscar Trabajador por RUT ----");
        System.out.print("Ingrese el RUT del trabajador: ");
        String rut = scanner.nextLine();
        Trabajador trabajador = buscarTrabajadorPorRut(rut);

        if (trabajador != null) {
            System.out.println(trabajador.toString());
        } else {
            System.out.println("Trabajador no encontrado.");
        }
    }

    private static Trabajador buscarTrabajadorPorRut(String rut) {
        for (Trabajador trabajador : trabajadores) {
            if (trabajador.getRut().equals(rut)) {
                System.out.println("Nombre: " + trabajador.getNombre());
                System.out.println("Rut: " + trabajador.getRut());
                System.out.println("Direccion: " + trabajador.getDireccion());
                System.out.println("Telefono: " + trabajador.getTelefono());
                System.out.println("Valor Hora: " + trabajador.getValorHora());
                System.out.println("Horas extras: " + trabajador.getHorasExtras());
                System.out.println("Trabajo: " + trabajador.getAsignacionTrabajo());
                System.out.println("ID Trabajador: ");
                return trabajador;
            }
        }
        return null;
    }

    private static Trabajador crearTrabajador(String rut, String nombre, String direccion, String telefono, double valorHora, int horasExtras, String asignacionTrabajo, String tipoTrabajador) {
        switch (tipoTrabajador) {
            case "Cocinero":
                return new Cocinero(rut, nombre, direccion, telefono, valorHora, horasExtras, asignacionTrabajo);
            case "Garzon":
                return new Garzon(rut, nombre, direccion, telefono, valorHora, horasExtras, asignacionTrabajo, valorHora, valorHora);
            case "TrabajadorCaja":
                return new TrabajadorCaja(rut, nombre, direccion, telefono, valorHora, horasExtras, asignacionTrabajo, valorHora, valorHora);
            case "TrabajadorLimpieza":
                return new TrabajadorLimpieza(rut, nombre, direccion, telefono, valorHora, horasExtras, asignacionTrabajo);
            default:
                return null;
        }
    }

    private static void calcularSueldoSemanalTrabajadores() {
        double sueldoTotal = turno.calcularSueldoSemanalTrabajadores();
        System.out.println("El sueldo total semanal de los trabajadores es: $" + sueldoTotal);
    }
}
