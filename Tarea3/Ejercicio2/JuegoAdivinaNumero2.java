package Practicas;
import java.util.Scanner;
import java.util.Random;
public class JuegoAdivinaNumero2 extends Juego {
    protected int numeroAAdivinar;
    public JuegoAdivinaNumero2(int vidas) {
        super(vidas);
    }
    public boolean validaNumero(int num) {
        return num >= 0 && num <= 10;
    }
    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = new Random().nextInt(11);
        Scanner scanner = new Scanner(System.in);
        while (numeroDeVidas > 0) {
            System.out.print("Introduce un número: ");
            int intento = scanner.nextInt();

            if (!validaNumero(intento)) {
                System.out.println("Número inválido. Debe estar entre 0 y 10.");
                continue;
            }
            if (intento == numeroAAdivinar) {
                System.out.println("¡Correcto! Has adivinado el número.");
                actualizaRecord();
                return;
            } else {
                boolean quedanVidas = quitaVida();
                if (!quedanVidas) {
                    System.out.println("Has perdido. El número era: " + numeroAAdivinar);
                    return;
                } else {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número a adivinar es mayor.");
                    } else {
                        System.out.println("El número a adivinar es menor.");
                    }}}}}}
              
