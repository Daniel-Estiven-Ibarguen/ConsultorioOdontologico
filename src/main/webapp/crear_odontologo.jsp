<%-- 
    Document   : crear_odontologo
    Created on : 13 abr. 2026, 17:03:07
    Author     : danie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="components/header.jsp"%>
<%@ include file="components/body.jsp"%>



<form action="SvOdontologo" method="POST" class="user">

    <div class="col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user" name="cedula" id="cedula"
               placeholder="Cédula">
    </div>
    
    <div class="col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user" name="nombre" id="nombre"
               placeholder="Nombre">
    </div>

    <div class="col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user" name="apellido" id="apellido"
               placeholder="Apellido">
    </div>

    <div class="col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user"
               id="telefono" name="telefono" placeholder="Teléfono">
    </div>
    
    <div class="col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user"
               id="direccion" name="direccion" placeholder="Dirección">
    </div>
    
    <div class="col-sm-6 mb-3">
        <input type="date" class="form-control form-control-user"
               id="fecha_nac" name="fecha_nac" placeholder="Fecha nacimiento">
    </div>

    <div class="col-sm-6 mb-3">
        <input type="text" class="form-control form-control-user"
               id="especialidad" name="especialidad" placeholder="Especialidad">
    </div>

    <button type="submit" class="btn btn-primary btn-user btn-block col-sm-6 mb-3">
        Registrar odontólogo
    </button>
    <hr>
</form>
<hr>

<%@ include file="components/footer.jsp"%>

