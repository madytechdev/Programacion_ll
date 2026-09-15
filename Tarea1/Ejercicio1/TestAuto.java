package Auxiliatura;
public class TestAuto {
	    public static void main(String[] args) {
	        Auto auto1 = new Auto("Toyota", "Corolla", 2020, 50, "Rojo", 0);
	        Auto auto2 = new Auto("Ford", "Mustang", 2022, 120, "Negro", 0);
	        System.out.println("AUTO 1");
	        auto1.Datos();
	        auto1.Kilometraje();
	        auto1.Color("Azul");
	        System.out.println("\nDespués de cambiar el color:");
	        auto1.Datos();
	        System.out.println("\nAUTO 2");
	        auto2.Datos();
	        auto2.Kilometraje();
	        auto2.Color("Blanco");
	        System.out.println("\nDespués de cambiar el color:");
	        auto2.Datos();
	    }
	}

