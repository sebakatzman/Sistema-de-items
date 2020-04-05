
import java.util.List;

public class Item {
    
    private String nombre;
    private String prioridad;
    public TipoItem tipo;
    public Estado estado;
    public List secuencia;

    
    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public TipoItem getTipo() {
        return tipo;
    }

    public void setTipo(TipoItem tipo) {
        this.tipo = tipo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(List secuencia) {
        this.secuencia = secuencia;
    }
    
    
}
