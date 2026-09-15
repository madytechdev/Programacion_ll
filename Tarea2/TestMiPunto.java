package Practicas;
public class TestMiPunto {
    public static void main(String[] args) {
        MiPunto p1 = new MiPunto(0,0);            
        MiPunto p2 = new MiPunto(10, 30.5);       
        double distancia1 = p1.distancia(p2);
        System.out.println("Distancia de p1 a p2: " + distancia1);
        double distancia2 = p1.distancia(10, 30.5);
        System.out.println("Distancia de (0,0) a (10,30.5): " + distancia2);
    }
}
