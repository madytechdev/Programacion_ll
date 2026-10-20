package Practicas;
public class JuegoAdivinaPar extends JuegoAdivinaNumero2 {
    public JuegoAdivinaPar(int vidas) {
        super(vidas);
    }
    @Override
    public boolean validaNumero(int num) {
        if (num < 0 || num > 10) {
            return false;
        }
        if (num % 2 != 0) {
            System.out.println("Error: El número debe ser par.");
            return false;
        }
        return true;
    }
    @Override
    public void juega() {
        System.out.println("\n--- Juego de adivinar número PAR entre 0 y 10 "
        		+ "(Tienes " + numeroDeVidas + " vidas) ---");
        super.juega();
    }
}
