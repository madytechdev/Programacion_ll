package Practicas;
import java.util.Scanner;
import java.util.Random;
public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = new Random().nextInt(11);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Adivina un número entre el 0 y el 10: ");
            int intento = scanner.nextInt();
            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!!");
                actualizaRecord();
                break;
            } else {
                boolean quedanVidas = quitaVida();
                if (!quedanVidas) {
                    System.out.println("Has perdido 😢.... El número era: " + numeroAAdivinar);
                    break;
                } else {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El número a adivinar es mayor");
                    } else {
                        System.out.println("El número a adivinar es menor");
                    }
                }
            }
        }
    }
}
    

