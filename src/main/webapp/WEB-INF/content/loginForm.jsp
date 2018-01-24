<%-- 
    Document   : loginForm
    Created on : Jan 24, 2018, 2:18:11 PM
    Author     : james
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="loginPage"/></title>
    </head>
    <body>

        <s:form action="login">
            <s:textfield name="username" key="user"/>
            <s:textfield name="password" key="pass"/>
            <s:submit key="login"/>
        </s:form>

    </body>
</html>
