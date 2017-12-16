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

    public Sondas(String materia, int peso, int nserie, Planetas destiny, double velocidad) {
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

    public Planetas  getDestiny() {
        return destiny;
    }

    public void setDestiny(Planetas  destiny) {
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
        return "Materia: " + materia + "Numero de Serie: "+nserie;
    }
    
     public double[] calcularTiempo() {
        double tida;
        double tvuelta;
        double[] conjunto=null;
        double suma = 0;
        
        tida = destiny.getDistanciaT()/super.getVelocidad();
        tvuelta = 9.8*super.getVelocidad();
        
        conjunto[0]=tida;
        conjunto[1]=tvuelta;
        return conjunto;
    }
    
}
