<%-- 
    Document   : welcome
    Created on : Jan 24, 2018, 2:22:53 PM
    Author     : james
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="succPage"/></title>
    </head>
    <body>

        <s:text name="succTip">
            <s:param >${sessionScope.user}</s:param>
        </s:text>
        
    </body>
</html>
