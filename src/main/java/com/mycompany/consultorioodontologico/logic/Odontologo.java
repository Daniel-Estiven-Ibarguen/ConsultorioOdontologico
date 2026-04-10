
package com.mycompany.consultorioodontologico.logic;

import java.util.Date;
import java.util.List;


public class Odontologo extends Persona{
    
    private int id_odontologo;
    private String especialidad;
    private List<Turno> listaTurnos;
    private Usuario un_usuario;
    private Horario un_horario;

    public Odontologo() {
    }

    public Odontologo(int id_odontologo, String especialidad, List<Turno> listaTurnos, Usuario un_usuario, Horario un_horario, String cedula, String nombre, String apellido, String telefono, String direccion, Date fecha_nacimiento) {
        super(cedula, nombre, apellido, telefono, direccion, fecha_nacimiento);
        this.id_odontologo = id_odontologo;
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.un_usuario = un_usuario;
        this.un_horario = un_horario;
    }

    public int getId_odontologo() {
        return id_odontologo;
    }

    public void setId_odontologo(int id_odontologo) {
        this.id_odontologo = id_odontologo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Turno> getListaTurnos() {
        return listaTurnos;
    }

    public void setListaTurnos(List<Turno> listaTurnos) {
        this.listaTurnos = listaTurnos;
    }

    public Usuario getUn_usuario() {
        return un_usuario;
    }

    public void setUn_usuario(Usuario un_usuario) {
        this.un_usuario = un_usuario;
    }

    public Horario getUn_horario() {
        return un_horario;
    }

    public void setUn_horario(Horario un_horario) {
        this.un_horario = un_horario;
    }
    
    
    
}
