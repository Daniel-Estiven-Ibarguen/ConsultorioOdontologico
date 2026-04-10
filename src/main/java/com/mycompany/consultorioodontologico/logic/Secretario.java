
package com.mycompany.consultorioodontologico.logic;

import java.util.Date;

public class Secretario extends Persona{
    
    private int id_secretario;
    private String sector;
    private Usuario un_usuario;

    public Secretario() {
    }

    public Secretario(int id_secretario, String sector, Usuario un_usuario, String cedula, String nombre, String apellido, String telefono, String direccion, Date fecha_nacimiento) {
        super(cedula, nombre, apellido, telefono, direccion, fecha_nacimiento);
        this.id_secretario = id_secretario;
        this.sector = sector;
        this.un_usuario = un_usuario;
    }

    public int getId_secretario() {
        return id_secretario;
    }

    public void setId_secretario(int id_secretario) {
        this.id_secretario = id_secretario;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Usuario getUn_usuario() {
        return un_usuario;
    }

    public void setUn_usuario(Usuario un_usuario) {
        this.un_usuario = un_usuario;
    }
    
    
}
