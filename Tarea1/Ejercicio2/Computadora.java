package Auxiliatura;
public class Computadora {
	    private String marca;
	    private String procesador;
	    private int ram;
	    private int almacenamiento;
	    public Computadora() {
	    }
	    public Computadora(String marca, String procesador, int ram, int almacenamiento) {
	        this.marca = marca;
	        this.procesador = procesador;
	        this.ram = ram;
	        this.almacenamiento = almacenamiento;
	    }
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public void setProcesador(String procesador) {
	        this.procesador = procesador;
	    }

	    public void setRam(int ram) {
	        this.ram = ram;
	    }

	    public void setAlmacenamiento(int almacenamiento) {
	        this.almacenamiento = almacenamiento;
	    }
	    public boolean ramEsIgual(int x) {
	        return ram == x;
	    }
	    public void mostrarDatos() {
	        System.out.println("Marca: " + marca);
	        System.out.println("Procesador: " + procesador);
	        System.out.println("RAM: " + ram + " GB");
	        System.out.println("Almacenamiento: " + almacenamiento + " GB");
	    }
	    public int getAlmacenamiento() {
	        return almacenamiento;
	    }
	}

