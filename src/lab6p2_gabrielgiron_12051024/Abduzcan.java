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
public class Abduzcan extends Aliens{
    private int AnimalesAbducidos;

    public Abduzcan(int AnimalesAbducidos, String Nombre, int Edad, boolean Amenaza, Raza raza) {
        super(Nombre, Edad, Amenaza, raza);
        this.AnimalesAbducidos = AnimalesAbducidos;
    }

    public int getAnimalesAbducidos() {
        return AnimalesAbducidos;
    }

    public void setAnimalesAbducidos(int AnimalesAbducidos) {
        this.AnimalesAbducidos = AnimalesAbducidos;
    }
    
}
