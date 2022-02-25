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
public class Raza {
    private Planetas PlanetaPrimordial;
    private String Nombre;

    public Raza(Planetas PlanetaPrimordial, String Nombre) {
        this.PlanetaPrimordial = PlanetaPrimordial;
        this.Nombre = Nombre;
    }

    public Planetas getPlanetaPrimordial() {
        return PlanetaPrimordial;
    }

    public void setPlanetaPrimordial(Planetas PlanetaPrimordial) {
        this.PlanetaPrimordial = PlanetaPrimordial;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
