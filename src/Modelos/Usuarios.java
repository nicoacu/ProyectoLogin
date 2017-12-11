/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author User
 */
public class Usuarios {
    
    private int id;
    private String nombre;
    private String hash;
    private String usuario;
    private String apellido;
    
    public Usuarios() {
    }
    
    public Usuarios (String nombre, String hash, String usuario, String apellido){
        
        this.nombre = nombre;
        this.hash = hash;
        this.usuario = usuario;
        this.apellido = apellido;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
