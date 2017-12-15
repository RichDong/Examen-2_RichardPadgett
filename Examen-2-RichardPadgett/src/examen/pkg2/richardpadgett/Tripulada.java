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

    @Override
    public String toString() {
        return "Tripulada{" + "lugardedespegue=" + lugardedespegue + ", listastronautas=" + listastronautas + '}';
    }
    
}
