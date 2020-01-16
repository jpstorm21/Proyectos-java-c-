
package tareanodos;

public class Empleado {
    private String rut;
    private String nombre;
    private ListaTelefonos lt;
    
    public Empleado(String rut, String nombre){
        this.nombre = nombre;
        this.rut = rut;
        lt = new ListaTelefonos();
       
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

    public ListaTelefonos getLt() {
        return lt;
    }

    public void setLt(ListaTelefonos lt) {
        this.lt = lt;
    }
    

    
}
