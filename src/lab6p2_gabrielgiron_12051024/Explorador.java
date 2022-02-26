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
public class Explorador extends Aliens{
    private Planetas PlanetaFavorito;
    private ArrayList<Planetas> PlanetasExplorados = new ArrayList();

    public Explorador(Planetas PlanetaFavorito, String Nombre, int Edad, boolean Amenaza, Raza raza) {
        super(Nombre, Edad, Amenaza, raza);
        this.PlanetaFavorito = PlanetaFavorito;
    }

    public Planetas getPlanetaFavorito() {
        return PlanetaFavorito;
    }

    public void setPlanetaFavorito(Planetas PlanetaFavorito) {
        this.PlanetaFavorito = PlanetaFavorito;
    }

    public ArrayList<Planetas> getPlanetasExplorados() {
        return PlanetasExplorados;
    }

    public void setPlanetasExplorados(ArrayList<Planetas> PlanetasExplorados) {
        this.PlanetasExplorados = PlanetasExplorados;
    }


    
}
