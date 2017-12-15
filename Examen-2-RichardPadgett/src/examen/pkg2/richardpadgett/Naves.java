
package examen.pkg2.richardpadgett;


public abstract class Naves {
    int nserie;
    String destiny;
    double velocidad;

    public Naves() {
    }

    public Naves(int nserie, String destiny, double velocidad) {
        this.nserie = nserie;
        this.destiny = destiny;
        this.velocidad = velocidad;
    }

    public int getNserie() {
        return nserie;
    }

    public void setNserie(int nserie) {
        this.nserie = nserie;
    }

    public String getDestiny() {
        return destiny;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public abstract void calcularTiempo();
       
   
    @Override
    public String toString() {
        return "Naves{" + "nserie=" + nserie + ", destiny=" + destiny + ", velocidad=" + velocidad + '}';
    }
    
    
    
}
