/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2.richardpadgett;

import java.util.ArrayList;

/**
 *
 * @author richa
 */
public class Tripulada extends Naves {

    String lugardedespegue;
    ArrayList<Astronautas> listastronautas = new ArrayList();

    public Tripulada() {
    }

    public Tripulada(String lugardedespegue) {
        this.lugardedespegue = lugardedespegue;
    }

    public Tripulada(String lugardedespegue, int nserie, String destiny, double velocidad) {
        super(nserie, destiny, velocidad);
        this.lugardedespegue = lugardedespegue;
    }

    public String getLugardedespegue() {
        return lugardedespegue;
    }

    public void setLugardedespegue(String lugardedespegue) {
        this.lugardedespegue = lugardedespegue;
    }

    public ArrayList<Astronautas> getListastronautas() {
        return listastronautas;
    }

    public void setListastronautas(ArrayList<Astronautas> listastronautas) {
        this.listastronautas = listastronautas;
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
    public void calcularTiempo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    

}
