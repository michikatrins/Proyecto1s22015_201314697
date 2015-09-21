<%-- 
    Document   : action
    Created on : 20-sep-2015, 21:03:19
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>

    <%-- start web service invocation --%><hr/>
    <%
        String user = request.getParameter("user");
        
    try {
	com.prueba.beans.WService_Service service = new com.prueba.beans.WService_Service();
	com.prueba.beans.WService port = service.getWServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String bus = "20";
	// TODO process result here
	java.lang.String result = port.agregarBus(bus);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
