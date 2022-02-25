/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_gabrielgiron_12051024;

/**
 *
 * @author Galex
 */
public class Aliens {
    private String Nombre;
    private int Edad;
    private boolean Amenaza;
    private Raza raza;

    public Aliens(String Nombre, int Edad, boolean Amenaza, Raza raza) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Amenaza = Amenaza;
        this.raza = raza;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public boolean isAmenaza() {
        return Amenaza;
    }

    public void setAmenaza(boolean Amenaza) {
        this.Amenaza = Amenaza;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Aliens{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Amenaza=" + Amenaza + ", raza=" + raza + '}';
    }
    
}
