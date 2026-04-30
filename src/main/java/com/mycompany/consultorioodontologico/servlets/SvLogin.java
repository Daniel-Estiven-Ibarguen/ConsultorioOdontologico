package com.mycompany.consultorioodontologico.servlets;

import com.mycompany.consultorioodontologico.logic.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvLogin", urlPatterns = {"/SvLogin"})
public class SvLogin extends HttpServlet {

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
        String contra = request.getParameter("contrasenia");

        boolean validacion;
        validacion = control.comprobarUsuario(nombre, contra);

        if (validacion == true) {

            HttpSession misesion = request.getSession(true);
            misesion.setAttribute("usuario", nombre);
            response.sendRedirect("index.jsp");

        }else{
            
            response.sendRedirect("no_login.jsp");
            
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
