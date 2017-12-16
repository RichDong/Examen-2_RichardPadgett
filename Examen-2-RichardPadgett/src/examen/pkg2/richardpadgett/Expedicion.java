
package examen.pkg2.richardpadgett;

/**
 *
 * @author richa
 */
public class Expedicion extends Thread {
    Naves naveexpeditora;
    Planetas destino;
    boolean avanzar;
    boolean vive;
    double ida;
    double vuelta;

    public Expedicion() {
    }

    public Expedicion(Naves naveexpeditora, Planetas destino, boolean avanzar, boolean vive, double ida, double vuelta) {
        this.naveexpeditora = naveexpeditora;
        this.destino = destino;
        this.avanzar = avanzar;
        this.vive = vive;
        this.ida = ida;
        this.vuelta = vuelta;
    }

    public Naves getNaveexpeditora() {
        return naveexpeditora;
    }

    public void setNaveexpeditora(Naves naveexpeditora) {
        this.naveexpeditora = naveexpeditora;
    }

    public Planetas getDestino() {
        return destino;
    }

    public void setDestino(Planetas destino) {
        this.destino = destino;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public double getIda() {
        return ida;
    }

    public void setIda(double ida) {
        this.ida = ida;
    }

    public double getVuelta() {
        return vuelta;
    }

    public void setVuelta(double vuelta) {
        this.vuelta = vuelta;
    }
    @Override
    public void run(){

    }
}
