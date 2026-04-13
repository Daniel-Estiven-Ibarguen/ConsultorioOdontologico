
package com.mycompany.consultorioodontologico.logic;

import com.mycompany.consultorioodontologico.persistence.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    //Crud horario
    public void crearHorario(Horario horari){
        controlPersis.crearHorario(horari);
    }
    
    public void editarHorario(Horario horari){
        controlPersis.editarHorario(horari);
    }
    
    public void eliminarHorario(int id){
        controlPersis.eliminarHorario(id);
    }
    
    public Horario buscarHorario(int id){
        return controlPersis.buscarHorario(id);
    }
    
    //Crud odontologo
    public void crearOdontologo(Odontologo odonto){
        controlPersis.crearOdontologo(odonto);
    }
    
    public void editarOdontologo(Odontologo odonto){
        controlPersis.editarOdontologo(odonto);
    }
    
    public void eliminarOdontologo(int id){
        controlPersis.eliminarOdontologo(id);
    }
    
    public Odontologo buscarOdontologo(int id){
        return controlPersis.buscarOdontologo(id);
    }
    
    //Crud paciente
    public void crearPaciente(Paciente paciente){
        controlPersis.crearPaciente(paciente);
    }
    
    public void editarPaciente(Paciente paciente){
        controlPersis.editarPaciente(paciente);
    }
    
    public void eliminarPaciente(int id){
        controlPersis.eliminarPaciente(id);
    }
    
    public Paciente buscarPaciente(int id){
        return controlPersis.buscarPaciente(id);
    }
    
    //Crud responsable
    public void crearResponsable(Responsable responsable){
        controlPersis.crearResponsable(responsable);
    }
    
    public void editarResponsable(Responsable responsable){
        controlPersis.editarResponsable(responsable);
    }
    
    public void eliminarResponsable(int id){
        controlPersis.eliminarResponsable(id);
    }
    
    public Responsable buscarResponsable(int id){
        return controlPersis.buscarResponsable(id);
    }
    
    //Crud secretario
    public void crearSecretario(Secretario secretario){
        controlPersis.crearSecretario(secretario);
    }
    
    public void editarSecretario(Secretario secretario){
        controlPersis.editarSecretario(secretario);
    }
    
    public void eliminarSecretario(int id){
        controlPersis.eliminarSecretario(id);
    }
    
    public Secretario buscarSecretario(int id){
        return controlPersis.buscarSecretario(id);
    }
    
    
    //Crud turno
    public void crearTurno(Turno turno){
        controlPersis.crearTurno(turno);
    }
    
    public void editarTurno(Turno turno){
        controlPersis.editarTurno(turno);
    }
    
    public void eliminarTurno(int id){
        controlPersis.eliminarTurno(id);
    }
    
    public Turno buscarTurno(int id){
        return controlPersis.buscarTurno(id);
    }
    
    
    //Crud usuario
    public void crearUsuario(Usuario usuario){
        controlPersis.crearUsuario(usuario);
    }
    
    public void editarUsuario(Usuario usuario){
        controlPersis.editarUsuario(usuario);
    }
    
    public void eliminarUsuario(int id){
        controlPersis.eliminarUsuario(id);
    }
    
    public Usuario buscarUsuario(int id){
        return controlPersis.buscarUsuario(id);
    }
    
}
