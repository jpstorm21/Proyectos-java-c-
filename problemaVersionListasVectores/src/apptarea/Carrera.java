/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apptarea;

/**
 *
 * @author Victor Huerta
 */
public class Carrera {
    private int codigo;
    private String nombre;
    private ListaAsignaturas la;

    public Carrera(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        la = new ListaAsignaturas(1000);
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaAsignaturas getLa() {
        return la;
    }

    public void setLa(ListaAsignaturas la) {
        this.la = la;
    }
    
    
    
    
    
}
