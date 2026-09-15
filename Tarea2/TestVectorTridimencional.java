package Practicas;
public class TestVectorTridimencional {
public static void main(String[] args) {
    VectorTridimencional v1 = new VectorTridimencional(1, 0, 0);
    VectorTridimencional v2 = new VectorTridimencional(0, 1, 0);
    VectorTridimencional v3 = new VectorTridimencional(2, 3, 4);
    System.out.println("v1 = " + v1);
    System.out.println("v2 = " + v2);
    System.out.println("v3 = " + v3);
    VectorTridimencional suma = v1.sumar(v2);
    System.out.println("v1 + v2 = " + suma);
    VectorTridimencional escalado = v3.multiplicarEscalar(2);
    System.out.println("2 * v3 = " + escalado);
    System.out.println("|v3| = " + v3.longitud());
    VectorTridimencional unitario = v3.normalizar();
    System.out.println("Unitario de v3 = " + unitario);
    System.out.println("Longitud del unitario = " + unitario.longitud());
    double pe = v1.productoEscalar(v2);
    System.out.println("v1 · v2 = " + pe);
    VectorTridimencional pv = v1.productoVectorial(v2);
    System.out.println("v1 × v2 = " + pv);
    System.out.println("v1 perpendicular a v2? " + v1.esPerpendicular(v2));
    System.out.println("v1 perpendicular a v3? " + v1.esPerpendicular(v3));
}
}
