
package com.mycompany.consultorioodontologico.logic;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Turno implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_turno;
    @Temporal(TemporalType.DATE)
    private Date fecha_turno;
    private String hora_tuno;
    @ManyToOne
    @JoinColumn(name="odonto_turn")
    private Odontologo odonto;
    @ManyToOne
    @JoinColumn(name="paciente_turno")
    private Paciente paci;

    public Turno() {
    }

    public Turno(int id_turno, Date fecha_turno, String hora_tuno) {
        this.id_turno = id_turno;
        this.fecha_turno = fecha_turno;
        this.hora_tuno = hora_tuno;
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public Date getFecha_turno() {
        return fecha_turno;
    }

    public void setFecha_turno(Date fecha_turno) {
        this.fecha_turno = fecha_turno;
    }

    public String getHora_tuno() {
        return hora_tuno;
    }

    public void setHora_tuno(String hora_tuno) {
        this.hora_tuno = hora_tuno;
    }
    
    
}
