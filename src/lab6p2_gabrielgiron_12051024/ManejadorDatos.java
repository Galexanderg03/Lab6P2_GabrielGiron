/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_gabrielgiron_12051024;

import java.util.ArrayList;

/**
 *
 * @author Galex
 */
public class ManejadorDatos {
    private ArrayList<Planetas> Planetas = new ArrayList();
    private ArrayList<Raza> Razas = new ArrayList();
    private ArrayList<Aliens> Aliens = new ArrayList();

    public ManejadorDatos() {
    }

    public ArrayList<Planetas> getPlanetas() {
        return Planetas;
    }

    public void setPlanetas(ArrayList<Planetas> Planetas) {
        this.Planetas = Planetas;
    }

    public ArrayList<Raza> getRazas() {
        return Razas;
    }

    public void setRazas(ArrayList<Raza> Razas) {
        this.Razas = Razas;
    }

    public ArrayList<Aliens> getAliens() {
        return Aliens;
    }

    public void setAliens(ArrayList<Aliens> Aliens) {
        this.Aliens = Aliens;
    }
    
    
}
