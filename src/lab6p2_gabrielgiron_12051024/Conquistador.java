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
public class Conquistador extends Aliens{
    private ArrayList<Planetas> PlanetasConquistados = new ArrayList();

    public Conquistador(String Nombre, int Edad, boolean Amenaza, Raza raza) {
        super(Nombre, Edad, Amenaza, raza);
    }

    public ArrayList<Planetas> getPlanetasConquistados() {
        return PlanetasConquistados;
    }

    public void setPlanetasConquistados(ArrayList<Planetas> PlanetasConquistados) {
        this.PlanetasConquistados = PlanetasConquistados;
    }
    
}
