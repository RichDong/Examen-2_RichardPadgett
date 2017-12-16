
package examen.pkg2.richardpadgett;


public abstract class Naves {
    int nserie;
    Planetas destiny;
    double velocidad;

    public Naves() {
    }

    public Naves(int nserie, Planetas destiny, double velocidad) {
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

    public Planetas getDestiny() {
        return destiny;
    }

    public void setDestiny(Planetas destiny) {
        this.destiny = destiny;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public abstract double[] calcularTiempo();
       
   
    @Override
    public String toString() {
        return"NS:" + nserie ;
    }
    
    
    
}
