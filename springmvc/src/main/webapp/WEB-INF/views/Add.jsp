<%@page import="javax.swing.plaf.metal.MetalBorders.Flush3DBorder"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <jsp:include page="NavBar.jsp"/>
    <% String msg = (String)request.getAttribute("msg"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management</title>
</head>
<body>
          <div align="center">

            <form action="./add" method="post">
            <fieldset>
            <legend>ADD EMPLOYEE</legend>
            <table>
            <tr>
            <td>Name</td>
            <td><input type="text" name="name"></td>
            </tr>
            
             <tr>
            <td>EMAIL</td>
            <td><input type="text" name="email"></td>
            </tr>
            
             <tr>
            <td>CONTACT</td>
            <td><input type="text" name="contact"></td>
            </tr>
            
             <tr>
            <td>DESGINATION</td>
            <td><input type="text" name="desgination"></td>
            </tr>
            
             <tr>
            <td>SALARY</td>
            <td><input type="text" name="salary"></td>
            </tr>
            </table>
            </fieldset>
           <input type="submit" value="Add"> 
             
             <%
             if(msg !=null) { 
             %>
             
              <h3><%=msg %></h3>
             
             <%
             } 
             %>
            </form>

</div>
</body>
</html>