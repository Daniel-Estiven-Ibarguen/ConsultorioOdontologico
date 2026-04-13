
package com.mycompany.consultorioodontologico.logic;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Odontologo extends Persona implements Serializable{
    
    
    private String especialidad;
    @OneToMany(mappedBy="odonto_turn")
    private List<Turno> listaTurnos;
    @OneToOne
    private Usuario un_usuario;
    @OneToOne
    private Horario un_horario;

    public Odontologo() {
    }

    public Odontologo(String especialidad, List<Turno> listaTurnos, Usuario un_usuario, Horario un_horario, String cedula, String nombre, String apellido, String telefono, String direccion, Date fecha_nacimiento) {
        super(cedula, nombre, apellido, telefono, direccion, fecha_nacimiento);
        this.especialidad = especialidad;
        this.listaTurnos = listaTurnos;
        this.un_usuario = un_usuario;
        this.un_horario = un_horario;
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
