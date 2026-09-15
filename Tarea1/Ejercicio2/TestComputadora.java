package Auxiliatura;
public class TestComputadora {
	    public static void main(String[] args) {
	        Computadora computadora1 = new Computadora();
	        computadora1.setMarca("HP");
	        computadora1.setProcesador("Intel Core i5");
	        computadora1.setRam(8);
	        computadora1.setAlmacenamiento(512);
	        Computadora computadora2 = new Computadora("Lenovo", "AMD Ryzen 5", 16, 1000);
	        System.out.println("COMPUTADORA 1");
	        computadora1.mostrarDatos();
	        System.out.println("\nCOMPUTADORA 2");
	        computadora2.mostrarDatos();
	        int x = 16;
	        System.out.println("\nCOMPARACIÓN DE RAM");
	        if (computadora1.ramEsIgual(x)) {
	            System.out.println("La computadora 1 tiene " + x + " GB de RAM.");
	        } else {
	            System.out.println("La computadora 1 NO tiene " + x + " GB de RAM.");
	        }

	        if (computadora2.ramEsIgual(x)) {
	            System.out.println("La computadora 2 tiene " + x + " GB de RAM.");
	        } else {
	            System.out.println("La computadora 2 NO tiene " + x + " GB de RAM.");
	        }
	        System.out.println("\nMAYOR ALMACENAMIENTO");

	        if (computadora1.getAlmacenamiento() >
	                computadora2.getAlmacenamiento()) {

	            System.out.println("La computadora 1 tiene mayor almacenamiento.");
	            computadora1.mostrarDatos();

	        } else if (computadora2.getAlmacenamiento() >
	                computadora1.getAlmacenamiento()) {

	            System.out.println("La computadora 2 tiene mayor almacenamiento.");
	            computadora2.mostrarDatos();

	        } else {
	            System.out.println("Ambas computadoras tienen el mismo almacenamiento.");
	        }
	    }
	}

