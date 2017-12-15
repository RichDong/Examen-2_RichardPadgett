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

    @Override
    public String toString() {
        return "Sondas{" + "materia=" + materia + ", peso=" + peso + '}';
    }
    
}
