package Auxiliatura;
public class Bus {
    private int capacidad;
    private int pasajeros;
    private double dineroRecaudado;
    public Bus(int capacidad) {
        this.capacidad = capacidad;
        this.pasajeros = 0;
        this.dineroRecaudado = 0;
    }
    public void subirPasajeros(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: Debe ser mayor a 0");
        } else if (pasajeros + cantidad > capacidad) {
            System.out.println("Error: Ya no hay asiento");
        } else {
            pasajeros = pasajeros + cantidad;
            System.out.println("Subieron " + cantidad + " pasajeros");
        }
    }
    public void cobrarPasaje() {
        double costo = 1.50;
        double total = pasajeros * costo;
        dineroRecaudado = dineroRecaudado + total;
        System.out.println("Se cobraron Bs.- " + total + " por los pasajes");
    }
    public void mostrarAsientosDisponibles() {
        int disponibles = capacidad-pasajeros;
        System.out.println("Asientos disponibles: " + disponibles);
    }
    public void mostrarDatos() {
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Pasajeros actuales: " + pasajeros);
        System.out.println("Dinero recaudado: Bs.- " + dineroRecaudado);
    }
}
