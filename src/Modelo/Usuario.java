package Modelo;


import Modelo.Equipo;
import java.util.Objects;


public class Usuario {
    
    private String nombre;
    private String contraseña;
    private Proyecto proyecto;
    private Equipo equipo;
    private String tipoUsuario;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    
    public Usuario(String nombre, String contraseña, Proyecto proyecto, Equipo equipo, String us) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.proyecto = proyecto;
        this.equipo = equipo;
        this.tipoUsuario = us;
    }
    
     public Usuario(String nombre, String contraseña, String us, Equipo e) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipoUsuario = us;
        this.equipo = e;
    }
     
    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    public boolean cambiarContrasenia(String pw) {
        System.out.println(pw + this.contraseña);
        return pw.equals(this.contraseña);
    }
    
}
