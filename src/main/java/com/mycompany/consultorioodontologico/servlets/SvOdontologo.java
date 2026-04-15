
package com.mycompany.consultorioodontologico.servlets;

import com.mycompany.consultorioodontologico.logic.Controladora;
import com.mycompany.consultorioodontologico.logic.Odontologo;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "SvOdontologo", urlPatterns = {"/SvOdontologo"})
public class SvOdontologo extends HttpServlet {
    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ArrayList<Odontologo> lista_odontologos = new ArrayList();
        lista_odontologos = control.buscarListaOdontologos();
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("lista_odontologos", lista_odontologos);
        
        response.sendRedirect("ver_odontologos.jsp");
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String cedula = request.getParameter("cedula");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        String direccion = request.getParameter("direccion");
        String fecha_nac_str = request.getParameter("fecha_nac");
        String especialidad = request.getParameter("especialidad");
        
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha_nac = null;
        
        try {
            fecha_nac = formato.parse(fecha_nac_str);
        } catch (ParseException ex) {
            Logger.getLogger(SvOdontologo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Odontologo odonto = new Odontologo();
        odonto.setCedula(cedula);
        odonto.setNombre(nombre);
        odonto.setApellido(apellido);
        odonto.setTelefono(telefono);
        odonto.setDireccion(direccion);
        odonto.setFecha_nacimiento(fecha_nac);
        odonto.setEspecialidad(especialidad);
        
        control.crearOdontologo(odonto);

        
        response.sendRedirect("index.jsp");
        

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
