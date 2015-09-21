<%-- 
    Document   : AgregarUsuarios
    Created on : 20-sep-2015, 19:42:43
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>AgregarUsuarios</title>
<link href="estilos.css" rel="stylesheet" type="text/css">
<style type="text/css">
body,td,th {
	color: #FFF;
}
</style>
</head>

<body>
<div id="contenedor">
  <div id="banner"><img src="banner.png" width="699" height="120" alt="banner"></div>
  <div id="cintillo"></div>
  <div id="contenido">
    <div id="menu">
     <ul>
        <li><a href="AgregarEstacionClave.jsp">Agregar Estación Clave</a></li>
        <li><a href="AgregarEstacionGeneral.jsp">Agregar Estación General</a></li>
        <li><a href="AsignarRuta.jsp">Asignación de Ruta</a></li>
        <li><a href="AsignarBuses.jsp">Asignación de Buses</a></li>
        <li><a href="AsignarChoferes.jsp">Asignación de Choferes</a></li>
        <li><a href="AgregarUsuarios.jsp">Agregación de Usuarios</a></li>
	<li><a href="Reportes.jsp">Reportes</a></li>
    </ul>
    </div>
    <div id="contenido_principal">
      <h1 class="titulo_inicio">Agregar Usuarios</h1>
      <p>&nbsp;</p>
	  <form action="nuevo.html">
            <p>usuario</p>
			<p><input type="text" name="user" value=""></p>
			<p>Contraseña</p>
			<p><input type="text" name="clave" value=""></p>
			<p>Tipo de Usuario </p>
			<SELECT NAME="selCombo" SIZE=1 onChange="javascript:alert('prueba');"> 
				<OPTION VALUE="link pagina 1">Administrador</OPTION>
				<OPTION VALUE="link pagina 2">Estación Clave</OPTION>
				<OPTION VALUE="link pagina 3">Estación General</OPTION>
				<OPTION VALUE="link pagina 4">Chofer</OPTION> 
			</SELECT> 
			<p>&nbsp;</p>
			<p><input type="button" name="Agregar" value="Agregar"></p>
      </form>
      <div></div>
      <p>&nbsp;</p>
      <p>&nbsp;</p>
      <p><br>
      </p>
    </div>
    <div class="centrado" id="footer">&copy; Página diseñada por Katherine Mishelle Serrano del Cid @2013-14697</div>
  </div>
</div>
</body>
</html>