
package com.mycompany.consultorioodontologico.servlets;

import com.mycompany.consultorioodontologico.logic.Controladora;
import com.mycompany.consultorioodontologico.logic.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {
    Controladora control = new Controladora();


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre_usuario");
        String contra = request.getParameter("contra");
        String rol = request.getParameter("rol");
        
        Usuario usu = new Usuario();
        usu.setNombre_usuario(nombre);
        usu.setContrasenia(contra);
        usu.setRol(rol);
        
        control.crearUsuario(usu);
        
        response.sendRedirect("index.jsp");
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
