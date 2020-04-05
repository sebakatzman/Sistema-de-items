package Modelo;

import java.util.*;
import javax.swing.JOptionPane;

public class Item {

    private String nombre;
    private int prioridad;
    public TipoItem tipo;
    public Estado estadoActual;
    public Usuario responsableActual;
    private List<Estado> historial = new ArrayList();
    private Proyecto proyecto;

    public List<Estado> getHistorial() {
        return historial;
    }

    public void setHistorial(List<Estado> historial) {
        this.historial = historial;
    }

    public Item(String nombre, int prioridad, TipoItem tipo, Estado estadoActual, Usuario responsable) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.tipo = tipo;
        this.estadoActual = estadoActual;
        this.responsableActual = responsable;
    }

    public Usuario getResponsable() {
        return responsableActual;
    }

    public Estado getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(Estado estadoActual) {
        this.estadoActual = estadoActual;
    }

    public Usuario getResponsableActual() {
        return responsableActual;
    }

    public void setResponsableActual(Usuario responsableActual) {
        this.responsableActual = responsableActual;
    }

    public Item(String nombre, int prioridad, TipoItem tipo, Estado estado, List<Estado> secuencia) {
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.tipo = tipo;
        this.estadoActual = estado;
        this.historial = secuencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public TipoItem getTipo() {
        return tipo;
    }

    public void setTipo(TipoItem tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
    
    public void agregarEstadoHistorial(Estado est) {
         
            this.historial.add(est);
           
    }
    
    public List<Estado> getEstadoHistorial(){
        return historial;
    }
}
