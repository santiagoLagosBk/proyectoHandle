<%--
  Created by IntelliJ IDEA.
  User: Hogar
  Date: 23/6/2020
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        //Show the error if the credentials are incorrect
        if(request.getAttribute("error")!=null){%>
    <%= request.getAttribute("error")%><br>
    <%
        }
    %>

    <h2>welcome</h2>

    <form action="ServletLogin" method="post">
        <label>User</label>
         <input type="text" name="userName">
        <label>Password</label>
         <input type="password" name="userPass">
         <input type="submit" value="submit">
    </form>
</body>
</html>
