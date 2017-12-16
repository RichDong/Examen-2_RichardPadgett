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

    public Tripulada(String lugardedespegue, int nserie, Planetas destiny, double velocidad) {
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

    public double[] calcularTiempo() {
        double tida;
        double tvuelta;
        double[] conjunto=new double[2];
        double suma = 0;
        for (int i = 0; i < listastronautas.size(); i++) {
           suma+= listastronautas.get(i).getPeso();
        }
        tida = destiny.getDistanciaT()/super.getVelocidad()*suma*suma/100;
        tvuelta = destiny.getDistanciaT()/super.getVelocidad()*suma/100;
        
        conjunto[0]=tida;
        conjunto[1]=tvuelta;
        return conjunto;
    }


}
