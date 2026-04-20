package com.mycompany.consultorioodontologico.persistence;

import com.mycompany.consultorioodontologico.logic.Horario;
import com.mycompany.consultorioodontologico.logic.Odontologo;
import com.mycompany.consultorioodontologico.logic.Paciente;
import com.mycompany.consultorioodontologico.logic.Responsable;
import com.mycompany.consultorioodontologico.logic.Secretario;
import com.mycompany.consultorioodontologico.logic.Turno;
import com.mycompany.consultorioodontologico.logic.Usuario;
import com.mycompany.consultorioodontologico.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    HorarioJpaController horaJpa = new HorarioJpaController();
    OdontologoJpaController odontoJpa = new OdontologoJpaController();
    PacienteJpaController pacienteJpa = new PacienteJpaController();
    PersonaJpaController persoJpa = new PersonaJpaController();
    ResponsableJpaController responsableJpa = new ResponsableJpaController();
    SecretarioJpaController secretarioJpa = new SecretarioJpaController();
    TurnoJpaController turnoJpa = new TurnoJpaController();
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();

    public void crearHorario(Horario horari) {
        horaJpa.create(horari);
    }

    public void editarHorario(Horario horari) {
        try {
            horaJpa.edit(horari);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarHorario(int id) {
        try {
            horaJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Horario buscarHorario(int id) {
        return horaJpa.findHorario(id);
    }
    
    

    public void crearOdontologo(Odontologo odonto) {
        odontoJpa.create(odonto);
    }

    public void editarOdontologo(Odontologo odonto) {
        try {
            odontoJpa.edit(odonto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarOdontologo(int id) {
        try {
            odontoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Odontologo buscarOdontologo(int id) {
        return odontoJpa.findOdontologo(id);
    }

    public ArrayList<Odontologo> buscarListaOdontologos() {
        
        List<Odontologo> lista = odontoJpa.findOdontologoEntities();
        ArrayList<Odontologo> lista_final = new ArrayList<> (lista);
        
        return lista_final;
    }
    
    

    public void crearPaciente(Paciente paciente) {
        pacienteJpa.create(paciente);
    }

    public void editarPaciente(Paciente paciente) {
        try {
            pacienteJpa.edit(paciente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPaciente(int id) {
        try {
            pacienteJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Paciente buscarPaciente(int id) {
        return pacienteJpa.findPaciente(id);
    }

    public void crearResponsable(Responsable responsable) {
        responsableJpa.create(responsable);
    }

    public void editarResponsable(Responsable responsable) {
        try {
            responsableJpa.edit(responsable);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarResponsable(int id) {
        try {
            responsableJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Responsable buscarResponsable(int id) {
        return responsableJpa.findResponsable(id);
    }

    public void crearSecretario(Secretario secretario) {
        secretarioJpa.create(secretario);
    }

    public void editarSecretario(Secretario secretario) {
        secretarioJpa.create(secretario);
    }

    public void eliminarSecretario(int id) {
        try {
            secretarioJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Secretario buscarSecretario(int id) {
        return secretarioJpa.findSecretario(id);
    }

    public void crearTurno(Turno turno) {
        turnoJpa.create(turno);
    }

    public void editarTurno(Turno turno) {
        try {
            turnoJpa.edit(turno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarTurno(int id) {
        try {
            turnoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Turno buscarTurno(int id) {
        return turnoJpa.findTurno(id);
    }

    public void crearUsuario(Usuario usuario) {
        usuarioJpa.create(usuario);
    }

    public void editarUsuario(Usuario usuario) {
        try {
            usuarioJpa.edit(usuario);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarUsuario(int id) {
        try {
            usuarioJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario buscarUsuario(int id) {
        return usuarioJpa.findUsuario(id);
    }

    public ArrayList<Usuario> buscarListaUsuarios() {
        
        List<Usuario> primera = usuarioJpa.findUsuarioEntities();
        ArrayList<Usuario> lista_final = new ArrayList<> (primera);
        
        return lista_final;
    }

}
