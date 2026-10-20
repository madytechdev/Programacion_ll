package Practicas;
public class Juego {
    public int numeroDeVidas;
    public int record;
    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }
    public void reiniciaPartida() {
        System.out.println("Partida reiniciada");
    }
    public void actualizaRecord() {
        record++;
        System.out.println("¡Nuevo récord 😎! Puntos: " + record);
    }
    public boolean quitaVida() {
        numeroDeVidas--;
        if (numeroDeVidas > 0) {
            System.out.println("Te quedan " + numeroDeVidas + " vidas");
            return true;
        } else {
            System.out.println("No te quedan vidas 😭!");
            return false;
        }
    }
}
