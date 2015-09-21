<%-- 
    Document   : menu
    Created on : 19-sep-2015, 20:55:46
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Proyecto EDD</title>
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
        <li><a href="index.jsp">Inicio</a></li>
        <li><a href="menu.jsp">Información</a></li>
        <li><a href="contacto.jsp">Datos</a></li>
      </ul>
    </div>
    <div id="contenido_principal">
      <h1 class="titulo_inicio">Información</h1>
      
      <h4>ECYS-EDD2015:</h4>
      <p>&nbsp;</p>
      <p><img src="logo fiusac.png" width="276" height="182" alt="chocolate"></p>
      <p>&nbsp;</p>
      <p align = center>La Municipalidad de Guatemala le pide a la universidad de san Calos que le automatice el sistema de transmetro
	  para generar un mejor control de sus estaciones, buses y paradas. Al ver los requerimientos que desea se dio una 
	  lista de pasos que él desea, uno de los requerimientos es que sea versión Web y tiene dos servidores web con Java implementado,
	  y quieren que estén en estos servidores la página web y un web service. 
	  También por cuestiones de rapidez quieren que todo esté en memoria no importando que le toque que perder los datos. </p>
      <p><br>
      </p>
    </div>
    <div class="centrado" id="footer"> &copy; Página Diseñada por Katherine Mishelle Serrano del Cid    </div>
  </div>
</div>
</body>
</html>
