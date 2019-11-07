<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 08/11/2019
  Time: 00:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="web.CreditModel" %>
<% CreditModel model = (CreditModel) request.getAttribute("model"); %>
<html>
<head>
    <title>Resultat</title>
</head>
<body>
    Mensualite= <%=model.getMensualite() %> Dhs
</body>
</html>
