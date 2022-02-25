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
public class Planetas {
    private String Nombre;
    private int Temperatura;
    private int Tamaño;
    private boolean Agua;

    public Planetas(String Nombre, int Temperatura, int Tamaño, boolean Agua) {
        this.Nombre = Nombre;
        this.Temperatura = Temperatura;
        this.Tamaño = Tamaño;
        this.Agua = Agua;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(int Temperatura) {
        this.Temperatura = Temperatura;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public boolean isAgua() {
        return Agua;
    }

    public void setAgua(boolean Agua) {
        this.Agua = Agua;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
