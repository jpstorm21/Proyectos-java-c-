/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayu_5_2017;

/**
 *
 * @author Eduardo
 */
public class Perro extends Mascota{
    private String raza;
    
    public Perro(String raza, String apodo, int edad) {
        super(apodo,edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
}
