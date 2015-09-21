<%-- 
    Document   : index
    Created on : 19-sep-2015, 19:56:35
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="sesion" scope="page" class="Client.prueba" />
<html>
<head>
<meta charset="utf-8">
<title>Proyecto edd</title>
<link href="estilos.css" rel="stylesheet" type="text/css">
<style type="text/css">
body,td,th {
	color: #FFF;
}
</style>
</head>

<body>
    <%
            String user = request.getParameter("user");
            String contra = request.getParameter("contra");
            String administrador = request.getParameter("admins");
            
            if(user != null && contra != null)
            {
                if(user.equals(sesion.getUsuario()))
                {
                    if(contra.equals(sesion.getContraseña()))
                    {
                        if(administrador.equals(sesion.getTipo())){
                            session.setAttribute("sesion", user);
                            response.sendRedirect("AgregarEstacionClave.jsp");  
                        }
                        else
                        {
                          out.println("<h2>El usuario o Contraseña no coincide</h2>");  
                        }
                    }
                    else
                    {
                        out.println("<h2>El usuario o Contraseña no coincide</h2>");
                    }
                }
                else
                {
                    out.println("<h2>El usuario o Contraseña no coincide</h2>");
                }
            }
            else
            {
                
            }
        %>
<div id="contenedor">
  <div id="banner"><img src="banner.png" width="699" height="120" alt="banner"></div>
  <div id="cintillo"></div>
  <div id="contenido">
    <div id="menu">
      <ul>
        <li><a href="index.jsp">Inicio</a></li>
        <li><a href="menu.jsp">Información</a></li>
        <li><a href="contacto.jsp">Datos</a></li>
      </ul>
    </div>
    <div id="contenido_principal">
      <h1 class="titulo_inicio">Inicio</h1>
            <form action="index.jsp">
                        <p>Usuario</p><input type="text" name="user" value="" />
                        <p>Contraseña</p><input type="password" name="contra" value="" />
                        <p>Tipo de Usuario:</p>
                        <select name="admins" size="1">
                            <option>Administrador</option>
                            <option>Estacion Clave</option>
                            <option>Estacion General</option>
                            <option>Chofer</option>
                        </select>
			<p><input type="submit" value="Ingresar"></p>
			<p>&nbsp;</p>                    
			<p>&nbsp;</p>
			<p>&nbsp;</p>
            </form>
    </div>
    <div class="centrado" id="footer">&copy; Página diseñada por Katherine Mishelle Serrano del Cid</div>
  </div>
</div>
</body>
</html>
