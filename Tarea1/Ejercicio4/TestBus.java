package Auxiliatura;
public class TestBus {
	    public static void main(String[] args) {
	        Bus bus = new Bus(40);
	        System.out.println("DATOS INICIALES");
	        bus.mostrarDatos();
	        System.out.println("\nSUBIR PASAJEROS");
	        bus.subirPasajeros(15);
	        System.out.println("\nCOBRAR PASAJES");
	        bus.cobrarPasaje();
	        bus.mostrarAsientosDisponibles();
	        System.out.println("\nSUBIR MÁS PASAJEROS");
	        bus.subirPasajeros(10);
	        System.out.println("\nCOBRAR PASAJES");
	        bus.cobrarPasaje();
	        System.out.println("\nDATOS FINALES");
	        bus.mostrarDatos();
	        bus.mostrarAsientosDisponibles();
	    }
	}

