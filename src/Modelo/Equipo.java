package Modelo;


public class Equipo {
    
    private String nombre;
    private Proyecto proyecto;
    
    public Equipo (String nombre, Proyecto p){
        this.nombre = nombre;
        this.proyecto = p;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
