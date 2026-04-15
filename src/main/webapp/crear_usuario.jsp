<%-- 
    Document   : crear_usuario
    Created on : 13 abr. 2026, 17:20:13
    Author     : danie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="components/header.jsp"%>
<%@ include file="components/body.jsp"%>

<form class="user" action="SvUsuario" method="POST">

    <div class="col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user" name="nombre_usuario"
               placeholder="Nombre de usuario">
    </div>

    <div class="col-sm-6 mb-3"> 
        <input type="text" class="form-control form-control-user" name="contra"
               placeholder="Contraseña">
    </div>

    <div class="col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user" name="rol"
               placeholder="Rol">
    </div>
    
    <button class="btn btn-primary btn-user btn-block col-sm-6 mb-3" type="submit">
        Register Account
    </button>
    <hr>
    
</form>

<%@ include file="components/footer.jsp"%>
