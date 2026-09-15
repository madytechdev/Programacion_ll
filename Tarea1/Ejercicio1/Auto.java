package Auxiliatura;
public class Auto {
    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;
    private String color;
    public Auto(String marca, String modelo, int anio, int kilometraje, String color, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
        this.color = color;
    }
    public void Kilometraje() {
        int kilometros = kilometraje;
        int metros = kilometraje * 1000;

        System.out.println("Kilometraje: " + kilometros + " km");
        System.out.println("Kilometraje: " + metros + " metros");
    }
    public void Color(String nuevoColor) {
        color = nuevoColor;
    }
    public void Datos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Color: " + color);
    }
}
