/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2.richardpadgett;

/**
 *
 * @author richa
 */
public class Sondas extends Naves {
    String materia;
    int peso;

    public Sondas() {
    }

    public Sondas(String materia, int peso) {
        this.materia = materia;
        this.peso = peso;
    }

    public Sondas(String materia, int peso, int nserie, String destiny, double velocidad) {
        super(nserie, destiny, velocidad);
        this.materia = materia;
        this.peso = peso;
    }
    
    

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
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
    

    

    @Override
    public String toString() {
        return "materia': " + materia + "peso: " + peso;
    }

    @Override
    public void calcularTiempo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
