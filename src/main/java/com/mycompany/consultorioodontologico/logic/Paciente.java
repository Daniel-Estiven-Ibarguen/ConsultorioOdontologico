
package com.mycompany.consultorioodontologico.logic;

import java.util.Date;
import java.util.List;

public class Paciente extends Persona {
    
    private int id_paciente;
    private String tipo_sangre;
    private Responsable un_responsable;
    private List<Turno> lista_turnos;

    public Paciente() {
    }

    public Paciente(int id_paciente, String tipo_sangre, Responsable un_responsable, List<Turno> lista_turnos, String cedula, String nombre, String apellido, String telefono, String direccion, Date fecha_nacimiento) {
        super(cedula, nombre, apellido, telefono, direccion, fecha_nacimiento);
        this.id_paciente = id_paciente;
        this.tipo_sangre = tipo_sangre;
        this.un_responsable = un_responsable;
        this.lista_turnos = lista_turnos;
    }

    public Responsable getUn_responsable() {
        return un_responsable;
    }

    public void setUn_responsable(Responsable un_responsable) {
        this.un_responsable = un_responsable;
    }

    public List<Turno> getLista_turnos() {
        return lista_turnos;
    }

    public void setLista_turnos(List<Turno> lista_turnos) {
        this.lista_turnos = lista_turnos;
    }



    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }
    
    
    
}
