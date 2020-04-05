package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Estado {
    
    private String nombre;
    private Usuario responsableItem;
    private Date fecha;
    private List<Estado> transicion = new ArrayList();
    
    public Estado() {}
    
    public Estado(String nombre, Usuario responsableItem, Date fecha) {
        this.nombre = nombre;
        this.responsableItem = responsableItem;
        this.fecha = fecha;
    }
    
    public Usuario getResponsableItem() {
        return responsableItem;
    }

    public void setResponsableItem(Usuario responsableItem) {
        this.responsableItem = responsableItem;
    }

    public List<Estado> getTransicion() {
        return transicion;
    }

    public void setTransicion(List<Estado> transicion) {
        this.transicion = transicion;
    }
    
    public Usuario getResponsable() {
        return responsableItem;
    }

    public void setResponsable(Usuario responsable) {
        this.responsableItem = responsable;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Estado(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString() {
        return nombre;
    }
    
    public void agregarEstado(Estado e) {
        this.transicion.add(e);
    }
}
