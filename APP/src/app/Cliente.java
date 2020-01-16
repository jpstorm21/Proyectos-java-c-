
package app;


public class Cliente {
    private String rut;
    private String nombre;
    private ListaProductos listaProductos;

    public Cliente(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
        listaProductos = new ListaProductos();
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaProductos getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ListaProductos listaProductos) {
        this.listaProductos = listaProductos;
    }
    
    
}
