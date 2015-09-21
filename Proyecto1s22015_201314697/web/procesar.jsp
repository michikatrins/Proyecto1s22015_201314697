<%-- 
    Document   : procesar
    Created on : 19-sep-2015, 18:28:42
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <%-- start web service invocation --%><hr/>
    <%
    try {
        String hola = request.getParameter("user");
	ws.WService_Service service = new ws.WService_Service();
	ws.WService port = service.getWServicePort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = "Amore";
	// TODO process result here
	java.lang.String result = port.hello(hola);
	out.println("Result = "+result);
    }catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
