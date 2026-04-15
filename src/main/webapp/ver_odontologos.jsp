<%-- 
    Document   : ver_odontologos
    Created on : 14 abr. 2026, 18:49:46
    Author     : danie
--%>

<%@page import="com.mycompany.consultorioodontologico.logic.Odontologo"%>
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
                        <th>Cedula</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Teléfono</th>
                        <th>Dirección</th>
                        <th>Especialidad</th>
                    </tr>
                </thead>
                <tfoot>
                    <tr>
                        <th>Cedula</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Teléfono</th>
                        <th>Dirección</th>
                        <th>Especialidad</th>
                    </tr>
                </tfoot>
                
                <% ArrayList<Odontologo> lista_odonto = (ArrayList) request.getSession().getAttribute("lista_odontologos");%>
                <tbody>
                    
                    <%
                    if(lista_odonto == null){%>
                        <h3>La lista en nula</h3>
                        
                    <%} else if(lista_odonto.isEmpty()){%>
                    <h3>La lista esta vacia</h3>
                    
                    <%}%>
                    
                    <%for(Odontologo odon: lista_odonto){
                    %>
                    <tr>
                        <td><%= odon.getCedula()%></td>
                        <td><%= odon.getNombre()%></td>
                        <td><%= odon.getApellido()%></td>
                        <td><%= odon.getTelefono()%></td>
                        <td><%= odon.getDireccion()%></td>
                        <td><%= odon.getEspecialidad()%></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </div>
</div>



<%@ include file="components/footer.jsp"%>
