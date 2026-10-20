package Practicas;
public class Juego2 {
    public int numeroDeVidas;
    public int record;
    public Juego2(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }
    public void reiniciaPartida() {
        System.out.println("Reiniciando partida...");
    }
    public void actualizaRecord() {
        record++;
        System.out.println("¡Nuevo récord!");
    }
    public boolean quitaVida() {
        numeroDeVidas--;
        if (numeroDeVidas > 0) {
            System.out.println("Te quedan " + numeroDeVidas + " vidas.");
            return true;
        } else {
            System.out.println("¡Has perdido todas tus vidas!");
            return false;
        }
    }
}

