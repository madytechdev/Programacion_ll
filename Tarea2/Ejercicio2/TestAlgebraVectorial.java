package Practicas;
public class TestAlgebraVectorial {
    public static void main(String[] args) {
        AlgebraVectorial v1 = new AlgebraVectorial(1, 0, 0);
        AlgebraVectorial v2 = new AlgebraVectorial(0, 1, 0);
        AlgebraVectorial v3 = new AlgebraVectorial(2, 0, 0);
        AlgebraVectorial v4 = new AlgebraVectorial(4, 0, 0);
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);
        System.out.println("v4 = " + v4);
        System.out.println("\nv1 perpendicular a v2? (a·b=0): " + v1.perpendicularA(v1, v2));
        System.out.println("v1 perpendicular a v2? (|a+b|=|a-b|): " + v1.perpendicularB(v1, v2));
        System.out.println("v1 perpendicular a v2? (|a+b|² = |a|²+|b|²): " + v1.perpendicularC(v1, v2));
        System.out.println("\nv3 paralelo a v4? (a = r b): " + v1.paralelaE(v3, v4));
        System.out.println("v3 paralelo a v4? (a×b = 0): " + v1.paralelaF(v3, v4));
        System.out.println("v1 paralelo a v2? (a×b = 0): " + v1.paralelaF(v1, v2));
        AlgebraVectorial proy = v1.proyeccionG(v3, v1);
        System.out.println("\nProyección de v3 sobre v1: " + proy);
        double comp = v1.componenteH(v3, v1);
        System.out.println("Componente de v3 en v1: " + comp);
    }
}


