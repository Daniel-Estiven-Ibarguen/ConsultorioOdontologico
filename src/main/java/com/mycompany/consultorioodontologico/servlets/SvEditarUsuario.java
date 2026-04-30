package com.mycompany.consultorioodontologico.servlets;

import com.mycompany.consultorioodontologico.logic.Controladora;
import com.mycompany.consultorioodontologico.logic.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEditarUsuario", urlPatterns = {"/SvEditarUsuario"})
public class SvEditarUsuario extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        Usuario usu = control.buscarUsuario(id);

        HttpSession misesion = request.getSession();
        misesion.setAttribute("usuario_editar", usu);

        response.sendRedirect("editar_usuario.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombreEditar");
        String contra = request.getParameter("contraseniaEditar");
        String rol = request.getParameter("rolEditar");
        
        Usuario usu = (Usuario) request.getSession().getAttribute("usuario_editar");
        
        usu.setNombre_usuario(nombre);
        usu.setContrasenia(contra);
        usu.setRol(rol);
        
        control.editarUsuario(usu);
        
        response.sendRedirect("ver_usuarios.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
