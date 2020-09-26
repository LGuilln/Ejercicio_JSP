<%-- 
    Document   : index
    Created on : 25/09/2020, 19:23:35
    Author     : lguilln
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<HTML>     
    <%@ include file = "Header.html" %>     
    <BODY> 
        <%-- utilizaremos una estructura IF para tener una pagina dinamica--%>
        <%-- UTILIZAMOS SCRIPTLET--%>
        <% if(request.getAttribute("Resultado") == null) {%>
       

    <CENTER>     
        <H1>Calculadora JSP</H1>
        <H2>201744792</H2>
        <H3>Seleccioné las Operaciones que desea</H3>

    </CENTER>   
    <FORM METHOD="GET" ACTION="logica">  
        <DIV class="div">

            <P>     
                Primer Digito: <input type="number" step="0.01" name="n1" placeholder="Ingresar Numero 1" required>

            <P>     
                Segundo Digito: <input type="number" step="0.01" name="n2" placeholder="Ingresar Numero 2" required>   

            <P>     
                <input type="radio" name="suma" value="1" /> - Sumar

            <P>     
                <input type="radio" name="resta" value="2" /> - Restar 

            <P>     
                <input type="radio" name="multiplicacion" value="3" /> - Multiplicar

            <P>     
                <input type="radio" name="mayor" value="5" /> - Obtener el Numero Mayor

            <P>     
                <input type="radio" name="potencia" value="6" /> - Potencia de n1^n2

            <P>     
                <input type="radio" name="binario" value="7" /> - Valor Binario de los Numeros

        </DIV>
        <CENTER>
            <P>     
                <input type="submit" value="Calcular">
                <input type="reset" value="Nueva Operacion" onclick="unselect()">
        </CENTER>

    </FORM>
    <% }else{ %>
    
    <CENTER>     
        <H1>Ejercicio JSP</H1> 
        <H3>Valores Calculados:</H3>

        <%=(String) request.getAttribute("Resultado")%>
    </CENTER>  
    <% } %>
</BODY>    
</HTML>  