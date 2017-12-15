
package examen.pkg2.richardpadgett;


public class Planetas {
    String nombre;
    double temperaturamedia;
    String tiposuper;
    double distanciaT;
    boolean anillos;

    public Planetas() {
    }

    public Planetas(String nombre, double temperaturamedia, String tiposuper, double distanciaT, boolean anillos) {
        this.nombre = nombre;
        this.temperaturamedia = temperaturamedia;
        this.tiposuper = tiposuper;
        this.distanciaT = distanciaT;
        this.anillos = anillos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTemperaturamedia() {
        return temperaturamedia;
    }

    public void setTemperaturamedia(double temperaturamedia) {
        this.temperaturamedia = temperaturamedia;
    }

    public String getTiposuper() {
        return tiposuper;
    }

    public void setTiposuper(String tiposuper) {
        this.tiposuper = tiposuper;
    }

    public double getDistanciaT() {
        return distanciaT;
    }

    public void setDistanciaT(double distanciaT) {
        this.distanciaT = distanciaT;
    }

    public boolean isAnillos() {
        return anillos;
    }

    public void setAnillos(boolean anillos) {
        this.anillos = anillos;
    }

    @Override
    public String toString() {
        return "Planetas{" + "nombre=" + nombre + ", temperaturamedia=" + temperaturamedia + ", tiposuper=" + tiposuper + ", distanciaT=" + distanciaT + ", anillos=" + anillos + '}';
    }
    
}
