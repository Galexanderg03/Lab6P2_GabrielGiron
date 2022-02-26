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
public class Cazador extends Aliens{
    private int HumanosAtrapados;

    public Cazador(int HumanosAtrapados, String Nombre, int Edad, boolean Amenaza, Raza raza) {
        super(Nombre, Edad, Amenaza, raza);
        this.HumanosAtrapados = HumanosAtrapados;
    }

    public int getHumanosAtrapados() {
        return HumanosAtrapados;
    }

    public void setHumanosAtrapados(int HumanosAtrapados) {
        this.HumanosAtrapados = HumanosAtrapados;
    }

    
}
