
<%@page import="com.mycompany.consultorioodontologico.logic.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="components/header.jsp"%>
<%@ include file="components/body.jsp"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar usuario</title>
    </head>
    <body>

        <% Usuario usu = (Usuario) request.getSession().getAttribute("usuario_editar");%>

        <h1>Editar usuario</h1>
        <form class="user" action="SvEditarUsuario" method="POST">
           
            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" name="nombreEditar"
                       value="<%=usu.getNombre_usuario()%>">
            </div>

            <div class="col-sm-6 mb-3"> 
                <input type="password" class="form-control form-control-user" name="contraseniaEditar"
                       value="<%=usu.getContrasenia()%>">
            </div>

            <div class="col-sm-6 mb-3">
                <input type="text" class="form-control form-control-user" name="rolEditar"
                       value="<%=usu.getRol()%>">
            </div>
            <button class="btn btn-primary btn-user btn-block col-sm-6 mb-3" type="submit">
                Guardar cambios
            </button>
        </form>

    </body>
</html>


<%@ include file="components/footer.jsp"%>