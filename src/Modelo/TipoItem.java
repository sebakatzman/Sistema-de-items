package Modelo;

import java.util.*;

public class TipoItem {
    
    private String nombre;
    private List<Estado> secuencia = new ArrayList();
    
    public TipoItem(String nombre, List<Estado> secue) {
        this.nombre = nombre;
        this.secuencia = secue;
    }

    public TipoItem(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarEstado(Estado e) {
        this.secuencia.add(e);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estado> getSecuencia() {
        return secuencia;
    }
    
    public Estado getPrimerEstado(){
        Estado estado;
        estado = secuencia.get(0);
        return estado;
    }
    
    public void setSecuencia(List<Estado> secuencia) {
        this.secuencia = secuencia;
    }
    
}
