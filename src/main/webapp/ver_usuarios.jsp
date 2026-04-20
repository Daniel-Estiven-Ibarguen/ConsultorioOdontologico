<%-- 
    Document   : ver_usuarios
    Created on : 15 abr. 2026, 07:26:53
    Author     : danie
--%>

<%@page import="com.mycompany.consultorioodontologico.logic.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="components/header.jsp"%>
<%@ include file="components/body.jsp"%>

<div class="card shadow mb-4">
    <div class="card-header py-3">
        <h6 class="m-0 font-weight-bold text-primary">DataTables Example</h6>
    </div>
    <div class="card-body">
        <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Nombre de usuario</th>
                        <th>Rol</th>
                        <th style="width: 210px">Acción</th>
                    </tr>
                </thead>
                <tfoot>
                    <tr>
                        <th>Id</th>
                        <th>Nombre de usuario</th>
                        <th>Rol</th>
                        <th style="width: 210px">Acción</th>
                    </tr>
                </tfoot>
                
                <tbody>
                    
                    <% ArrayList<Usuario> lista = (ArrayList) request.getSession().getAttribute("lista_usuarios");
                    
                    for(Usuario usu:lista){
                    %>

                    <tr>
                        <td><%= usu.getId_usuario()%></td>
                        <td><%= usu.getNombre_usuario()%></td>
                        <td><%= usu.getRol()%></td>
                        <td style="display: flex; width: 230px">
                            <form name="eliminar" action="SvEliminarUsuario" method="POST">
                                <button type="submit" class="btn btn-primary btn-user btn-block"
                                        style="background-color:red; margin-right: 5px">
                                    <i class="fas fa-trash-alt"></i>Eliminar
                                </button>
                                <input type="hidden" name="id" value="<%=usu.getId_usuario()%>">
                            </form>
                            <form name="editar" action="SvEditarUsuario" method="POST">
                                <button type="submit" class="btn btn-primary btn-user btn-block"
                                        style="background-color:blue; margin-left: 5px">
                                    <i class="fas fa-pencil-alt"></i>Editar
                                </button>
                                <input type="hidden" name="id" value="<%=usu.getId_usuario()%>">
                            </form>
                        </td>
                    </tr>
                    
                    <%}%>
                </tbody>
            </table>
        </div>
    </div>
</div>



<%@ include file="components/footer.jsp"%>
