
package com.mycompany.consultorioodontologico.logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Responsable extends Persona implements Serializable{
    
    
    private String tipo_responsable;

    public Responsable() {
    }

    public Responsable(String tipo_responsable, String cedula, String nombre, String apellido, String telefono, String direccion, Date fecha_nacimiento) {
        super(cedula, nombre, apellido, telefono, direccion, fecha_nacimiento);
        this.tipo_responsable = tipo_responsable;
    }

    
    public String getTipo_responsable() {
        return tipo_responsable;
    }

    public void setTipo_responsable(String tipo_responsable) {
        this.tipo_responsable = tipo_responsable;
    }
    
    
}
