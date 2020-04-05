
package Controlador;

import Modelo.Equipo;
import Modelo.Estado;
import Modelo.Item;
import Modelo.Proyecto;
import Modelo.TipoItem;
import Modelo.Usuario;
import java.util.*;
//Esta clase genera algunos valores aleatorios para que funcione el programa.
 public class ClaseControl{
    
    List<Item> items = new ArrayList();
    List<Usuario> usuarios = new ArrayList();
    List<TipoItem> tipoItems = new ArrayList();
    List<Equipo> equipos = new ArrayList();
    private Usuario usuarioActivo;

    public Usuario getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(Usuario usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }
    
    public ClaseControl(){
        
        //Equipos
        Proyecto proyecto    = new Proyecto("Proyecto nacion");
        Equipo equipo        = new Equipo("Desarrollo", proyecto);
        Equipo equipo1       = new Equipo("Testing", proyecto);
        Equipo equipo2       = new Equipo("Validacion", proyecto);
        
        //Usuarios
        Usuario responsable  = new Usuario("sebastian", "123", proyecto, equipo, "Responsable Item");
        Usuario responsable2 = new Usuario("violeta", "123", proyecto, equipo, "Lider");
        
        //Tipo items
        TipoItem tipoItem    = new TipoItem("Reporte de bug");
        
        Estado st1 =   new Estado("Creado", responsable, new Date(21/03/2020));
        Estado st2 =   new Estado("Desarrollo", responsable, new Date(21/03/2020));
        Estado st3 =   new Estado("Validacion", responsable, new Date(01/01/2000));
        Estado st4 =   new Estado("Terminado", responsable, new Date(01/01/2000));
        
        st1.agregarEstado(st2);
        st2.agregarEstado(st3);
        st3.agregarEstado(st2);
        st3.agregarEstado(st4);
        
        tipoItem.agregarEstado(st1);
        tipoItem.agregarEstado(st2);
        tipoItem.agregarEstado(st3);
        tipoItem.agregarEstado(st4);
        
        TipoItem tipoItem1    = new TipoItem("Nuevo requerimiento");
        
        Estado st10 =   new Estado("Analisis", responsable, new Date(21/03/2020));
        Estado st11 =   new Estado("Diseño", responsable, new Date(21/03/2020));
        Estado st12 =   new Estado("Implementacion", responsable, new Date(01/01/2000));
        Estado st13 =   new Estado("Prueba", responsable, new Date(01/01/2000));
        Estado st14 =   new Estado("Ejecucion", responsable, new Date(01/01/2000));
        
        st10.agregarEstado(st11);
        st11.agregarEstado(st12);
        st12.agregarEstado(st13);
        st13.agregarEstado(st14);
        st13.agregarEstado(st11);
        
        tipoItem1.agregarEstado(st10);
        tipoItem1.agregarEstado(st11);
        tipoItem1.agregarEstado(st12);
        tipoItem1.agregarEstado(st13);
        tipoItem1.agregarEstado(st14);
        
        Item item1 = new Item("Bug en control", 1, tipoItem, st1, responsable);
        Item item2 = new Item("Crear pantalla ", 1, tipoItem1, st10, responsable);
        
        items.add(item1);
        items.add(item2);
        this.tipoItems.add(tipoItem);
        this.tipoItems.add(tipoItem1);
        usuarios.add(responsable);
        usuarios.add(responsable2);
        
        equipos.add(equipo);
        equipos.add(equipo1);
        equipos.add(equipo2);
    }

    public List<Item> getItems() {
        return items;
    }
    
    public Usuario buscarUsuario(String nombre) {
        //Recorro la lista de usuarios buscandolo. Si se encuentra devuelvo el usuario.
        Boolean existe = false;
        Usuario usuarioAuxiliar = null;
        for(Usuario usuario: this.usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                existe = true;
                usuarioAuxiliar = usuario;
            }  
        }
        return usuarioAuxiliar;
    }
    
    public Item buscarItem(String nombre) {
        //Recorro la lista de items buscando el que tenga el mismo nombre.
        Item itemAuxiliar = null;
        for(Item item: this.items) {
            if (item.getNombre().equals(nombre)) {
                itemAuxiliar = item;
            }  
        }
        return itemAuxiliar;
    }
    
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public List<TipoItem> getTipoItems() {
        return tipoItems;
    }
    
    public void setItem(Item item1) {
        this.items.add(item1);
    }
    
    public TipoItem buscarTipo(String nombre) {
        //Recorro la lista de tipo de items buscando el tipo. Si se encuentra devuelvo el objeto tipo.
        TipoItem tipoAuxiliar = null;
        for(TipoItem tipo: this.tipoItems) {
             System.out.println(tipo.getNombre() + " == " + nombre );
            if (tipo.getNombre().equals(nombre)) {  
                tipoAuxiliar = tipo;
            }  
        }
        return tipoAuxiliar;
    }
    
    public Estado buscarEstado(String nombre, Item item) {
         //Recorro la lista de estados buscando el estado que tenga el mismo nombre. Si se encuentra devuelvo el objeto tipo.
        Estado estadoAuxiliar = null;
        List<TipoItem> tipos;
        tipos = tipoItems;
        TipoItem eltipo = buscarTipo(item.getTipo().getNombre());
        List<Estado> estadosPosibles = eltipo.getSecuencia();
        for(Estado estado: estadosPosibles) {
            System.out.println(estado.getNombre() + " == " + nombre );
            if (estado.getNombre().equals(nombre)) {  
                estadoAuxiliar = estado;
            }
        }
        return estadoAuxiliar;
    }
    public void setEquipo(Equipo e) {
        this.equipos.add(e);
    }
    public Equipo buscarEquipo(String nombre){
        //Recorro la lista de equipo. Si se encuentra devuelvo el objeto equipo
        Equipo equipoAux = null;
        for(Equipo equipo: this.equipos) {
             System.out.println(equipo.getNombre() + " == " + nombre );
            if (equipo.getNombre().equals(nombre)) {  
                equipoAux = equipo;
            }  
        }
        return equipoAux;
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }
    
    public void setUsuario(Usuario us) {
        this.usuarios.add(us);
    }
    
    public void setTipoItem(TipoItem tipo) {
        this.tipoItems.add(tipo);
    }
 }
   