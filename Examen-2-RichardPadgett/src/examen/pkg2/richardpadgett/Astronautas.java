
package examen.pkg2.richardpadgett;


public class Astronautas {
 String nombre;
 String nacionalidad;
 int sueldo;
 int experiencia;
 String sexo;
 double peso;

    public Astronautas() {
    }

    public Astronautas(String nombre, String nacionalidad, int sueldo, int experiencia, String sexo, double peso) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.sueldo = sueldo;
        this.experiencia = experiencia;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "Nacionalidad: " + nacionalidad + "Sueldo: " + sueldo + "Experiencia: " + experiencia + "Sexo: " + sexo + "Peso: " + peso;
    }
 
}
