<%-- 
    Document   : AsignarBuses
    Created on : 20-sep-2015, 19:42:04
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>AsignarBuses</title>
<link href="estilos.css" rel="stylesheet" type="text/css">
<style type="text/css">
body,td,th {
	color: #FFF;
}
</style>
</head>

<body>
    <form action="AsignarBuses.jsp" method="post">
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
        <h1 class="titulo_inicio">Asignar Buses</h1>
        <p>&nbsp;</p>
                <p>Número de Bus:</p>
		<p><input type="text" name="user" value=""></p>
		<p><input type="button" name="Agregar" value="Agregar"></p>
                
        <%-- start web service invocation --%><hr/>
        <%
        String user = request.getParameter("user");
        try {
        if(user!= null){
	com.prueba.beans.WService_Service service = new com.prueba.beans.WService_Service();
	com.prueba.beans.WService port = service.getWServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String bus = user;
	// TODO process result here
	java.lang.String result = port.agregarBus(bus);
	out.println(" "+result);
        }
        } catch (Exception ex) {
	// TODO handle custom exceptions here
        }
        %>
        <%-- end web service invocation --%><hr/>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p><br>
        </p>
    </div>
    <div class="centrado" id="footer">&copy; Página diseñada por Katherine Mishelle Serrano del Cid @2013-14697</div>
    </div>
    </div>
    </form>
</body>
</html>